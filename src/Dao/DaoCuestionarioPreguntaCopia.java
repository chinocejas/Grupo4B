/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entidades.CuestionarioPreguntaCopia;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;

/**
 *
 * @author Usuario
 */
public class DaoCuestionarioPreguntaCopia extends AbstractDao {
    
      public DaoCuestionarioPreguntaCopia (){
        super();
    }

    public void save(CuestionarioPreguntaCopia cuestionarioPreguntaCopia) throws DataAccessLayerException {
        super.save(cuestionarioPreguntaCopia);
    }

    public void update(CuestionarioPreguntaCopia cuestionarioPreguntaCopia) throws DataAccessLayerException {
        super.update(cuestionarioPreguntaCopia);
    }

    public void delete(CuestionarioPreguntaCopia cuestionarioPreguntaCopia) throws DataAccessLayerException {
        super.delete(cuestionarioPreguntaCopia);
    }

    public CuestionarioPreguntaCopia find(Long id) throws DataAccessLayerException {
        return (CuestionarioPreguntaCopia) super.find(CuestionarioPreguntaCopia.class, id);
    }
    
    public List findAll() throws DataAccessLayerException {
        return super.findAll(CuestionarioPreguntaCopia.class);
    }
    
     public List buscarPreguntaCopia(int id_cuestionario){
         List objects = null;
        try {
            startOperation();
            Query query;
            query = session.createQuery("from CuestionarioPreguntaCopia WHERE id_cuestionario = :id_cuestionario");     
            query.setParameter("id_cuestionario", id_cuestionario);
            objects = query.list();
            tx.commit();
        } catch (HibernateException e) {
            handleException(e);
        } finally {
            HibernateFactory.close(session);
        }
        return objects;
    }
    
     
}
