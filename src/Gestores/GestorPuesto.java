/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestores;

import java.util.List;
import Dao.DaoPuesto;
import Entidades.Competencia;
import Entidades.Puesto;
import Entidades.PuestoCompetencia;
import Entidades.PuestoCopia;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import pantallas.GestionDePuestos;

/**
 *
 * @author John
 */
public class GestorPuesto {

    DaoPuesto daoPuesto = new DaoPuesto();

    private GestorPuesto() {
    }

    public static GestorPuesto getInstance() {
        return GestorPuestoHolder.INSTANCE;
    }

    private static class GestorPuestoHolder {

        private static final GestorPuesto INSTANCE = new GestorPuesto();
    }

    public void buscarPuestos(GestionDePuestos.CustomTableModel modeloTabla, String codigo, String puesto, String empresa) {

        List listaPuestos = null;

        listaPuestos = daoPuesto.findPorCodigoAndPuestoAndEmpresa(codigo, puesto, empresa);

        for (int a = 0; a < listaPuestos.size(); a++) {
            Puesto puesto2 = (Puesto) listaPuestos.get(a);
            modeloTabla.addPuesto(puesto2);
        }
    }
    
    // Busca todos los puestos
    public void buscarPuestos(GestionDePuestos.CustomTableModel modeloTabla) {

        List listaPuestos = null;

        listaPuestos = daoPuesto.findPorCodigoAndPuestoAndEmpresa();

        for (int a = 0; a < listaPuestos.size(); a++) {
            Puesto puesto2 = (Puesto) listaPuestos.get(a);
            modeloTabla.addPuesto(puesto2);
        }
    }
    
    public void guardarPuesto (Puesto puesto, List<Competencia> competencias, List<Integer> ponderaciones ){
        daoPuesto.save(puesto, competencias, ponderaciones);
    }

    public int crearPuesto(String nombre, String empresa, String descripcion, List<Competencia> competencias, List<Integer> ponderaciones) {

        
        int retorno=1; //si esta todo correcto se mantiene en 1
     
        Integer bandera = verificacionesAltaPuesto(nombre, empresa, descripcion, ponderaciones); 
        
        switch (bandera){
            
            //esta todo correcto
            case 1:

                //convierto a set la lista guardada en modeloTabla con las competencias seleccionadas para persistirlas en la bs 
                Set<Competencia> competenciasSet = new HashSet<Competencia>(competencias);
                Puesto puesto = new Puesto();
                puesto.setNombrePuesto(nombre);
                puesto.setNombreEmpresa(empresa);
                puesto.setDescripcion(descripcion);
                puesto.setEliminado(false);
                puesto.setPuestoCompetencias(competenciasSet);
                guardarPuesto(puesto, competencias,ponderaciones);
                
                break;
                
            //hay ponderaciones sin completar
            case 2:
                 retorno=2;
                 break;
                 
            //hay ponderaciones que no estan entre 0 y 10
            case 3:
                 retorno=3;
                         break;
            
            //nombre o empresa estan vacios
            case 4:
                retorno=4;
                break;
            
            //sin al menos una competencia seleccionada
            case 5:
                retorno=5;
                break;
                 
            //el nombre ya esta en uso
            case 6:
                retorno=6;
                break;
        }
        return retorno;
    }
    
    public int modificarPuesto(Puesto puesto, String nombre, String empresa, String descripcion, Set<Competencia> competencias, List<Integer> ponderaciones){
       
        int retorno=1; //si esta todo correcto se mantiene en 1
     
        Integer bandera = verificacionesModificarPuesto(puesto.getIdPuesto(), nombre, empresa, descripcion, ponderaciones);
        
        
        
        switch (bandera){
            
            //esta todo correcto
            case 1:
                puesto.setNombrePuesto(nombre);
                puesto.setNombreEmpresa(empresa);
                puesto.setDescripcion(descripcion);
                puesto.setEliminado(false);
                puesto.setPuestoCompetencias(competencias);
                List<Competencia> competencias2 = new ArrayList<Competencia>(competencias);
                actualizarPuesto(puesto, competencias2, ponderaciones);
                break;
                
            //hay ponderaciones sin completar
            case 2:
                 retorno=2;
                 break;
                 
            //hay ponderaciones que no estan entre 0 y 10
            case 3:
                 retorno=3;
                         break;
            
            //nombre o empresa estan vacios
            case 4:
                retorno=4;
                break;
            
            //sin al menos una competencia seleccionada
            case 5:
                retorno=5;
                break;
                 
            //el nombre ya esta en uso
            case 6:
                retorno=6;
                break;
        }
    return retorno;
    }

