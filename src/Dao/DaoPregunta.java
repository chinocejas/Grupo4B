/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entidades.Pregunta;
import Entidades.PreguntaCopia;
import java.util.List;


public class DaoPregunta extends AbstractDao {

    public DaoPregunta() {
        super();
    }

    public void save(Pregunta pregunta) throws DataAccessLayerException {
        super.save(pregunta);
    }

    public void update(Pregunta pregunta) throws DataAccessLayerException {
        super.update(pregunta);
    }

    public void delete(Pregunta pregunta) throws DataAccessLayerException {
        super.delete(pregunta);
    }

    public Pregunta find(Long id) throws DataAccessLayerException {
        return (Pregunta) super.find(Pregunta.class, id);
    }
    
    public List findAll() throws DataAccessLayerException {
        return super.findAll(Pregunta.class);
    }
    
    
    //  MISMOS METODOS PARA PREGUNTA COPIA
    public void savePreguntaCopia(PreguntaCopia preguntaCopia) throws DataAccessLayerException {
        super.save(preguntaCopia);
    }

    public void updatePreguntaCopia(PreguntaCopia preguntaCopia) throws DataAccessLayerException {
        super.update(preguntaCopia);
    }

    public void deletePreguntaCopia(PreguntaCopia preguntaCopia) throws DataAccessLayerException {
        super.delete(preguntaCopia);
    }

    public PreguntaCopia findPreguntaCopia(Long id) throws DataAccessLayerException {
        return (PreguntaCopia) super.find(PreguntaCopia.class, id);
    }
    
    public List findAllPreguntaCopia() throws DataAccessLayerException {
        return super.findAll(PreguntaCopia.class);
    }
}
