/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import Entidades.Competencia;
import Entidades.Puesto;
import Gestores.GestorPuesto;
import Gestores.GestorValidacionesPantalla;
import VentanasEmergentes.PopUps;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author John
 */
public class GestionDePuestos extends javax.swing.JFrame {

    CustomTableModel modeloTabla = new CustomTableModel();
    
    //pido la instancia de gestor de validaciones de pantalla
    GestorValidacionesPantalla gestorValidacionesPantalla = GestorValidacionesPantalla.getInstance();
    
    public GestionDePuestos() {
        initComponents();
        setSize(1024, 768);
        setLocationRelativeTo(null);
        
        tabla.setModel(modeloTabla);
        tabla.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
    }
    
     public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/BS_ultimate2.png"));
        return retValue;
    }
    
    private void limpiarTabla(JTable tabla, CustomTableModel modeloTabla){
       for (int i = 0; i < tabla.getRowCount(); i++) {
           modeloTabla.deleteRow(i);
           i-=1;
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

        nuevoFrame = new javax.swing.JFrame();
        fondo = new javax.swing.JPanel();
        centro = new javax.swing.JPanel();
        izquierda = new javax.swing.JPanel();
        derecha = new javax.swing.JPanel();
        trabajarAca = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        empresa = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        buscar = new javax.swing.JButton();
        puesto = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        nuevo = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        codigo = new javax.swing.JTextField();
        txtMensaje = new javax.swing.JLabel();
        txtMensajeBusqueda = new javax.swing.JLabel();
        arriba = new javax.swing.JPanel();
        Ingreso = new javax.swing.JLabel();
        abajo = new javax.swing.JPanel();
        volver = new javax.swing.JButton();
        ImagenFondo = new javax.swing.JLabel();

        setLocation(1000,768);

        javax.swing.GroupLayout nuevoFrameLayout = new javax.swing.GroupLayout(nuevoFrame.getContentPane());
        nuevoFrame.getContentPane().setLayout(nuevoFrameLayout);
        nuevoFrameLayout.setHorizontalGroup(
            nuevoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        nuevoFrameLayout.setVerticalGroup(
            nuevoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondo.setOpaque(false);
        fondo.setLayout(new java.awt.BorderLayout());

        centro.setOpaque(false);
        centro.setLayout(new java.awt.BorderLayout());

        izquierda.setOpaque(false);

        javax.swing.GroupLayout izquierdaLayout = new javax.swing.GroupLayout(izquierda);
        izquierda.setLayout(izquierdaLayout);
        izquierdaLayout.setHorizontalGroup(
            izquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        izquierdaLayout.setVerticalGroup(
            izquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );

        centro.add(izquierda, java.awt.BorderLayout.LINE_START);

        derecha.setOpaque(false);

        javax.swing.GroupLayout derechaLayout = new javax.swing.GroupLayout(derecha);
        derecha.setLayout(derechaLayout);
        derechaLayout.setHorizontalGroup(
            derechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        derechaLayout.setVerticalGroup(
            derechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );

        centro.add(derecha, java.awt.BorderLayout.LINE_END);

        trabajarAca.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Código:");

        empresa.setBackground(new java.awt.Color(0, 51, 102));
        empresa.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        empresa.setForeground(new java.awt.Color(255, 255, 255));
        empresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empresaActionPerformed(evt);
            }
        });
        empresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                empresaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                empresaKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre de Puesto:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Empresa:");

        buscar.setBackground(new java.awt.Color(0, 51, 102));
        buscar.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        buscar.setForeground(new java.awt.Color(255, 255, 255));
        buscar.setText("Buscar");
        buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarMouseClicked(evt);
            }
        });
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buscarKeyPressed(evt);
            }
        });

        puesto.setBackground(new java.awt.Color(0, 51, 102));
        puesto.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        puesto.setForeground(new java.awt.Color(255, 255, 255));
        puesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puestoActionPerformed(evt);
            }
        });
        puesto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                puestoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                puestoKeyTyped(evt);
            }
        });

        tabla.setBackground(new java.awt.Color(0, 51, 102));
        tabla.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        tabla.setForeground(new java.awt.Color(255, 255, 255));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre de Puesto", "Empresa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setOpaque(false);
        tabla.setRowHeight(26);
        jScrollPane2.setViewportView(tabla);

        nuevo.setBackground(new java.awt.Color(0, 51, 102));
        nuevo.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        nuevo.setForeground(new java.awt.Color(255, 255, 255));
        nuevo.setText("Nuevo");
        nuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nuevoMouseClicked(evt);
            }
        });
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });

        eliminar.setBackground(new java.awt.Color(0, 51, 102));
        eliminar.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        eliminar.setForeground(new java.awt.Color(255, 255, 255));
        eliminar.setText("Eliminar");
        eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarMouseClicked(evt);
            }
        });
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        modificar.setBackground(new java.awt.Color(0, 51, 102));
        modificar.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        modificar.setForeground(new java.awt.Color(255, 255, 255));
        modificar.setText("Modificar");
        modificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificarMouseClicked(evt);
            }
        });
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });

        codigo.setBackground(new java.awt.Color(0, 51, 102));
        codigo.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        codigo.setForeground(new java.awt.Color(255, 255, 255));
        codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoActionPerformed(evt);
            }
        });
        codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                codigoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codigoKeyTyped(evt);
            }
        });

        txtMensaje.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        txtMensaje.setForeground(new java.awt.Color(255, 255, 255));

        txtMensajeBusqueda.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        txtMensajeBusqueda.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout trabajarAcaLayout = new javax.swing.GroupLayout(trabajarAca);
        trabajarAca.setLayout(trabajarAcaLayout);
        trabajarAcaLayout.setHorizontalGroup(
            trabajarAcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trabajarAcaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(trabajarAcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, trabajarAcaLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(98, 98, 98)
                        .addComponent(empresa))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, trabajarAcaLayout.createSequentialGroup()
                        .addGroup(trabajarAcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(buscar))
                        .addGroup(trabajarAcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(trabajarAcaLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(trabajarAcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(puesto)
                                    .addComponent(codigo, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(trabajarAcaLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(txtMensajeBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(trabajarAcaLayout.createSequentialGroup()
                        .addGap(0, 695, Short.MAX_VALUE)
                        .addComponent(nuevo))
                    .addGroup(trabajarAcaLayout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(txtMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(modificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eliminar)))
                .addContainerGap())
        );
        trabajarAcaLayout.setVerticalGroup(
            trabajarAcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trabajarAcaLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(trabajarAcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(trabajarAcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(puesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(5, 5, 5)
                .addGroup(trabajarAcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(empresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(trabajarAcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buscar)
                    .addGroup(trabajarAcaLayout.createSequentialGroup()
                        .addComponent(txtMensajeBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(7, 7, 7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(trabajarAcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eliminar)
                    .addComponent(modificar)
                    .addComponent(txtMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
        );

        centro.add(trabajarAca, java.awt.BorderLayout.CENTER);

        fondo.add(centro, java.awt.BorderLayout.CENTER);

        arriba.setOpaque(false);

        Ingreso.setFont(new java.awt.Font("Arial", 1, 44)); // NOI18N
        Ingreso.setForeground(new java.awt.Color(219, 219, 219));
        Ingreso.setText("Gestión de Puestos");

        javax.swing.GroupLayout arribaLayout = new javax.swing.GroupLayout(arriba);
        arriba.setLayout(arribaLayout);
        arribaLayout.setHorizontalGroup(
            arribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(arribaLayout.createSequentialGroup()
                .addGap(308, 308, 308)
                .addComponent(Ingreso)
                .addContainerGap(308, Short.MAX_VALUE))
        );
        arribaLayout.setVerticalGroup(
            arribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, arribaLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(Ingreso)
                .addContainerGap())
        );

        fondo.add(arriba, java.awt.BorderLayout.PAGE_START);

        abajo.setOpaque(false);

        volver.setBackground(new java.awt.Color(0, 51, 102));
        volver.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        volver.setForeground(new java.awt.Color(255, 255, 255));
        volver.setText("Volver");
        volver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volverMouseClicked(evt);
            }
        });
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout abajoLayout = new javax.swing.GroupLayout(abajo);
        abajo.setLayout(abajoLayout);
        abajoLayout.setHorizontalGroup(
            abajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abajoLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(volver, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(835, Short.MAX_VALUE))
        );
        abajoLayout.setVerticalGroup(
            abajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abajoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(volver, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        fondo.add(abajo, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 768));

        ImagenFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Abstracto Azul_1024.jpg"))); // NOI18N
        getContentPane().add(ImagenFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 768));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void empresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empresaActionPerformed

    private void buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarMouseClicked

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed

        limpiarTabla(tabla,modeloTabla);    //se limpia la tabla para que al hacer busquedas consecutivas se borren los resultados anteriores
        txtMensajeBusqueda.setText("");
        //obtengo los datos de pantalla
        String codigo2 = codigo.getText();    
        String puesto2 = puesto.getText();
        String empresa2 = empresa.getText();
  
        if("".equals(codigo2) && "".equals(puesto2) && "".equals(empresa2)){ //no completo al menos un criterio de busqueda
            
            GestorPuesto gestorPuesto = GestorPuesto.getInstance();     //se pide la instancia de GestorPuesto
            gestorPuesto.buscarPuestos(modeloTabla);  //busca en la BS y completa la tabla que es pasada por parametro con los resultados
            
        }
        else{
        GestorPuesto gestorPuesto = GestorPuesto.getInstance();     //se pide la instancia de GestorPuesto

        gestorPuesto.buscarPuestos(modeloTabla, codigo2, puesto2, empresa2);  //busca en la BS y completa la tabla que es pasada por parametro con los resultados
        }
        
       if(modeloTabla.data.isEmpty())
           txtMensajeBusqueda.setText("La búsqueda no ha arrojado resultados");
    }//GEN-LAST:event_buscarActionPerformed

    private void puestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puestoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_puestoActionPerformed

    private void nuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_nuevoMouseClicked

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
         AltaPuesto obj= new AltaPuesto();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_nuevoActionPerformed

    private void eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminarMouseClicked

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminarActionPerformed

    private void modificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_modificarMouseClicked

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed

       //http://www.lawebdelprogramador.com/foros/Java/719076-Obtener-el-valor-de-una-celda-el-JTABLE.html
       //aca capturo el primer dato de la celda seleccionada en la columna cero (tiene el codigo)
       Integer filaSeleccionada= tabla.getSelectedRow();
       //si no hay una fila seleccionada filaSeleccionada= -1 por default
        if (filaSeleccionada != -1) {
            Puesto puesto = modeloTabla.getPuesto(tabla.getSelectedRow());
            ModificarPuesto obj = new ModificarPuesto(puesto);
            obj.setVisible(true);
            dispose();
       }
       else
           txtMensaje.setText("Seleccione el puesto que desea modificar"); 
    }//GEN-LAST:event_modificarActionPerformed

    private void volverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_volverMouseClicked

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        // TODO add your handling code here:
        Gestion obj= new Gestion();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_volverActionPerformed

    private void codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoActionPerformed

    private void codigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigoKeyReleased
        
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            buscarActionPerformed(null);
        }
        else
            gestorValidacionesPantalla.keyReleased(codigo);
    }//GEN-LAST:event_codigoKeyReleased

    private void puestoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_puestoKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            buscarActionPerformed(null);
        }
        else
        gestorValidacionesPantalla.keyReleased(puesto);
    }//GEN-LAST:event_puestoKeyReleased

    private void empresaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_empresaKeyReleased
       if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            buscarActionPerformed(null);
        }
        else
        gestorValidacionesPantalla.keyReleased(empresa);
    }//GEN-LAST:event_empresaKeyReleased

    private void codigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigoKeyTyped
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            buscarActionPerformed(null);
        }
        else
        gestorValidacionesPantalla.keyTypedSoloNumeros(codigo, evt);
    }//GEN-LAST:event_codigoKeyTyped

    private void puestoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_puestoKeyTyped
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            buscarActionPerformed(null);
        }
        else
            gestorValidacionesPantalla.keyTyped(puesto, evt);
    }//GEN-LAST:event_puestoKeyTyped

    private void empresaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_empresaKeyTyped
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            buscarActionPerformed(null);
        }
        else
            gestorValidacionesPantalla.keyTyped(empresa, evt);
    }//GEN-LAST:event_empresaKeyTyped

    private void buscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            buscarActionPerformed(null);
        }
    }//GEN-LAST:event_buscarKeyPressed

     public class CustomTableModel extends AbstractTableModel {

        private ArrayList<Puesto> data = new ArrayList<Puesto>();
        private int numColumns = 3; //cant de columnas con la que se crea la tabla
        private String columnNames[] = {"Código", "Nombre de puesto", "Empresa"};   
        
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
            return false;
        }

        @Override
        // Cambia el valor que contiene una determinada casilla de
        // la tabla
        public void setValueAt(Object value, int row, int col) {
            String c = (String)value;
            Integer valorNumerico = null;
            
            fireTableCellUpdated(row, col);
            // Indica que se ha cambiado
            //fireTableDataChanged();
        }
        

        public Puesto getPuesto(int fila) {
            return (Puesto) data.get(fila);
        }

        public List<Puesto> getListaPuestos() {
            return data;
        }


        @Override
        //este metodo muestra por pantalla los nombres pero en realidad se esta manejando una lista con Competencias por detras
        public Object getValueAt(int row, int col) {
            Object retorno=null;
            Puesto c = (Puesto) data.get(row);
            switch(col){
                case 0:
                    retorno= c.getIdPuesto();
                    break;
                case 1:
                    retorno= c.getNombrePuesto();
                    break;
                case 2:
                    retorno=c.getNombreEmpresa();
                    break;
            }
            return retorno;
        }

        public void addPuesto(Puesto puesto) {
            data.add(puesto);      
            fireTableDataChanged();
        }

        private void deleteRow(int row) {
            data.remove(row);
            
            fireTableDataChanged();
        }

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
            java.util.logging.Logger.getLogger(GestionDePuestos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionDePuestos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionDePuestos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionDePuestos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionDePuestos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImagenFondo;
    private javax.swing.JLabel Ingreso;
    private javax.swing.JPanel abajo;
    private javax.swing.JPanel arriba;
    private javax.swing.JButton buscar;
    private javax.swing.JPanel centro;
    private javax.swing.JTextField codigo;
    private javax.swing.JPanel derecha;
    private javax.swing.JButton eliminar;
    private javax.swing.JTextField empresa;
    private javax.swing.JPanel fondo;
    private javax.swing.JPanel izquierda;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton modificar;
    private javax.swing.JButton nuevo;
    private javax.swing.JFrame nuevoFrame;
    private javax.swing.JTextField puesto;
    private javax.swing.JTable tabla;
    private javax.swing.JPanel trabajarAca;
    private javax.swing.JLabel txtMensaje;
    private javax.swing.JLabel txtMensajeBusqueda;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