    public void borrarPuesto(Puesto puesto) {

        daoPuesto.delete(puesto);
    }

    public void actualizarPuesto(Puesto puesto, List<Competencia> competencias, List<Integer> ponderaciones ) {

        daoPuesto.update(puesto, competencias, ponderaciones);
    }

    public Puesto buscarPuesto(int codigo) {

        //al metodo find hay que pasarle un long como parametro de busqueda
        return daoPuesto.find(codigo);
    }

    public int buscarIdNuevoPuesto() {
        return daoPuesto.buscarSecuencia();
    }

    public int verificacionesAltaPuesto(String nombre, String empresa, String descripcion, List<Integer> pond) {

        
        
        /* 1: todo correcto
           2: ponderaciones vacias
           3: ponderaciones fuera de rango (0-10)
           4: campos en blanco
           5: sin al menos una competencia seleccionada
           6: el nombre ya esta en uso
        */
        //retorna 1 si todo esta correcto
        Integer retorno=1;
        
        //nombreUnico=0 -> nombre en uso
        //nombreUnico= 1 ->el nombre esta libre
        
        int nombreUnico=daoPuesto.verificarNombrePuestoUnico(nombre);
        
        if(nombreUnico==0)
            retorno=6;
        
        //verifico que nombre o empresa no esten vacios
        else if("".equals(nombre) || "".equals(empresa) ||  "".equals(descripcion))
            retorno = 4; 
        else if(pond.isEmpty())
            retorno= 5;
        else
        for(int i=0; i< pond.size(); i++){
             //verificar lista sin ponderaciones vacias
            if(pond.get(i)==null){
                retorno=2;
                    i=pond.size();
            }
            //verificar que las ponderaciones sean valores entre 0 y 10
            else if(pond.get(i)<0 || pond.get(i)>10){
                    //bandera=true;
                    retorno=3;
                    i=pond.size();
            }
            
        }
        return retorno;
    }
    
    public int verificacionesModificarPuesto(int idPuesto, String nombre, String empresa, String descripcion, List<Integer> pond) {

        
        
        /* 1: todo correcto
           2: ponderaciones vacias
           3: ponderaciones fuera de rango (0-10)
           4: campos en blanco
           5: sin al menos una competencia seleccionada
           6: el nombre ya esta en uso
        */
        //retorna 1 si todo esta correcto
        Integer retorno=1;
        
        //nombreUnico=0 -> nombre en uso
        //nombreUnico= 1 ->el nombre esta libre
        
        int nombreUnico=daoPuesto.verificarNombrePuestoUnico(nombre, idPuesto);
        
        if(nombreUnico==0)
            retorno=6;
        
        //verifico que nombre o empresa no esten vacios
        else if("".equals(nombre) || "".equals(empresa) ||  "".equals(descripcion))
            retorno = 4; 
        else if(pond.isEmpty())
            retorno= 5;
        else
        for(int i=0; i< pond.size(); i++){
             //verificar lista sin ponderaciones vacias
            if(pond.get(i)==null){
                retorno=2;
                    i=pond.size();
            }
            //verificar que las ponderaciones sean valores entre 0 y 10
            else if(pond.get(i)<0 || pond.get(i)>10){
                    //bandera=true;
                    retorno=3;
                    i=pond.size();
            }
            
        }
        return retorno;
    }
    
    
    public boolean verificarPuestoEnUso(int idPuesto){
        boolean retorno=true;
       List<PuestoCopia> puestosCopias = daoPuesto.buscarPuestoCopia(idPuesto);
       if(puestosCopias.isEmpty())
           retorno=false;
        return retorno;
    }

    //metodos para actualizar la ponderacion en la tabla union entre puesto y competencia //////////////
    public void actualizarPuntajesCompetencias(int idPuesto, List<Competencia> competencias, List<Integer> puntajes) {
        daoPuesto.actualizarPuntajesCompetencias(idPuesto, competencias, puntajes);
    }

    public PuestoCompetencia find(Long idPuesto, Long idCompetencia) {
        PuestoCompetencia obj = null;
        obj = daoPuesto.find(idPuesto, idCompetencia);
        return obj;
    }

    ///////////////////////////////////////////////////////
}
