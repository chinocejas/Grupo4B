/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bases;


/**
 *
 * @author John
 */
public class PantallaConJpanels extends javax.swing.JFrame {

    /**
     * Creates new form Pantallak
     */
    public PantallaConJpanels() {
        initComponents();
        setSize(1024, 768);
        setLocationRelativeTo(null);
        
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
        jLabel1 = new javax.swing.JLabel();
        abajo = new javax.swing.JPanel();
        centro = new javax.swing.JPanel();
        centroInterior = new javax.swing.JPanel();
        arribaInterior = new javax.swing.JPanel();
        izquierda = new javax.swing.JPanel();
        derecha = new javax.swing.JPanel();
        abajoInterior = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        fondo.setLayout(new java.awt.BorderLayout(10, 10));

        arriba.setBorder(new javax.swing.border.MatteBorder(null));
        arriba.setPreferredSize(new java.awt.Dimension(1024, 100));
        arriba.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        jLabel1.setText("Ingreso");
        arriba.add(jLabel1, new java.awt.GridBagConstraints());

        fondo.add(arriba, java.awt.BorderLayout.PAGE_START);

        abajo.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout abajoLayout = new javax.swing.GroupLayout(abajo);
        abajo.setLayout(abajoLayout);
        abajoLayout.setHorizontalGroup(
            abajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1022, Short.MAX_VALUE)
        );
        abajoLayout.setVerticalGroup(
            abajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        fondo.add(abajo, java.awt.BorderLayout.PAGE_END);

        centro.setBorder(new javax.swing.border.MatteBorder(null));
        centro.setLayout(new java.awt.BorderLayout(10, 10));

        centroInterior.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51), 2));
        centroInterior.setLayout(new java.awt.BorderLayout(10, 10));

        arribaInterior.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));

        javax.swing.GroupLayout arribaInteriorLayout = new javax.swing.GroupLayout(arribaInterior);
        arribaInterior.setLayout(arribaInteriorLayout);
        arribaInteriorLayout.setHorizontalGroup(
            arribaInteriorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1016, Short.MAX_VALUE)
        );
        arribaInteriorLayout.setVerticalGroup(
            arribaInteriorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        centroInterior.add(arribaInterior, java.awt.BorderLayout.PAGE_START);

        izquierda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));

        javax.swing.GroupLayout izquierdaLayout = new javax.swing.GroupLayout(izquierda);
        izquierda.setLayout(izquierdaLayout);
        izquierdaLayout.setHorizontalGroup(
            izquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        izquierdaLayout.setVerticalGroup(
            izquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 314, Short.MAX_VALUE)
        );

        centroInterior.add(izquierda, java.awt.BorderLayout.LINE_START);

        derecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));

        javax.swing.GroupLayout derechaLayout = new javax.swing.GroupLayout(derecha);
        derecha.setLayout(derechaLayout);
        derechaLayout.setHorizontalGroup(
            derechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        derechaLayout.setVerticalGroup(
            derechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 314, Short.MAX_VALUE)
        );

        centroInterior.add(derecha, java.awt.BorderLayout.LINE_END);

        abajoInterior.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));

        javax.swing.GroupLayout abajoInteriorLayout = new javax.swing.GroupLayout(abajoInterior);
        abajoInterior.setLayout(abajoInteriorLayout);
        abajoInteriorLayout.setHorizontalGroup(
            abajoInteriorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1016, Short.MAX_VALUE)
        );
        abajoInteriorLayout.setVerticalGroup(
            abajoInteriorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        centroInterior.add(abajoInterior, java.awt.BorderLayout.PAGE_END);

        centro.add(centroInterior, java.awt.BorderLayout.CENTER);

        fondo.add(centro, java.awt.BorderLayout.CENTER);

        getContentPane().add(fondo, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(PantallaConJpanels.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaConJpanels.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaConJpanels.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaConJpanels.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaConJpanels().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel abajo;
    private javax.swing.JPanel abajoInterior;
    private javax.swing.JPanel arriba;
    private javax.swing.JPanel arribaInterior;
    private javax.swing.JPanel centro;
    private javax.swing.JPanel centroInterior;
    private javax.swing.JPanel derecha;
    private javax.swing.JPanel fondo;
    private javax.swing.JPanel izquierda;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
