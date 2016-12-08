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
        
    public List<Cuestionario> cargarCuestionarios(List<Candidato> candidatos, PuestoCopia puestoCopiado){
        List<Cuestionario> ret = new ArrayList<Cuestionario>();
        /*id_cuestionario, preguntas_contestadas, cantidad_accesos, fecha_creacion, 
            fecha_inicio, fecha_ultimo_ingreso, fecha_finalizacion, clave, 
            estado, tiempo_maximo, id_candidato, id_puesto_copia)*/
        //id_puesto, id_candidato, clave, estado=activo,
        
        
        for(Candidato cand: candidatos){
            Cuestionario cuest = new Cuestionario();
            
            cuest.setEstado(1);
            String clave = generarClave(8);
            cuest.setClave(clave);
            //poner clave foranea id_puesto_copia, id_candidato??
            
            //daoCuestionario.save(cuest, cand.getIdCandidato(), puestoCopiado);
            
            //debo devolverlo con las id ascociadas
            ret.add(cuest);
        }

        return ret;
    }
        
    private String generarClave(int longitud) {
        String cadenaAleatoria = "";
        long milis = new java.util.GregorianCalendar().getTimeInMillis();
        Random r = new Random(milis);
        int i = 0;
        while (i < longitud) {
            char c = (char) r.nextInt(255);
            if ((c >= '0' && c <= '9') || (c >= 'A' && c <= 'Z')) {
                cadenaAleatoria += c;
                i++;
            }
        }
        return cadenaAleatoria;
    }       
        
  
        
        

        

        
    
    
}
