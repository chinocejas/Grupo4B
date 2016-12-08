/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entidades.Competencia;
import Entidades.CompetenciaCopia;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;


/**
 *
 * @author Rolando
 */
public class DaoCompetencia extends AbstractDao {

    public DaoCompetencia() {
        super();
    }

    /**
     * Insert a new Usuario into the database.
     * @param usuario
     */
    public void save(Competencia competencia) throws DataAccessLayerException {
        super.save(competencia);
    }

    /**
     * Updates a new Usuario into the database.
     * @param usuario
     */
    public void update(Competencia competencia) throws DataAccessLayerException {
        super.update(competencia);
    }

    /**
     * Delete a detached Usuario from the database.
     * @param usuario
     */
    public void delete(Competencia competencia) throws DataAccessLayerException {
        super.delete(competencia);
    }

    /**
     * Find an Event by its primary key.
     * @param id
     * @return
     */
    public Competencia find(Long id) throws DataAccessLayerException {
        return (Competencia) super.find(Competencia.class, id);
    }
    
    
    /**
     * Lista todos los usuarios de la base de datos
     * @return
     */
    public List findAll() throws DataAccessLayerException {
        return super.findAll(Competencia.class);
    }
    
    public List findAllOrdenadoPorNombre() throws DataAccessLayerException {
        List objects = null;
        try {
            startOperation();
            Query query = session.createQuery("from Competencia ORDER BY nombre_competencia");
            objects = query.list();
            tx.commit();
        } catch (HibernateException e) {
            handleException(e);
        } finally {
            HibernateFactory.close(session);
        }
        return objects;
    }

    public void save(CompetenciaCopia competenciaCopia) {
        super.save(competenciaCopia);
    }
}
