/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestores;

import java.util.List;
import Dao.PuestoDaoHibernate;
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
    
    public void buscarPuesto(JTable tabla, int codigo, String puesto, String empresa){
        
        //List listaPuestos=null;
        //DefaultTableModel modeloTabla =(DefaultTableModel) tabla.getModel();
        
        //PuestoDaoHibernate puestoDAO = new PuestoDaoHibernate();
        //listaPuestos=puestoDAO.findPorCodigoAndPuestoAndEmpresa(codigo, puesto, empresa);
        
        /*for(int a=0;a<listaPuestos.size();a++){
            modeloTabla.addRow(new Object []{listaPuestos.get(a)});
        }*/
        
        
    }
    
}
