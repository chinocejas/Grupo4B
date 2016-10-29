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
    
    public void buscarPuestos(DefaultTableModel modeloTabla, String codigo, String puesto, String empresa){
        
        List listaPuestos=null;
        
  
        listaPuestos=puestoDao.findPorCodigoAndPuestoAndEmpresa(codigo, puesto, empresa);
        
        for(int a=0;a<listaPuestos.size();a++){
            Puesto puesto2= (Puesto)listaPuestos.get(a);
            modeloTabla.addRow(new Object []{puesto2.getIdPuesto(),puesto2.getNombrePuesto(),puesto2.getNombreEmpresa()});
        } 
    }

    public void guardarPuesto(Puesto puesto) {
       
        puestoDao.save(puesto);
    }
    
    public void borrarPuesto(Puesto puesto){
       
        puestoDao.delete(puesto);
    }
    
    public void actualizarPuesto(Puesto puesto){
      
        puestoDao.update(puesto);
    }
    
    public Puesto buscarPuesto(int codigo){
        
        //al metodo find hay que pasarle un long como parametro de busqueda
        return puestoDao.find(codigo);
    }
    
    public void setPuesto(Puesto puesto, String nombre, String empresa, String descripcion, Set<Competencia> competencias){
        puesto.setNombrePuesto(nombre);
        puesto.setNombreEmpresa(empresa);
        puesto.setDescripcion(descripcion);
        puesto.setPuestoCompetencias(competencias);
       
    }
    
    public int buscarIdNuevoPuesto (){
        return puestoDao.buscarSecuencia();
    }
    
    
    //metodos para actualizar la ponderacion en la tabla union entre puesto y competencia //////////////
    public void actualizarPuntajesCompetencias(int idPuesto, List<Competencia> competencias, List<Integer> puntajes){
        puestoDao.actualizarPuntajesCompetencias(idPuesto, competencias, puntajes);
    }
    
    public PuestoCompetencia find(Long idPuesto, Long idCompetencia){
        PuestoCompetencia obj = null;
        obj=puestoDao.find(idPuesto, idCompetencia);
        return obj;
    }
    
    ///////////////////////////////////////////////////////

}
