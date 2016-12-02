/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestores;

import Dao.DaoCandidato;
import Entidades.Candidato;
import Entidades.Cuestionario;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
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
    
    //Devuelve lista de candidatos que tengan cuestionarios activos o en proceso.
    public List<Candidato> findCuestionariosActPro(List<Candidato> lista){
        List<Candidato> ret= new ArrayList<Candidato>();
        
        for(Candidato cand: lista){
            //agregar cuestionarios activos o en proceso para cada candidato de la lista
            if(!daoCandidato.findCuestionariosActPro(cand)){
                ret.add(cand);
            }
        }
        
        return ret;
    }
    
    public Object validarCandidato(String tipoDocumento, String numeroDocumento, String password) {
        Object retorno=null;
        int numeroDoc= Integer.parseInt(numeroDocumento);
      Candidato candidato=daoCandidato.buscarCandidato(tipoDocumento, numeroDoc);
      if(candidato!=null){
          Set<Cuestionario> cuestionariosSet= candidato.getCuestionarios();
          List<Cuestionario> cuestionarios= new ArrayList<Cuestionario>(cuestionariosSet);
          if(cuestionarios!=null){
              Cuestionario cuestionarioValido= getCuestionarioActivoEnProceso(cuestionarios);
              if(cuestionarioValido!=null){
                  String passwordCuestionario= cuestionarioValido.getClave();
                  if(passwordCuestionario.equals(password))
                      retorno= candidato;
              }
          }
      }
      return retorno;
    }
    
    private Cuestionario getCuestionarioActivoEnProceso(List<Cuestionario> cuestionarios) {
        Cuestionario cuestionario = null;
        for (Cuestionario cuest : cuestionarios) {
            if (cuest.getEstado()==1 || cuest.getEstado()==1) {
                cuestionario= cuest;
            }
        }
        return cuestionario;
    }
    
}
