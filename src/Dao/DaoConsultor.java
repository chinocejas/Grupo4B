/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entidades.Consultor;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;


/**
 *
 * @author Rolando
 */
public class DaoConsultor extends AbstractDao {

    public DaoConsultor() {
        super();
    }

    /**
     * Insert a new Usuario into the database.
     * @param usuario
     */
    public void save(Consultor consultor) throws DataAccessLayerException {
        super.save(consultor);
    }

    /**
     * Updates a new Usuario into the database.
     * @param usuario
     */
    public void update(Consultor consultor) throws DataAccessLayerException {
        super.update(consultor);
    }

    /**
     * Delete a detached Usuario from the database.
     * @param usuario
     */
    public void delete(Consultor consultor) throws DataAccessLayerException {
        super.delete(consultor);
    }

    /**
     * Find an Event by its primary key.
     * @param id
     * @return
     */
    public Consultor find(Long id) throws DataAccessLayerException {
        return (Consultor) super.find(Consultor.class, id);
    }

    /**
     * Lista todos los usuarios de la base de datos
     * @return
     */
    public List findAll() throws DataAccessLayerException {
        return super.findAll(Consultor.class);
    }

    public Consultor buscarConsultor(int idConsultor) {
        Consultor consultor=null;
        try {
            startOperation();
            
          Query query = session.createQuery("from Consultor where id_consultor= :idConsultor");
          query.setParameter("idConsultor", idConsultor);
          
          consultor = (Consultor) query.uniqueResult();
            tx.commit();
        } catch (HibernateException e) {
            handleException(e);
        } finally {
            HibernateFactory.close(session);
        }
        return consultor;
    }
}
