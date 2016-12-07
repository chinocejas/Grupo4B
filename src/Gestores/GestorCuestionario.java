/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestores;

import Entidades.*;
import Dao.*;
import java.util.*;

/**
 *
 * @author Agustina
 */
public class GestorCuestionario {
    
    DaoCuestionario daoCuestionario = new DaoCuestionario();
    
    
            
    
    
    private GestorCuestionario() {
    }
    
    public static GestorCuestionario getInstance() {
        return GestorCuestionarioHolder.INSTANCE;
    }
    
    private static class GestorCuestionarioHolder {

        private static final GestorCuestionario INSTANCE = new GestorCuestionario();
    }
        
    public List findQuest(int id_cuestionario) {      
       
       return daoCuestionario.findQuestFor(id_cuestionario);
       
       
           
                    
        }
        
        
        
            
        
        
        
        

        

        
    
    
}
