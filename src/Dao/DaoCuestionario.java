/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;
import Entidades.Cuestionario;
import Entidades.PuestoCopia;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;

/**
 *
 * @author Agustina
 */
public class DaoCuestionario extends AbstractDao{
    
    public DaoCuestionario() {
        super();
    }
    
    //Como guarda esto?? como asocia el puesto y la id candidato?
    
    public void save(Cuestionario cuestionario, Integer id_candidato, PuestoCopia puesto) throws DataAccessLayerException {
        super.save(cuestionario);
    }
    
    public void update(Cuestionario cuestionario) throws DataAccessLayerException {
        super.update(cuestionario);
    }
    
    public void delete(Cuestionario cuestionario) throws DataAccessLayerException {
        super.delete(cuestionario);
    }
    
    public Cuestionario find(Long id) throws DataAccessLayerException {
        return (Cuestionario) super.find(Cuestionario.class, id);
    }
    public List findQuestFor(int idCuestionario) {
        
       List objects = null;
      
        try {
            startOperation();
            Query query;
            query = session.createQuery("from Cuestionario WHERE id_cuestionario = :idCuestionario");     
            query.setParameter("idCuestionario", idCuestionario);
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
