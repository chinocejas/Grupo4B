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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author John
 */
public class GestorPuesto {
    
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
        
        
        PuestoDaoHibernate puestoDAO = new PuestoDaoHibernate();
        listaPuestos=puestoDAO.findPorCodigoAndPuestoAndEmpresa(codigo, puesto, empresa);
        
        for(int a=0;a<listaPuestos.size();a++){
            Puesto puesto2= (Puesto)listaPuestos.get(a);
            modeloTabla.addRow(new Object []{puesto2.getIdPuesto(),puesto2.getNombrePuesto(),puesto2.getNombreEmpresa()});
        } 
    }

    public void guardarPuesto(Puesto puesto) {
        PuestoDaoHibernate puestoDao = new PuestoDaoHibernate();
        puestoDao.save(puesto);
    }
    
    public void borrarPuesto(Puesto puesto){
        PuestoDaoHibernate puestoDao = new PuestoDaoHibernate();
        puestoDao.delete(puesto);
    }
    
    public void actualizarPuesto(Puesto puesto){
        PuestoDaoHibernate puestoDao = new PuestoDaoHibernate();
        puestoDao.update(puesto);
    }
    
    public Puesto buscarPuesto(int codigo){
        PuestoDaoHibernate puestoDao = new PuestoDaoHibernate();
        //al metodo find hay que pasarle un long como parametro de busqueda
        return puestoDao.find(codigo);
    }

}
