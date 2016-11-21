/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;
import Entidades.Cuestionario;
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
    
    public void save(Cuestionario cuestionario) throws DataAccessLayerException {
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
    
}
