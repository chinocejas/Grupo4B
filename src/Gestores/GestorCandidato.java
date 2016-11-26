/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestores;

import Dao.DaoCandidato;
import Entidades.Candidato;
import java.util.List;
import pantallas.GestionDeEvaluarCandidato;

/**
 *
 * @author pc
 */



public class GestorCandidato {
    
    DaoCandidato daoCandidato = new DaoCandidato();
    
    private GestorCandidato(){
    }
    
    public static GestorCandidato getInstance() {
        return GestorCandidatoHolder.INSTANCE;
    }
    
    private static class GestorCandidatoHolder {

        private static final GestorCandidato INSTANCE = new GestorCandidato();
    }
    
    public void buscarCandidato(GestionDeEvaluarCandidato.CustomTableModel modeloTabla, String apellido, String nombre, String id){
        
        List listaCandidatos = null;
        listaCandidatos = daoCandidato.findPorApellidoAndNombreAndId(apellido, nombre, id);
        
        for (int a = 0; a < listaCandidatos.size(); a++) {
            Candidato candidato2 = (Candidato) listaCandidatos.get(a);
            modeloTabla.addCandidato(candidato2);
        }
        
    }
    
    public void buscarCandidato(GestionDeEvaluarCandidato.CustomTableModel modeloTabla){
        
        List listaCandidatos = null;
        listaCandidatos = daoCandidato.findPorApellidoAndNombreAndId();
        
        for (int a = 0; a < listaCandidatos.size(); a++) {
            Candidato candidato2 = (Candidato) listaCandidatos.get(a);
            modeloTabla.addCandidato(candidato2);
        }
    }
    
}
