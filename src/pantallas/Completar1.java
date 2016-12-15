
package pantallas;

import Entidades.Cuestionario;
import Entidades.CuestionarioPreguntaCopia;
import Entidades.PreguntaCopia;
import Entidades.RespuestaCopia;
import Gestores.GestorCuestionario;
import ParaPantallaCompletar.EditorCelda;
import ParaPantallaCompletar.Renderizador;
import java.util.List;
import javax.swing.table.AbstractTableModel;


/**
     * Creates new form Pantallak
     * 
     */
public class Completar1 extends javax.swing.JFrame {
     public Completar1() {
        initComponents();
        setSize(1024, 768);
        setLocationRelativeTo(null);
     }    
    
    public Completar1(Cuestionario cuestionario) {
        initComponents();
        setSize(1024, 768);
        setLocationRelativeTo(null);
        
        int longitudLista= buscarPregunta(cuestionario).size();
        
        switch(cuestionario.getPreguntasContestadas() -longitudLista){
            
            case 0:{
                
                
            }
                
           
            case 1:{
                
                ModeloPersonalizado modeloTabla1 = new ModeloPersonalizado(buscarPregunta(cuestionario).get(cuestionario.getPreguntasContestadas()).getPreguntaCopia());
                ModeloPersonalizado modeloTabla2 = new ModeloPersonalizado(buscarPregunta(cuestionario).get(cuestionario.getPreguntasContestadas() + 1).getPreguntaCopia());
                ModeloPersonalizado modeloTabla3 = new ModeloPersonalizado(buscarPregunta(cuestionario).get(cuestionario.getPreguntasContestadas() + 2).getPreguntaCopia());
                

                jTablePregunta0.setModel(modeloTabla1); //Aca seteo un modelo personalizado de jtable para que pueda cargar cosas dinamicamente
                jTablePregunta0.getColumnModel().getColumn(0).setCellRenderer(new Renderizador());
                jTablePregunta0.getColumnModel().getColumn(0).setCellEditor(new EditorCelda()); //Aca estoy setenado en la columna 0 con los modelos personalizados del jcheckbox

                jTablePregunta1.setModel(modeloTabla2);
                jTablePregunta1.getColumnModel().getColumn(0).setCellRenderer(new Renderizador());
                jTablePregunta1.getColumnModel().getColumn(0).setCellEditor(new EditorCelda());

                jTablePregunta2.setModel(modeloTabla3);
                jTablePregunta2.getColumnModel().getColumn(0).setCellRenderer(new Renderizador());
                jTablePregunta2.getColumnModel().getColumn(0).setCellEditor(new EditorCelda());
                
                jTablePregunta3.setVisible(false);
                
            }
            
            case 2:{
                
                ModeloPersonalizado modeloTabla1 = new ModeloPersonalizado(buscarPregunta(cuestionario).get(cuestionario.getPreguntasContestadas()).getPreguntaCopia());
                ModeloPersonalizado modeloTabla2 = new ModeloPersonalizado(buscarPregunta(cuestionario).get(cuestionario.getPreguntasContestadas() + 1).getPreguntaCopia());
               
                

                jTablePregunta0.setModel(modeloTabla1); //Aca seteo un modelo personalizado de jtable para que pueda cargar cosas dinamicamente
                jTablePregunta0.getColumnModel().getColumn(0).setCellRenderer(new Renderizador());
                jTablePregunta0.getColumnModel().getColumn(0).setCellEditor(new EditorCelda()); //Aca estoy setenado en la columna 0 con los modelos personalizados del jcheckbox

                jTablePregunta1.setModel(modeloTabla2);
                jTablePregunta1.getColumnModel().getColumn(0).setCellRenderer(new Renderizador());
                jTablePregunta1.getColumnModel().getColumn(0).setCellEditor(new EditorCelda());
                
                jTablePregunta2.setVisible(false);
                jTablePregunta3.setVisible(false);

            }
            
            case 3:{
                
                 ModeloPersonalizado modeloTabla1 = new ModeloPersonalizado(buscarPregunta(cuestionario).get(cuestionario.getPreguntasContestadas()).getPreguntaCopia());

                jTablePregunta0.setModel(modeloTabla1); //Aca seteo un modelo personalizado de jtable para que pueda cargar cosas dinamicamente
                jTablePregunta0.getColumnModel().getColumn(0).setCellRenderer(new Renderizador());
                jTablePregunta0.getColumnModel().getColumn(0).setCellEditor(new EditorCelda()); //Aca estoy setenado en la columna 0 con los modelos personalizados del jcheckbox

                jTablePregunta1.setVisible(false);
                jTablePregunta2.setVisible(false);
                jTablePregunta3.setVisible(false);

            }
            
            default: {
                ModeloPersonalizado modeloTabla1 = new ModeloPersonalizado(buscarPregunta(cuestionario).get(cuestionario.getPreguntasContestadas()).getPreguntaCopia());
                ModeloPersonalizado modeloTabla2 = new ModeloPersonalizado(buscarPregunta(cuestionario).get(cuestionario.getPreguntasContestadas() + 1).getPreguntaCopia());
                ModeloPersonalizado modeloTabla3 = new ModeloPersonalizado(buscarPregunta(cuestionario).get(cuestionario.getPreguntasContestadas() + 2).getPreguntaCopia());
                ModeloPersonalizado modeloTabla4 = new ModeloPersonalizado(buscarPregunta(cuestionario).get(cuestionario.getPreguntasContestadas() + 3).getPreguntaCopia());

                jTablePregunta0.setModel(modeloTabla1); //Aca seteo un modelo personalizado de jtable para que pueda cargar cosas dinamicamente
                jTablePregunta0.getColumnModel().getColumn(0).setCellRenderer(new Renderizador());
                jTablePregunta0.getColumnModel().getColumn(0).setCellEditor(new EditorCelda()); //Aca estoy setenado en la columna 0 con los modelos personalizados del jcheckbox

                jTablePregunta1.setModel(modeloTabla2);
                jTablePregunta1.getColumnModel().getColumn(0).setCellRenderer(new Renderizador());
                jTablePregunta1.getColumnModel().getColumn(0).setCellEditor(new EditorCelda());

                jTablePregunta2.setModel(modeloTabla3);
                jTablePregunta2.getColumnModel().getColumn(0).setCellRenderer(new Renderizador());
                jTablePregunta2.getColumnModel().getColumn(0).setCellEditor(new EditorCelda());

                jTablePregunta3.setModel(modeloTabla4);
                jTablePregunta3.getColumnModel().getColumn(0).setCellRenderer(new Renderizador());
                jTablePregunta3.getColumnModel().getColumn(0).setCellEditor(new EditorCelda());
                
                
            }
            
        }
        
      
    }

    
    public List<CuestionarioPreguntaCopia> buscarPregunta(Cuestionario cuestionario){
        
        List<CuestionarioPreguntaCopia> listaDePreguntas = null;
        GestorCuestionario gestorCuestionario =  GestorCuestionario.getInstance(); 
        listaDePreguntas =  gestorCuestionario.traerPreguntas(cuestionario);
        
        return  listaDePreguntas;
    }
    
