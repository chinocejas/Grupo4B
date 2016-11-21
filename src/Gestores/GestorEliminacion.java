/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestores;

import Dao.DaoEliminacion;
import Entidades.Consultor;
import Entidades.Puesto;
import Entidades.RaEliminacion;
import java.util.Date;

/**
 *
 * @author John
 */
public class GestorEliminacion {
    
    DaoEliminacion daoEliminacion = new DaoEliminacion();
    
    private GestorEliminacion() {
    }
    
    public static GestorEliminacion getInstance() {
        return GestorEliminacionHolder.INSTANCE;
    }

    public void generarRegistroAuditoria(Object obj, Consultor consultor, Date fechaActual) {
        
        RaEliminacion raEliminacion= new RaEliminacion();
        raEliminacion.setObjetoEliminado(obj);
        raEliminacion.setConsultor(consultor);
        raEliminacion.setFecha(fechaActual);
        String objetoString= obj.getClass().getSimpleName();
        System.out.print("clase nombre "+ objetoString);
        switch(objetoString){
            case "Puesto":
       
                raEliminacion.setObjetoBorrado("PUESTO");
                break;
            case "Competencia":
                raEliminacion.setObjetoBorrado("COMPETENCIA");
                break;
                
                //completar para factor, pregunta,...
        }
        daoEliminacion.save(raEliminacion);
        
    }
    
    private static class GestorEliminacionHolder {

        private static final GestorEliminacion INSTANCE = new GestorEliminacion();
    }
}
