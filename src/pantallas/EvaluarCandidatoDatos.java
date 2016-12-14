/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import Bases.*;
import Entidades.Cuestionario;
import Gestores.GestorSalida;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author pc
 */
public class EvaluarCandidatoDatos extends javax.swing.JFrame {

    CustomTableModel modeloTabla = new CustomTableModel();
    List<Cuestionario> cuestionariosGlobal;
    //pido la instancia de gestor de salida
    GestorSalida gestorSalida = GestorSalida.getInstance();
    
    public EvaluarCandidatoDatos() {
        initComponents();
        setSize(1024, 768);
        setLocationRelativeTo(null);
        tabla.setModel(modeloTabla);
        tabla.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        
    }
    
    public EvaluarCandidatoDatos(List<Cuestionario> cuestionarios) {
        initComponents();
        setSize(1024, 768);
        setLocationRelativeTo(null);
        tabla.setModel(modeloTabla);
        tabla.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        cuestionariosGlobal = cuestionarios;
        
        /*
            Candidato candidato = modeloTabla.getCandidato(tablaBusqueda.getSelectedRow());
            modeloTablaSeleccionados.addCandidato(candidato);
            modeloTabla.eliminarCandidato(tablaBusqueda.getSelectedRow());
        } else {
            campoTexto.setText("Seleccione un elemento antes de presionar el boton");
        }*/
        
        for(Cuestionario cuest: cuestionarios){
            modeloTabla.addCuestionario(cuest);
        }
        
    }

//Los métodos de esto estan mal. modificar
    public class CustomTableModel extends AbstractTableModel {
        
        private ArrayList<Cuestionario> data = new ArrayList<Cuestionario>();
        private int numColumns = 5; //cant de columnas con la que se crea la tabla
        private String columnNames[] = {"Nombre","Apellido", "Tipo de Documento", "Numero de Documento", "Clave de Ingreso"};
        // private Class classes[]={String.class ,String.class}; //tipo de las columnas
        private boolean editable[] = {false, false, false, false, false};

        @Override
        public int getRowCount() {
            return data.size();
        }

        @Override
        public int getColumnCount() { //construye la cantidad de columnas que se retorna
            return numColumns;
        }

        @Override
        public String getColumnName(int col) {
            return columnNames[col];
        }

        @Override
        public Class getColumnClass(int col) {
            //return classes[col];
            return String.class; //no cambiar a int u otra cosa porque pierde la propiedad de editable
        }

        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return columnIndex == 0 ? false : true;
        }
        
        public Cuestionario getCuestionario(int fila) {
            return (Cuestionario)data.get(fila);
        }
        public Cuestionario getCuestionario2(int fila) {
            return (Cuestionario)data.get(fila);
        }

        public List<Cuestionario> getListaCuestionarios() {
            return data;
        }
        
        // Cambia el valor que contiene una determinada casilla de la tabla
        public void setValueAt(Object value, int row, int col) {
            
        }
        
        @Override
        //este metodo muestra por pantalla los nombres pero en realidad se esta manejando una lista con Competencias por detras
        public Object getValueAt(int row, int col) {

            Object retorno=null;
            Cuestionario c = (Cuestionario) data.get(row);
            switch (col) {
                case 0:
                    retorno = c.getCandidato().getNombre();
                    break;
                case 1:
                    retorno = c.getCandidato().getApellido();
                    break;
                case 2:
                    retorno = c.getCandidato().getTipoDocumento();
                    break;
                case 3:
                    retorno = c.getCandidato().getNumeroDocumento();
                    break;
                case 4:
                    retorno = c.getClave();
                    break;
            }
            return retorno;
        }


        private void deleteRow(int row) {
            tabla.remove(row);
        }
        
        public void addCuestionario(Cuestionario cuest) {
            data.add(cuest);      
            fireTableDataChanged();
        }
        
        private void eliminarCuestionario(int row) {
            data.remove(row);
            fireTableDataChanged();
        }
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        arriba = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        abajo = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        btnFinalizar = new javax.swing.JButton();
        centro = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondo.setOpaque(false);
        fondo.setLayout(new java.awt.BorderLayout());

        arriba.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 44)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(219, 219, 219));
        jLabel2.setText("Evaluar Candidatos");

        javax.swing.GroupLayout arribaLayout = new javax.swing.GroupLayout(arriba);
        arriba.setLayout(arribaLayout);
        arribaLayout.setHorizontalGroup(
            arribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(arribaLayout.createSequentialGroup()
                .addGap(323, 323, 323)
                .addComponent(jLabel2)
                .addContainerGap(292, Short.MAX_VALUE))
        );
        arribaLayout.setVerticalGroup(
            arribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(arribaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        fondo.add(arriba, java.awt.BorderLayout.PAGE_START);

        abajo.setOpaque(false);

        btnVolver.setBackground(new java.awt.Color(0, 51, 102));
        btnVolver.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnFinalizar.setBackground(new java.awt.Color(0, 51, 102));
        btnFinalizar.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        btnFinalizar.setForeground(new java.awt.Color(255, 255, 255));
        btnFinalizar.setText("Finalizar");
        btnFinalizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFinalizar.setPreferredSize(new java.awt.Dimension(137, 41));
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout abajoLayout = new javax.swing.GroupLayout(abajo);
        abajo.setLayout(abajoLayout);
        abajoLayout.setHorizontalGroup(
            abajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abajoLayout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(235, 235, 235)
                .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(251, Short.MAX_VALUE))
        );
        abajoLayout.setVerticalGroup(
            abajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abajoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(abajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        fondo.add(abajo, java.awt.BorderLayout.PAGE_END);

        centro.setOpaque(false);
        centro.setLayout(new java.awt.BorderLayout());

        jPanel3.setOpaque(false);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"no se muestran los cambios hechos aca"}
            },
            new String [] {
                "no se usa este diseño"
            }
        ));
        tabla.setColumnSelectionAllowed(true);
        tabla.getTableHeader().setReorderingAllowed(false);
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tabla);
        tabla.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 879, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        centro.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jPanel5.setOpaque(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1024, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        centro.add(jPanel5, java.awt.BorderLayout.CENTER);

        fondo.add(centro, java.awt.BorderLayout.CENTER);

        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 768));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Abstracto Azul_1024.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        GestionDeEvaluarCandidato obj = new GestionDeEvaluarCandidato();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        
        int resp = JOptionPane.showConfirmDialog(null, "¿Desea exportar la lista de candidatos con sus claves a un archivo excel?", "Exportación a archivo XLS", JOptionPane.YES_NO_OPTION);
        
        //Si apreta SI, genera xls y vuelve a pantalla principal de gestion
        if(resp == JOptionPane.YES_OPTION){
            gestorSalida.generarXls(cuestionariosGlobal);
            
            Gestion obj = new Gestion();
            obj.setVisible(true);
            dispose();
        }else {
            Gestion obj = new Gestion();
            obj.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked

        //no se sabe todavia para que sirve
        /*
        int fila = tabla.rowAtPoint(evt.getPoint());
        int columna = tabla.columnAtPoint(evt.getPoint());
        if ((fila > -1) && (columna > -1)) {
            filaSeleccionada = fila;
        }*/
    }//GEN-LAST:event_tablaMouseClicked

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
            java.util.logging.Logger.getLogger(EvaluarCandidatoDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EvaluarCandidatoDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EvaluarCandidatoDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EvaluarCandidatoDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EvaluarCandidatoDatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel abajo;
    private javax.swing.JPanel arriba;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JPanel centro;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
