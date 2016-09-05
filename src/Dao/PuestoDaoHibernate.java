/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entidades.Puesto;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;


/**
 *
 * @author Rolando
 */
public class PuestoDaoHibernate extends AbstractDao {

    public PuestoDaoHibernate() {
        super();
    }

    /**
     * Insert a new Usuario into the database.
     * @param usuario
     */
    public void save(Puesto puesto) throws DataAccessLayerException {
        super.save(puesto);
    }

    /**
     * Updates a new Usuario into the database.
     * @param usuario
     */
    public void update(Puesto puesto) throws DataAccessLayerException {
        super.update(puesto);
    }

    /**
     * Delete a detached Usuario from the database.
     * @param usuario
     */
    public void delete(Puesto puesto) throws DataAccessLayerException {
        super.delete(puesto);
    }

    /**
     * Find an Event by its primary key.
     * @param id
     * @return
     */
    public Puesto find(Long id) throws DataAccessLayerException {
        return (Puesto) super.find(Puesto.class, id);
    }
    
    //agregado por el negro
    public List findPorCodigoAndPuestoAndEmpresa(int codigo, String puesto, String empresa) throws DataAccessLayerException {
        List objects = null;
        try {
            startOperation();
            
          Query query = session.createQuery("from Consultor where codigo= :codigo AND puesto= :puesto AND empresa= :empresa");
          query.setParameter("codigo", codigo);
          query.setParameter("puesto", puesto);
          query.setParameter("empresa", empresa);
          objects = query.list();
            tx.commit();
        } catch (HibernateException e) {
            handleException(e);
        } finally {
            HibernateFactory.close(session);
        }
        return objects;
    }

    /**
     * Lista todos los usuarios de la base de datos
     * @return
     */
    public List findAll() throws DataAccessLayerException {
        return super.findAll(Puesto.class);
    }
}