    public void mostrarPreguntas(Cuestionario cuestionario){
        
        int longitudLista= buscarPregunta(cuestionario).size();
        
        switch(cuestionario.getPreguntasContestadas() -longitudLista){
            
            case 1:{
                
                nombrePregunta0.setText(buscarPregunta(cuestionario).get(cuestionario.getPreguntasContestadas()).getPreguntaCopia().getPregunta());
                nombrePregunta1.setText(buscarPregunta(cuestionario).get(cuestionario.getPreguntasContestadas() + 1).getPreguntaCopia().getPregunta());
                nombrePregunta2.setText(buscarPregunta(cuestionario).get(cuestionario.getPreguntasContestadas() + 2).getPreguntaCopia().getPregunta());
                
                nombrePregunta3.setVisible(false);
            }
            
            case 2:{
                nombrePregunta0.setText(buscarPregunta(cuestionario).get(cuestionario.getPreguntasContestadas()).getPreguntaCopia().getPregunta());
                nombrePregunta1.setText(buscarPregunta(cuestionario).get(cuestionario.getPreguntasContestadas() + 1).getPreguntaCopia().getPregunta());
                nombrePregunta2.setVisible(false);
                nombrePregunta3.setVisible(false);
            }
            
            
            case 3:{
                nombrePregunta0.setText(buscarPregunta(cuestionario).get(cuestionario.getPreguntasContestadas()).getPreguntaCopia().getPregunta());
                nombrePregunta1.setVisible(false);
                nombrePregunta2.setVisible(false);
                nombrePregunta3.setVisible(false);
            }
            
            default: {
                nombrePregunta0.setText(buscarPregunta(cuestionario).get(cuestionario.getPreguntasContestadas()).getPreguntaCopia().getPregunta());
                nombrePregunta1.setText(buscarPregunta(cuestionario).get(cuestionario.getPreguntasContestadas() + 1).getPreguntaCopia().getPregunta());
                nombrePregunta2.setText(buscarPregunta(cuestionario).get(cuestionario.getPreguntasContestadas() + 2).getPreguntaCopia().getPregunta());
                nombrePregunta3.setText(buscarPregunta(cuestionario).get(cuestionario.getPreguntasContestadas() + 3).getPreguntaCopia().getPregunta());
            }
        }
        
         
    }
    
    
    public class ModeloPersonalizado extends AbstractTableModel{
       
