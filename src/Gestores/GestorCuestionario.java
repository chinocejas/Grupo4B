/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestores;

import Entidades.Cuestionario;
import java.util.List;

/**
 *
 * @author Agustina
 */
public class GestorCuestionario {
    
    private GestorCuestionario() {
    }
    
    public static GestorCuestionario getInstance() {
        return GestorCuestionarioHolder.INSTANCE;
    }
    
    private static class GestorCuestionarioHolder {

        private static final GestorCuestionario INSTANCE = new GestorCuestionario();
        
        public void findQuest() {

        List listaCuestionarios = null;
        
        
        

        

        
    }
    }
}
