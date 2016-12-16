/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entidades.OpcionRespuestaCopia;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class DaoOpcionRespuestaCopia extends AbstractDao {
    
    
    public DaoOpcionRespuestaCopia() {
        super();
    }

    public void save(OpcionRespuestaCopia opcionRespuestaCopia) throws DataAccessLayerException {
        super.save(opcionRespuestaCopia);
    }

    public void update(OpcionRespuestaCopia opcionRespuestaCopia) throws DataAccessLayerException {
        super.update(opcionRespuestaCopia);
    }

    public void delete(OpcionRespuestaCopia opcionRespuestaCopia) throws DataAccessLayerException {
        super.delete(opcionRespuestaCopia);
    }

   
    public OpcionRespuestaCopia find(Long id) throws DataAccessLayerException {
        return (OpcionRespuestaCopia) super.find(OpcionRespuestaCopia.class, id);
    }
    
    public List findAll() throws DataAccessLayerException {
        return super.findAll(OpcionRespuestaCopia.class);
        
    }
    
    public void updateListaOpcionRespuestaCopia(List<OpcionRespuestaCopia>lista) throws DataAccessLayerException {
        for(OpcionRespuestaCopia opc: lista){
            update(opc);
        }
    }

    
    
}