        //Aca lo que hago es definir una lista CuestionarioPreguntaCopia
        public List<RespuestaCopia> listaDeRespuestas = null;
        private String[] columnas = {"", "Respuestas"}; 
        private boolean [] editables={true,false}; //digo que columnas de mi modelo personalizado son editables
           
                
        public ModeloPersonalizado(PreguntaCopia pregunta){
            
            
            listaDeRespuestas =  (List)pregunta.getOpcionRespuestaCopia().getRespuestaCopias();//seteo la lista de la tablas intermedias, relacionados con el cuestionario con id 1
                      
            
        }

   
        @Override
        public int getRowCount(){
            
            return listaDeRespuestas.size();
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
                    
                    return  listaDeRespuestas.get(rowIndex).getRespuesta(); //esto trae preguntas, lo que tiene q traer son las respuestas, por cada pregunta
                   
                }
                default: return null;
            }
        }
    }        
    
    
        
        
  
        

        
    

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTablePregunta3 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePregunta2 = new javax.swing.JTable();
        nombrePregunta1 = new java.awt.Label();
        nombrePregunta0 = new java.awt.Label();
        nombrePregunta2 = new java.awt.Label();
        nombrePregunta3 = new java.awt.Label();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTablePregunta0 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTablePregunta1 = new javax.swing.JTable();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        siguiente = new javax.swing.JButton();
        volver1 = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setPreferredSize(new java.awt.Dimension(1024, 768));
        setResizable(false);

        jScrollPane6.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane6.setMinimumSize(new java.awt.Dimension(1024, 768));
        jScrollPane6.setPreferredSize(new java.awt.Dimension(1024, 568));

        jTablePregunta3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jTablePregunta3);

        jTablePregunta2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTablePregunta2);

        nombrePregunta1.setText("pregunta 1");

        nombrePregunta0.setText("Pregunta 0");

        nombrePregunta2.setText("pregunta 2");

        nombrePregunta3.setText("pregunta 3");

        jTablePregunta0.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTablePregunta0);

        jTablePregunta1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTablePregunta1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nombrePregunta3, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombrePregunta1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nombrePregunta0, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
                            .addComponent(nombrePregunta2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(794, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(nombrePregunta0, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(nombrePregunta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombrePregunta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombrePregunta3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
        );

        jScrollPane6.setViewportView(jPanel1);

        siguiente.setBackground(new java.awt.Color(0, 51, 102));
        siguiente.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        siguiente.setForeground(new java.awt.Color(204, 204, 204));
        siguiente.setText("Siguiente");
        siguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                siguienteMouseClicked(evt);
            }
        });
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });

        volver1.setBackground(new java.awt.Color(0, 51, 102));
        volver1.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        volver1.setForeground(new java.awt.Color(204, 204, 204));
        volver1.setText("Volver");
        volver1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volver1MouseClicked(evt);
            }
        });
        volver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volver1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(651, 651, 651)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(volver1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 351, Short.MAX_VALUE)
                .addComponent(siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(217, 217, 217))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(37, 37, 37)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 938, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(49, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(347, Short.MAX_VALUE)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 360, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(volver1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(71, 71, 71)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(112, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void siguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_siguienteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_siguienteMouseClicked

    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_siguienteActionPerformed

    private void volver1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volver1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_volver1MouseClicked

    private void volver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volver1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_volver1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Completar1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Completar1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Completar1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Completar1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Completar1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTablePregunta0;
    private javax.swing.JTable jTablePregunta1;
    private javax.swing.JTable jTablePregunta2;
    private javax.swing.JTable jTablePregunta3;
    private javax.swing.JTextArea jTextArea1;
    private java.awt.Label nombrePregunta0;
    private java.awt.Label nombrePregunta1;
    private java.awt.Label nombrePregunta2;
    private java.awt.Label nombrePregunta3;
    private javax.swing.JButton siguiente;
    private javax.swing.JButton volver1;
    // End of variables declaration//GEN-END:variables
}
