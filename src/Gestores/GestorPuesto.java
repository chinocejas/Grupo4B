/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestores;

import java.util.List;
import Dao.PuestoDaoHibernate;
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
    
    public void buscarPuesto(DefaultTableModel modeloTabla, String codigo, String puesto, String empresa){
        
        List listaPuestos=null;
        
        
        PuestoDaoHibernate puestoDAO = new PuestoDaoHibernate();
        listaPuestos=puestoDAO.findPorCodigoAndPuestoAndEmpresa(codigo, puesto, empresa);
        
        for(int a=0;a<listaPuestos.size();a++){
            Puesto puesto2= (Puesto)listaPuestos.get(a);
            modeloTabla.addRow(new Object []{puesto2.getIdPuesto(),puesto2.getNombrePuesto(),puesto2.getNombreEmpresa()});
        }
        
        
    }
    
}
