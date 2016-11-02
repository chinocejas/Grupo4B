/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestores;

import java.util.List;
import Dao.PuestoDaoHibernate;
import Entidades.Competencia;
import Entidades.Puesto;
import Entidades.PuestoCompetencia;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author John
 */
public class GestorPuesto {

    PuestoDaoHibernate puestoDao = new PuestoDaoHibernate();

    private GestorPuesto() {
    }

    public static GestorPuesto getInstance() {
        return GestorPuestoHolder.INSTANCE;
    }

    private static class GestorPuestoHolder {

        private static final GestorPuesto INSTANCE = new GestorPuesto();
    }

    public void buscarPuestos(DefaultTableModel modeloTabla, String codigo, String puesto, String empresa) {

        List listaPuestos = null;

        listaPuestos = puestoDao.findPorCodigoAndPuestoAndEmpresa(codigo, puesto, empresa);

        for (int a = 0; a < listaPuestos.size(); a++) {
            Puesto puesto2 = (Puesto) listaPuestos.get(a);
            modeloTabla.addRow(new Object[]{puesto2.getIdPuesto(), puesto2.getNombrePuesto(), puesto2.getNombreEmpresa()});
        }
    }
    
    // Busca todos los puestos
    public void buscarPuestos(DefaultTableModel modeloTabla) {

        List listaPuestos = null;

        listaPuestos = puestoDao.findPorCodigoAndPuestoAndEmpresa();

        for (int a = 0; a < listaPuestos.size(); a++) {
            Puesto puesto2 = (Puesto) listaPuestos.get(a);
            modeloTabla.addRow(new Object[]{puesto2.getIdPuesto(), puesto2.getNombrePuesto(), puesto2.getNombreEmpresa()});
        }
    }
    
    public void guardarPuesto (Puesto puesto){
        puestoDao.save(puesto);
    }

    public int setPuesto(int idPuesto, String nombre, String empresa, String descripcion, List<Competencia> competencias, List<Integer> ponderaciones) {

        
        int retorno=1; //si esta todo correcto se mantiene en 1
        
        //daoPuesto.verificarNombrePuestoUnico();
        
        
        Integer bandera = verificaciones(nombre, empresa, ponderaciones); 
        
        
        
        switch (bandera){
            
            //esta todo correcto
            case 1:

                //convierto a set la lista guardada en modeloTabla con las competencias seleccionadas para persistirlas en la bs 
                Set<Competencia> competenciasSet = new HashSet<Competencia>(competencias);
                Puesto puesto = new Puesto();
                puesto.setNombrePuesto(nombre);
                puesto.setNombreEmpresa(empresa);
                puesto.setDescripcion(descripcion);
                puesto.setPuestoCompetencias(competenciasSet);
                guardarPuesto(puesto);
                actualizarPuntajesCompetencias(idPuesto, competencias, ponderaciones);
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
        }
        return retorno;
    }

    public void borrarPuesto(Puesto puesto) {

        puestoDao.delete(puesto);
    }

    public void actualizarPuesto(Puesto puesto) {

        puestoDao.update(puesto);
    }

    public Puesto buscarPuesto(int codigo) {

        //al metodo find hay que pasarle un long como parametro de busqueda
        return puestoDao.find(codigo);
    }

    public int buscarIdNuevoPuesto() {
        return puestoDao.buscarSecuencia();
    }

    public int verificaciones(String nombre, String empresa, List<Integer> pond) {

        //retorna 1 si todo esta correcto
        Integer retorno=1;
        //verifico que nombre o empresa no esten vacios
        if("".equals(nombre) || "".equals(empresa))
            retorno = 4;
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

    //metodos para actualizar la ponderacion en la tabla union entre puesto y competencia //////////////
    public void actualizarPuntajesCompetencias(int idPuesto, List<Competencia> competencias, List<Integer> puntajes) {
        puestoDao.actualizarPuntajesCompetencias(idPuesto, competencias, puntajes);
    }

    public PuestoCompetencia find(Long idPuesto, Long idCompetencia) {
        PuestoCompetencia obj = null;
        obj = puestoDao.find(idPuesto, idCompetencia);
        return obj;
    }

    ///////////////////////////////////////////////////////
}
