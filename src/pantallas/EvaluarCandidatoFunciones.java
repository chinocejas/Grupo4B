/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import Bases.*;
import Entidades.Competencia;
import Entidades.Puesto;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


/**
 *
 * @author John
 */
public class EvaluarCandidatoFunciones extends javax.swing.JFrame {
    
    List<Puesto> puestosGlobal = new ArrayList<Puesto>();
    
    public EvaluarCandidatoFunciones() {
        initComponents();
        setSize(1024, 768);
        setLocationRelativeTo(null);
        
    }
    
    public EvaluarCandidatoFunciones(List<Puesto> puestos) {
        initComponents();
        setSize(1024, 768);
        setLocationRelativeTo(null);
        
        puestosGlobal = puestos;
        
        for(Puesto p: puestosGlobal){
            listaFuncion.addItem(p.datosPuesto());
        }
}
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        arriba = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        abajo = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        centro = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        listaFuncion = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        req = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();

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
        btnVolver.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnVolverKeyPressed(evt);
            }
        });

        btnSiguiente.setBackground(new java.awt.Color(0, 51, 102));
        btnSiguiente.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        btnSiguiente.setForeground(new java.awt.Color(255, 255, 255));
        btnSiguiente.setText("Siguiente");
        btnSiguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSiguiente.setPreferredSize(new java.awt.Dimension(137, 41));
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        btnSiguiente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSiguienteKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout abajoLayout = new javax.swing.GroupLayout(abajo);
        abajo.setLayout(abajoLayout);
        abajoLayout.setHorizontalGroup(
            abajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abajoLayout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(237, 237, 237)
                .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(249, Short.MAX_VALUE))
        );
        abajoLayout.setVerticalGroup(
            abajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abajoLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(abajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        fondo.add(abajo, java.awt.BorderLayout.PAGE_END);

        centro.setOpaque(false);
        centro.setLayout(new java.awt.BorderLayout());

        jPanel3.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Función:");

        listaFuncion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaFuncionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(listaFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(242, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(listaFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        centro.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jPanel5.setOpaque(false);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Requerimientos mínimos");

        req.setColumns(20);
        req.setRows(5);
        jScrollPane2.setViewportView(req);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(383, 383, 383)
                        .addComponent(jLabel3))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(205, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                .addContainerGap())
        );

        centro.add(jPanel5, java.awt.BorderLayout.CENTER);

        fondo.add(centro, java.awt.BorderLayout.CENTER);

        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 768));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Abstracto Azul_1024.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listaFuncionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaFuncionActionPerformed
        //Agarro el indice seleccionado del jComboBox
        int indice = listaFuncion.getSelectedIndex();
        //Guardo en aux el Puesto seleccionado, guardado en la variable global puestosGlonal
        Puesto aux = puestosGlobal.get(indice);
        
        /*Iterator iter = aux.getCompetencias().iterator();
        
        while(iter.hasNext()){
            if(i==indice)
        }*/
        //Guardo las competencias de ese puesto en la variable competencias
        Set<Competencia> competencias = aux.getCompetencias();
        //Para cada competencia, muestro su nombre y ponderacion requerida
        for (Competencia s : competencias) {
            req.setText(s.getNombreCompetencia()+ " - Ponderacion requerida: " + s.hashCode());
        }
       
        
        //Poner competencias y ponderaciones en req
        
    }//GEN-LAST:event_listaFuncionActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed

    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        //Seleccioner item del jcombobox
        
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnVolverKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnVolverKeyPressed
       if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            btnVolverActionPerformed(null);
        }
    }//GEN-LAST:event_btnVolverKeyPressed

    private void btnSiguienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSiguienteKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            btnSiguienteActionPerformed(null);
        }
    }//GEN-LAST:event_btnSiguienteKeyPressed

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
            java.util.logging.Logger.getLogger(EvaluarCandidatoFunciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EvaluarCandidatoFunciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EvaluarCandidatoFunciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EvaluarCandidatoFunciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EvaluarCandidatoFunciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel abajo;
    private javax.swing.JPanel arriba;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btnVolver;
    private javax.swing.JPanel centro;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> listaFuncion;
    private javax.swing.JTextArea req;
    // End of variables declaration//GEN-END:variables
}
