package pantallas;

import java.awt.Image;
import java.awt.Toolkit;

import Gestores.*;
import java.awt.event.KeyEvent;

/**
 *
 * @author John
 */
public class Gestion extends javax.swing.JFrame {
   
    public Gestion() {
        initComponents();
        setTitle("Inicio");
        setSize(1024, 768);
        setLocationRelativeTo(null);   
        
        userConsultor.setText("User: " + GestorConsultor.getInstance().getConsultor().getUsername());
        nombreConsultor.setText("Consultor: " + GestorConsultor.getInstance().getConsultor().getNombre());
        
    }
    
 
     public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/BS_ultimate2.png"));
        return retValue;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        arriba = new javax.swing.JPanel();
        Ingreso = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        userConsultor = new javax.swing.JLabel();
        nombreConsultor = new javax.swing.JLabel();
        abajo = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        botonVolver = new javax.swing.JButton();
        centro = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        botonCandidatos = new javax.swing.JButton();
        botonPuestos = new javax.swing.JButton();
        botonFactores = new javax.swing.JButton();
        botonCompetencias = new javax.swing.JButton();
        botonPreguntas = new javax.swing.JButton();
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
        Ingreso.setText("Gestión");
        Ingreso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel4.setText("jLabel4");

        userConsultor.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        userConsultor.setForeground(new java.awt.Color(204, 204, 204));
        userConsultor.setToolTipText("");

