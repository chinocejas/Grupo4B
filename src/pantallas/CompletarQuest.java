/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;
import Gestores.GestorCuestionario;
import java.util.List;
import Entidades.*;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Set;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;



/**
 *
 * @author John
 */
public class CompletarQuest extends javax.swing.JFrame {

    /**
     * Creates new form Pantallak
     * @param candidato
     */
    //pido la instancia de gestor de cuestionario
    GestorCuestionario gestorCuestionario = GestorCuestionario.getInstance();
    Candidato candidatoglobal = new Candidato();
    
    public CompletarQuest() {
        initComponents();
        setSize(1024, 768);
        setLocationRelativeTo(null);
        
    }
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/BS_ultimate2.png"));
        return retValue;
    }
    
     public CompletarQuest(Candidato candidato) {
        
        candidatoglobal = candidato;
        Object retorno = gestorCuestionario.verificarAcceso(gestorCuestionario.getCuestActivo(candidato));
        String aux="";
        
        //Si devuelve el string de instrucciones
        if(retorno.getClass() == aux.getClass()){
            initComponents();
            setSize(1024, 768);
            setLocationRelativeTo(null);
            String ret = (String) retorno;
            
            cargaCuestionario(candidato, ret);
        }else {//Si devuelve Cuestionario
            Cuestionario ret = (Cuestionario) retorno;
            Completar1 obj = new Completar1(ret, gestorCuestionario.preguntasSinContestar(ret));
            obj.setVisible(true);
            dispose();
            
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
        jLabel1 = new javax.swing.JLabel();
        candidatoName = new javax.swing.JLabel();
        candidatoDNI = new javax.swing.JLabel();
        abajo = new javax.swing.JPanel();
        volverBtn = new javax.swing.JButton();
        centro = new javax.swing.JPanel();
        centroInterior = new javax.swing.JPanel();
        arribaInterior = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        izquierda = new javax.swing.JPanel();
        derecha = new javax.swing.JPanel();
        abajoInterior = new javax.swing.JPanel();
        aceptarBtn = new javax.swing.JButton();
        cancelarBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        instrucciones = new javax.swing.JEditorPane();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondo.setMaximumSize(new java.awt.Dimension(1024, 768));
        fondo.setMinimumSize(new java.awt.Dimension(1024, 768));
        fondo.setOpaque(false);
        fondo.setPreferredSize(new java.awt.Dimension(1024, 768));
        fondo.setLayout(new java.awt.BorderLayout(10, 10));

        arriba.setOpaque(false);
        arriba.setPreferredSize(new java.awt.Dimension(1024, 100));
        arriba.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 44)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(219, 219, 219));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cuestionario");
        jLabel1.setPreferredSize(new java.awt.Dimension(303, 51));
        arriba.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1030, 60));

        candidatoName.setForeground(new java.awt.Color(255, 255, 255));
        candidatoName.setText("Candidato:");
        arriba.add(candidatoName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 420, 20));

        candidatoDNI.setForeground(new java.awt.Color(255, 255, 255));
        candidatoDNI.setText("DNI:");
        arriba.add(candidatoDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 470, 20));

        fondo.add(arriba, java.awt.BorderLayout.PAGE_START);

        abajo.setOpaque(false);

        volverBtn.setBackground(new java.awt.Color(0, 51, 102));
        volverBtn.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        volverBtn.setForeground(new java.awt.Color(255, 255, 255));
        volverBtn.setText("Volver");
        volverBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        volverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout abajoLayout = new javax.swing.GroupLayout(abajo);
        abajo.setLayout(abajoLayout);
        abajoLayout.setHorizontalGroup(
            abajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abajoLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(volverBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(795, Short.MAX_VALUE))
        );
        abajoLayout.setVerticalGroup(
            abajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abajoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(volverBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        fondo.add(abajo, java.awt.BorderLayout.PAGE_END);

        centro.setOpaque(false);
        centro.setLayout(new java.awt.BorderLayout(10, 10));

        centroInterior.setOpaque(false);
        centroInterior.setLayout(new java.awt.BorderLayout(10, 10));

        arribaInterior.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(219, 219, 219));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Instrucciones");

        javax.swing.GroupLayout arribaInteriorLayout = new javax.swing.GroupLayout(arribaInterior);
        arribaInterior.setLayout(arribaInteriorLayout);
        arribaInteriorLayout.setHorizontalGroup(
            arribaInteriorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1030, Short.MAX_VALUE)
        );
        arribaInteriorLayout.setVerticalGroup(
            arribaInteriorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(arribaInteriorLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        centroInterior.add(arribaInterior, java.awt.BorderLayout.PAGE_START);

        izquierda.setOpaque(false);

        javax.swing.GroupLayout izquierdaLayout = new javax.swing.GroupLayout(izquierda);
        izquierda.setLayout(izquierdaLayout);
        izquierdaLayout.setHorizontalGroup(
            izquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        izquierdaLayout.setVerticalGroup(
            izquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 348, Short.MAX_VALUE)
        );

        centroInterior.add(izquierda, java.awt.BorderLayout.LINE_START);

        derecha.setOpaque(false);

        javax.swing.GroupLayout derechaLayout = new javax.swing.GroupLayout(derecha);
        derecha.setLayout(derechaLayout);
        derechaLayout.setHorizontalGroup(
            derechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        derechaLayout.setVerticalGroup(
            derechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 348, Short.MAX_VALUE)
        );

        centroInterior.add(derecha, java.awt.BorderLayout.LINE_END);

        abajoInterior.setOpaque(false);

        aceptarBtn.setBackground(new java.awt.Color(0, 51, 102));
        aceptarBtn.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        aceptarBtn.setForeground(new java.awt.Color(255, 255, 255));
        aceptarBtn.setText("Aceptar");
        aceptarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aceptarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarBtnActionPerformed(evt);
            }
        });

        cancelarBtn.setBackground(new java.awt.Color(0, 51, 102));
        cancelarBtn.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        cancelarBtn.setForeground(new java.awt.Color(255, 255, 255));
        cancelarBtn.setText("Cancelar");
        cancelarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout abajoInteriorLayout = new javax.swing.GroupLayout(abajoInterior);
        abajoInterior.setLayout(abajoInteriorLayout);
        abajoInteriorLayout.setHorizontalGroup(
            abajoInteriorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abajoInteriorLayout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(aceptarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 265, Short.MAX_VALUE)
                .addComponent(cancelarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(228, 228, 228))
        );
        abajoInteriorLayout.setVerticalGroup(
            abajoInteriorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abajoInteriorLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(abajoInteriorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aceptarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        centroInterior.add(abajoInterior, java.awt.BorderLayout.PAGE_END);

        instrucciones.setEditable(false);
        instrucciones.setBorder(null);
        instrucciones.setContentType("text/html"); // NOI18N
        jScrollPane2.setViewportView(instrucciones);

        centroInterior.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        centro.add(centroInterior, java.awt.BorderLayout.CENTER);

        fondo.add(centro, java.awt.BorderLayout.CENTER);

        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Abstracto Azul_1024.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Carga Candidato
    
    private void aceptarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarBtnActionPerformed
        
        inicializarCuestionario(candidatoglobal);
        GestorCuestionario gestorCuestionario = GestorCuestionario.getInstance();
        Cuestionario cuestionario = gestorCuestionario.getCuestionarioEnProceso(candidatoglobal);
        List<PreguntaCopia> listaPreguntas = gestorCuestionario.preguntasSinContestar(cuestionario);
        System.out.println("Tamaño listaPreguntaCopia: "+listaPreguntas.size());
        
        Completar1 obj= new Completar1(cuestionario, listaPreguntas);
        obj.setVisible(true);
        dispose();    
        
        
        // ESTO ES PARA PROBAR
       
        
    }//GEN-LAST:event_aceptarBtnActionPerformed

    private void volverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverBtnActionPerformed
        // TODO add your handling code here:
        Inicio obj= new Inicio();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_volverBtnActionPerformed
    private void inicializarCuestionario (Candidato candidato){
        
        // PARAPROBAR ESCRIBIR DEBAJO
        //Document doc= instrucciones.getDocument();
        
        // ESTO VA EN OTRA PANTALLA
        GestorCuestionario gestorCuestionario = GestorCuestionario.getInstance();
        //Cuestionario cuestionarioactivo = gestorCuestionario.getCuestActivo(candidato);
        List<Cuestionario> lista = new ArrayList();
        lista.addAll(candidato.getCuestionarios());
        Cuestionario cuestionarioactivo = gestorCuestionario.getCuestionarioActivoEnProceso(lista);
        
        gestorCuestionario.iniciaCuestionario(cuestionarioactivo);
        /*switch (cuestionarioactivo.getEstado()){
            case 1: 
                gestorCuestionario.iniciaCuestionario(cuestionarioactivo);
            case 5:
                System.out.println("AHORA DEFINE LOS DEMAS");
        }// FIN SWITCH*/
        
        }
    
    public void cargaCuestionario(Candidato candidato, String inst){
       //LLENA LOS DATOS DE LAS PANTALLAS    
        candidatoName.setText("Candidato: " + candidato.getNombreApellido());
        candidatoDNI.setText(candidato.getTipoDocumento()+": "+ candidato.getNumeroDocumento().toString());
        
        //instrucciones.setText(Gestores.GestorRepositorio.getInstance().getInstrucciones());
        instrucciones.setText(inst);
    }
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
            java.util.logging.Logger.getLogger(CompletarQuest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CompletarQuest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CompletarQuest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CompletarQuest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new CompletarQuest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel abajo;
    private javax.swing.JPanel abajoInterior;
    private javax.swing.JButton aceptarBtn;
    private javax.swing.JPanel arriba;
    private javax.swing.JPanel arribaInterior;
    private javax.swing.JButton cancelarBtn;
    private javax.swing.JLabel candidatoDNI;
    private javax.swing.JLabel candidatoName;
    private javax.swing.JPanel centro;
    private javax.swing.JPanel centroInterior;
    private javax.swing.JPanel derecha;
    private javax.swing.JPanel fondo;
    private javax.swing.JEditorPane instrucciones;
    private javax.swing.JPanel izquierda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton volverBtn;
    // End of variables declaration//GEN-END:variables
}
