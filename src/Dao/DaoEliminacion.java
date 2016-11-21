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
            session.persist(raEliminacion);
            tx.commit();
        } catch (HibernateException e) {
            handleException(e);
        } finally {
            HibernateFactory.close(session);
        }
         
        

        /*String hqlUpdate = "update Customer c set c.name = :newName where c.name = :oldName";
// or String hqlUpdate = "update Customer set name = :newName where name = :oldName";
        int updatedEntities = s.createQuery(hqlUpdate)
               
                .executeUpdate();
        tx.commit();
        session.close();
         */
         
        try {
            startOperation();
           
            int idRaEliminacion= raEliminacion.getIdRaEliminacion();
            System.out.print("idRaeliminacion  "  + idRaEliminacion);
            Puesto puesto= (Puesto) raEliminacion.getObjetoEliminado();
            int idPuesto = puesto.getIdPuesto();
            System.out.print("\n\nidpuesto "  + idPuesto);
            Query query=session.createQuery("UPDATE ra_eliminacion SET id_puesto = 4 WHERE id_ra_eliminacion = 9");
            query.executeUpdate();
            //query.setParameter("idPuesto", idPuesto);
            //query.setParameter("idRaEliminacion", idRaEliminacion);
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
