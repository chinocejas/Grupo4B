/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

/**
 *
 * @author John
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form otraaaaa
     */
    public Inicio() {
        initComponents();
        setTitle("Inicio");
        setSize(1024, 768);
        setLocationRelativeTo(null);
    }
    
     public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/BS_ultimate2.png"));
        return retValue;
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
        Ingreso = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        abajo = new javax.swing.JPanel();
        centro = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        botonConsultor = new javax.swing.JButton();
        botonCandidato = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondo.setOpaque(false);
        fondo.setLayout(new java.awt.BorderLayout());

        arriba.setOpaque(false);

        Ingreso.setFont(new java.awt.Font("Arial", 1, 60)); // NOI18N
        Ingreso.setForeground(new java.awt.Color(219, 219, 219));
        Ingreso.setText("Ingreso");
        Ingreso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout arribaLayout = new javax.swing.GroupLayout(arriba);
        arriba.setLayout(arribaLayout);
        arribaLayout.setHorizontalGroup(
            arribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(arribaLayout.createSequentialGroup()
                .addGap(403, 403, 403)
                .addGroup(arribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(Ingreso))
                .addContainerGap(465, Short.MAX_VALUE))
        );
        arribaLayout.setVerticalGroup(
            arribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, arribaLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Ingreso))
        );

        fondo.add(arriba, java.awt.BorderLayout.PAGE_START);

        abajo.setOpaque(false);

        javax.swing.GroupLayout abajoLayout = new javax.swing.GroupLayout(abajo);
        abajo.setLayout(abajoLayout);
        abajoLayout.setHorizontalGroup(
            abajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1089, Short.MAX_VALUE)
        );
        abajoLayout.setVerticalGroup(
            abajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        fondo.add(abajo, java.awt.BorderLayout.PAGE_END);

        centro.setOpaque(false);
        centro.setLayout(new java.awt.BorderLayout());

        jPanel1.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 376, Short.MAX_VALUE)
        );

        centro.add(jPanel1, java.awt.BorderLayout.LINE_START);

        jPanel2.setOpaque(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 376, Short.MAX_VALUE)
        );

        centro.add(jPanel2, java.awt.BorderLayout.LINE_END);

        jPanel3.setOpaque(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1089, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        centro.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jPanel4.setOpaque(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1089, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        centro.add(jPanel4, java.awt.BorderLayout.PAGE_END);

        jPanel5.setOpaque(false);
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonConsultor.setBackground(new java.awt.Color(0, 51, 102));
        botonConsultor.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        botonConsultor.setForeground(new java.awt.Color(219, 219, 219));
        botonConsultor.setText("Consultor");
        botonConsultor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonConsultor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConsultorActionPerformed(evt);
            }
        });
        botonConsultor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botonConsultorKeyPressed(evt);
            }
        });
        jPanel5.add(botonConsultor, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 120, 350, 54));

        botonCandidato.setBackground(new java.awt.Color(0, 51, 102));
        botonCandidato.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        botonCandidato.setForeground(new java.awt.Color(219, 219, 219));
        botonCandidato.setText("Candidato");
        botonCandidato.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCandidato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCandidatoActionPerformed(evt);
            }
        });
        botonCandidato.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botonCandidatoKeyPressed(evt);
            }
        });
        jPanel5.add(botonCandidato, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 239, 350, 54));

        centro.add(jPanel5, java.awt.BorderLayout.CENTER);

        fondo.add(centro, java.awt.BorderLayout.CENTER);

        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/braca soft 2.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setPreferredSize(new java.awt.Dimension(1024, 768));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonConsultorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultorActionPerformed
        // TODO add your handling code here:
       
        IngresoConsultor obj= new IngresoConsultor();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_botonConsultorActionPerformed

    private void botonCandidatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCandidatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCandidatoActionPerformed

    private void botonConsultorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botonConsultorKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            botonConsultorActionPerformed(null);
        }
    }//GEN-LAST:event_botonConsultorKeyPressed

    private void botonCandidatoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botonCandidatoKeyPressed
        
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            botonCandidatoActionPerformed(null);
        }
        
    }//GEN-LAST:event_botonCandidatoKeyPressed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ingreso;
    private javax.swing.JPanel abajo;
    private javax.swing.JPanel arriba;
    private javax.swing.JButton botonCandidato;
    private javax.swing.JButton botonConsultor;
    private javax.swing.JPanel centro;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
