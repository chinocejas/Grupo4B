/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entidades.Competencia;
import Entidades.Puesto;
import Entidades.RaEliminacion;
import static java.lang.Boolean.TRUE;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;

/**
 *
 * @author Rolando
 */
public class DaoEliminacion extends AbstractDao {

    public DaoEliminacion() {
        super();
    }

    /**
     * Insert a new Usuario into the database.
     * @param usuario
     */
    public void saveRaEliminacion(RaEliminacion raEliminacion) throws DataAccessLayerException {
         try {
            startOperation();
            
            //guarda la instancia
            session.persist(raEliminacion);
            
            //se coloca la clave foranea donde corresponde (depende de si se borra un puesto, competencia,...
            int idRaEliminacion= raEliminacion.getIdRaEliminacion();
            Query query;
            switch(raEliminacion.getObjetoBorrado()){
                 case "PUESTO":
                     Puesto puesto = (Puesto) raEliminacion.getObjetoEliminado();
                     int idPuesto = puesto.getIdPuesto();

                     query = session.createQuery("UPDATE RaEliminacion SET id_puesto = :idPuesto WHERE id_ra_eliminacion = :idRaEliminacion");
                     query.setParameter("idPuesto", idPuesto);
                     query.setParameter("idRaEliminacion", idRaEliminacion);
                     query.executeUpdate();
                     break;
                 case "COMPETENCIA":
                     Competencia competencia = (Competencia) raEliminacion.getObjetoEliminado();
                     int idCompetencia = competencia.getIdCompetencia();

                     query = session.createQuery("UPDATE RaEliminacion SET id_competencia = :idCompetencia WHERE id_ra_eliminacion = :idRaEliminacion");
                     query.setParameter("idCompetencia", idCompetencia);
                     query.setParameter("idRaEliminacion", idRaEliminacion);
                     query.executeUpdate();
                     break;
                     
                     //completar para todo lo que se puede borrar y probar!
                 case "FACTOR":
                     break;
                     
                     //case opc-respuesta
                     //case pregunta
                     
             }

            tx.commit();
        } catch (HibernateException e) {
            handleException(e);
        } finally {
            HibernateFactory.close(session);
        }
    }

    /**
     * Updates a new Usuario into the database.
     * @param usuario
     */
    public void update(Object obj) throws DataAccessLayerException {
        super.update(obj);
    }

  

    /**
     * Find an Event by its primary key.
     * @param id
     * @return
     */
    public RaEliminacion find(Long id) throws DataAccessLayerException {
        return (RaEliminacion) super.find(RaEliminacion.class, id);
    }
    
    
    /**
     * Lista todos los usuarios de la base de datos
     * @return
     */
    public List findAll() throws DataAccessLayerException {
        return super.findAll(RaEliminacion.class);
    }

    public void deleteLogicPuesto(Puesto puesto, RaEliminacion raEliminacion) {
        update(puesto);
        saveRaEliminacion(raEliminacion);
        
    }
}
