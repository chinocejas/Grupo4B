/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import Dao.DaoCuestionarioPreguntaCopia;
import Entidades.CuestionarioPreguntaCopia;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Usuario
 */
 public class ModeloPersonalizado extends AbstractTableModel{
    
        
       
        //Aca lo que hago es definir una lista CuestionarioPreguntaCopia
        public List<CuestionarioPreguntaCopia> listaDePreguntas = null;
        private String[] columnas = {"", "Respuestas"}; 
        private boolean [] editables={true,false}; //digo que columnas de mi modelo personalizado son editables
        private DaoCuestionarioPreguntaCopia dao = new DaoCuestionarioPreguntaCopia(); //Llamo al DAO, esto se tiene que reemplazar por un gestor de cuestionar, e implementarlo
        //mirar gestorcuestionario linea 105        
                
        public ModeloPersonalizado(){
            
            //respuestas = Persona.getPersonas();
            listaDePreguntas =  dao.buscarPreguntaCopia(1); //seteo la lista de la tablas intermedias, relacionados con el cuestionario con id 1
        
            
        }
        @Override
        public int getRowCount(){
            
            return listaDePreguntas.size();
        }
        
        @Override
        public int getColumnCount(){
            return columnas.length;
        }
         
        @Override
        public boolean isCellEditable (int rowIndex, int columnIndez){
            
            return editables[columnIndez];
            
        }
                
        
        @Override //en este metodo seteo el balor correspondiente a cada columna
        public Object getValueAt(int rowIndex, int columnIndez){
            switch(columnIndez){
                case 0:{
                    return false;
                }
                case 1: {
                    
                    return  listaDePreguntas.get(rowIndex).getPreguntaCopia().getPregunta(); //esto trae preguntas, lo que tiene q traer son las respuestas, por cada pregunta
                   
                }
                default: return null;
            }
        }
            
    
        
    
}
    

