/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestores;

import Dao.DaoFactor;
import Entidades.Factor;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author pc
 */
public class GestorFactor {
    
    DaoFactor daoFactor = new DaoFactor();

    private GestorFactor() {
    }

    public static GestorFactor getInstance() {
        return GestorFactorHolder.INSTANCE;
    }
    
    private static class GestorFactorHolder {

        private static final GestorFactor INSTANCE = new GestorFactor();
    }
    
    public boolean esEvaluable(Factor factor){
        //si es evaluable, tiene al menos 2 preguntas
        if(factor.getPreguntas().size()>1){
            return true;
        }else return false;
        
    }
}
