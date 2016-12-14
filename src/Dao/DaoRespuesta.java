/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entidades.Respuesta;
import Entidades.RespuestaCopia;
import java.util.List;


public class DaoRespuesta extends AbstractDao {

    public DaoRespuesta() {
        super();
    }

    public void save(Respuesta respuesta) throws DataAccessLayerException {
        super.save(respuesta);
    }

    public void update(Respuesta respuesta) throws DataAccessLayerException {
        super.update(respuesta);
    }

    public void delete(Respuesta respuesta) throws DataAccessLayerException {
        super.delete(respuesta);
    }

    public Respuesta find(Long id) throws DataAccessLayerException {
        return (Respuesta) super.find(Respuesta.class, id);
    }
    
    public List findAll() throws DataAccessLayerException {
        return super.findAll(Respuesta.class);
    }
    
    
    //  MISMOS METODOS PARA PREGUNTA COPIA
    public void saveRespuestaCopia(RespuestaCopia respuestaCopia) throws DataAccessLayerException {
        super.save(respuestaCopia);
    }

    public void updateRespuestaCopia(RespuestaCopia respuestaCopia) throws DataAccessLayerException {
        super.update(respuestaCopia);
    }

    public void deleteRespuestaCopia(RespuestaCopia respuestaCopia) throws DataAccessLayerException {
        super.delete(respuestaCopia);
    }

    public RespuestaCopia findRespuestaCopia(Long id) throws DataAccessLayerException {
        return (RespuestaCopia) super.find(RespuestaCopia.class, id);
    }
    
    public List findAllRespuestaCopia() throws DataAccessLayerException {
        return super.findAll(RespuestaCopia.class);
    }
}