        nombreConsultor.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        nombreConsultor.setForeground(new java.awt.Color(204, 204, 204));
        nombreConsultor.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout arribaLayout = new javax.swing.GroupLayout(arriba);
        arriba.setLayout(arribaLayout);
        arribaLayout.setHorizontalGroup(
            arribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(arribaLayout.createSequentialGroup()
                .addGap(403, 403, 403)
                .addGroup(arribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(arribaLayout.createSequentialGroup()
                        .addComponent(Ingreso)
                        .addGap(50, 50, 50)
                        .addGroup(arribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombreConsultor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(userConsultor, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel4))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        arribaLayout.setVerticalGroup(
            arribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, arribaLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(arribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Ingreso)
                    .addGroup(arribaLayout.createSequentialGroup()
                        .addComponent(userConsultor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombreConsultor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        fondo.add(arriba, java.awt.BorderLayout.PAGE_START);

        abajo.setOpaque(false);

        jPanel4.setOpaque(false);

        botonVolver.setBackground(new java.awt.Color(0, 51, 102));
        botonVolver.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        botonVolver.setForeground(new java.awt.Color(255, 255, 255));
        botonVolver.setText("Volver");
        botonVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonVolverMouseClicked(evt);
            }
        });
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });
        botonVolver.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botonVolverKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(botonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(848, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout abajoLayout = new javax.swing.GroupLayout(abajo);
        abajo.setLayout(abajoLayout);
        abajoLayout.setHorizontalGroup(
            abajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abajoLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 54, Short.MAX_VALUE))
        );
        abajoLayout.setVerticalGroup(
            abajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abajoLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
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
            .addGap(0, 410, Short.MAX_VALUE)
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
            .addGap(0, 410, Short.MAX_VALUE)
        );

        centro.add(jPanel2, java.awt.BorderLayout.LINE_END);

        jPanel3.setOpaque(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1104, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 102, Short.MAX_VALUE)
        );

        centro.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jPanel5.setOpaque(false);

        botonCandidatos.setBackground(new java.awt.Color(0, 51, 102));
        botonCandidatos.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        botonCandidatos.setForeground(new java.awt.Color(255, 255, 255));
        botonCandidatos.setText("Candidatos");
        botonCandidatos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCandidatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCandidatosActionPerformed(evt);
            }
        });
        botonCandidatos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botonCandidatosKeyPressed(evt);
            }
        });

        botonPuestos.setBackground(new java.awt.Color(0, 51, 102));
        botonPuestos.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        botonPuestos.setForeground(new java.awt.Color(255, 255, 255));
        botonPuestos.setText("Puestos");
        botonPuestos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonPuestos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPuestosActionPerformed(evt);
            }
        });
        botonPuestos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botonPuestosKeyPressed(evt);
            }
        });

        botonFactores.setBackground(new java.awt.Color(0, 51, 102));
        botonFactores.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        botonFactores.setForeground(new java.awt.Color(255, 255, 255));
        botonFactores.setText("Factores");
        botonFactores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonFactores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFactoresActionPerformed(evt);
            }
        });
        botonFactores.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botonFactoresKeyPressed(evt);
            }
        });

        botonCompetencias.setBackground(new java.awt.Color(0, 51, 102));
        botonCompetencias.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        botonCompetencias.setForeground(new java.awt.Color(255, 255, 255));
        botonCompetencias.setText("Competencias");
        botonCompetencias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCompetencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCompetenciasActionPerformed(evt);
            }
        });
        botonCompetencias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botonCompetenciasKeyPressed(evt);
            }
        });

        botonPreguntas.setBackground(new java.awt.Color(0, 51, 102));
        botonPreguntas.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        botonPreguntas.setForeground(new java.awt.Color(255, 255, 255));
        botonPreguntas.setText("Preguntas");
        botonPreguntas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonPreguntas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPreguntasActionPerformed(evt);
            }
        });
        botonPreguntas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botonPreguntasKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonPreguntas, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCompetencias, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonFactores, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonPuestos, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCandidatos, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(botonCandidatos, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(botonCompetencias, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(botonFactores, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(botonPreguntas, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(botonPuestos, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        centro.add(jPanel5, java.awt.BorderLayout.CENTER);

        fondo.add(centro, java.awt.BorderLayout.CENTER);

        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/braca soft 2.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setPreferredSize(new java.awt.Dimension(1024, 768));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVolverMouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_botonVolverMouseClicked

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        // TODO add your handling code here:
        Tareas obj= new Tareas();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_botonVolverActionPerformed

    private void botonCandidatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCandidatosActionPerformed
        GestionCandidatos obj = new GestionCandidatos();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_botonCandidatosActionPerformed

    private void botonPuestosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPuestosActionPerformed
        GestionDePuestos obj= new GestionDePuestos();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_botonPuestosActionPerformed

    private void botonFactoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFactoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonFactoresActionPerformed

    private void botonCompetenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCompetenciasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCompetenciasActionPerformed

    private void botonPreguntasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPreguntasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonPreguntasActionPerformed

    private void botonCandidatosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botonCandidatosKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            botonCandidatosActionPerformed(null);
        }
    }//GEN-LAST:event_botonCandidatosKeyPressed

    private void botonCompetenciasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botonCompetenciasKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            botonCompetenciasActionPerformed(null);
        }
    }//GEN-LAST:event_botonCompetenciasKeyPressed

    private void botonFactoresKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botonFactoresKeyPressed
       if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            botonFactoresActionPerformed(null);
        }
    }//GEN-LAST:event_botonFactoresKeyPressed

    private void botonPreguntasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botonPreguntasKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            botonPreguntasActionPerformed(null);
        }
    }//GEN-LAST:event_botonPreguntasKeyPressed

    private void botonPuestosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botonPuestosKeyPressed
       if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            botonPuestosActionPerformed(null);
        }
    }//GEN-LAST:event_botonPuestosKeyPressed

    private void botonVolverKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botonVolverKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            botonVolverActionPerformed(null);
        }
    }//GEN-LAST:event_botonVolverKeyPressed

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
            java.util.logging.Logger.getLogger(Gestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gestion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ingreso;
    private javax.swing.JPanel abajo;
    private javax.swing.JPanel arriba;
    private javax.swing.JButton botonCandidatos;
    private javax.swing.JButton botonCompetencias;
    private javax.swing.JButton botonFactores;
    private javax.swing.JButton botonPreguntas;
    private javax.swing.JButton botonPuestos;
    private javax.swing.JButton botonVolver;
    private javax.swing.JPanel centro;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel nombreConsultor;
    private javax.swing.JLabel userConsultor;
    // End of variables declaration//GEN-END:variables
}
