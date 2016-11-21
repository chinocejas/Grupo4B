/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entidades.Puesto;
import Entidades.RaEliminacion;
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
    public void save(RaEliminacion raEliminacion) throws DataAccessLayerException {
         try {
            startOperation();
            
            //guarda la instancia
            session.persist(raEliminacion);
            
            //se coloca la clave foranea donde corresponde (depende de si se borra un puesto, competencia,...
            int idRaEliminacion= raEliminacion.getIdRaEliminacion();
            Puesto puesto= (Puesto) raEliminacion.getObjetoEliminado();
            int idPuesto = puesto.getIdPuesto();

            Query query=session.createQuery("UPDATE RaEliminacion SET id_puesto = :idPuesto WHERE id_ra_eliminacion = :idRaEliminacion");    
            query.setParameter("idPuesto", idPuesto);
            query.setParameter("idRaEliminacion", idRaEliminacion);
            query.executeUpdate();
            
            tx.commit();
        } catch (HibernateException e) {
            handleException(e);
        } finally {
            HibernateFactory.close(session);
        }
 
         
        // https://docs.jboss.org/hibernate/orm/3.5/reference/es-ES/html/batch.html
        // 14.4. Operaciones de estilo DML
         
        try {
            startOperation();
           
            int idRaEliminacion= raEliminacion.getIdRaEliminacion();
            Puesto puesto= (Puesto) raEliminacion.getObjetoEliminado();
            int idPuesto = puesto.getIdPuesto();

            Query query=session.createQuery("UPDATE RaEliminacion SET id_puesto = :idPuesto WHERE id_ra_eliminacion = :idRaEliminacion");    
            query.setParameter("idPuesto", idPuesto);
            query.setParameter("idRaEliminacion", idRaEliminacion);
            query.executeUpdate();
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
    public void update(RaEliminacion raEliminacion) throws DataAccessLayerException {
        super.update(raEliminacion);
    }

    /**
     * Delete a detached Usuario from the database.
     * @param usuario
     */
    public void delete(RaEliminacion raEliminacion) throws DataAccessLayerException {
        super.delete(raEliminacion);
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
}
