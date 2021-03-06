/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import Gestores.GestorCompetencia;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.List;
import Entidades.Competencia;
import Entidades.Puesto;
import Gestores.GestorPuesto;
import Gestores.GestorValidacionesPantalla;
import java.applet.AudioClip;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.swing.AbstractListModel;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author pc
 */
public class ModificarPuesto extends javax.swing.JFrame {

    CustomListModel modeloLista = new CustomListModel();
    CustomTableModel modeloTabla = new CustomTableModel();

    //pido la instancia de gestor de puestos
    GestorPuesto gestorPuesto = GestorPuesto.getInstance();

    //pido la instancia de gestor de validaciones de pantalla
    GestorValidacionesPantalla gestorValidacionesPantalla = GestorValidacionesPantalla.getInstance();

    //declaro una variable de puesto global para ser visible en las acciones de los botones
    //SE PUEDE BUSCAR OTRA MANERA
    Puesto puestoAux;
    boolean puestoEnUso;

    public ModificarPuesto() {

    }

    public ModificarPuesto(Puesto puesto) {
        initComponents();
        setSize(1024, 768);
        setLocationRelativeTo(null);
        lista.setModel(modeloLista);
        tabla.setModel(modeloTabla);
        tabla.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        //COPIO EL PUESTO PASADO POR PARAMETRO A OTRO AUX PARA TENER VISIBILIDAD GLOBAL
        //SE PUEDE CAMBIAR
        puestoAux = puesto;
        //muestro por pantalla el codigo no editable pasandolo a string previamente
        txtCodigo.setText(String.valueOf(puesto.getIdPuesto()));
        //muestro el resto de datos por pantalla
        txtNombre.setText(puesto.getNombrePuesto());
        txtEmpresa.setText(puesto.getNombreEmpresa());
        txtDescripcion.setText(puesto.getDescripcion());

        GestorCompetencia gestorCompetencia = GestorCompetencia.getInstance();

        //competenciasSeleccionadas: tiene las competencias que ya estaban cargadas en el puesto
        List competenciasSeleccionadas = new ArrayList();
        //convierto el set obtenido a una lista
        competenciasSeleccionadas.addAll(puesto.getCompetencias());
        //allCompetencias solo se usa para cargar modeloLista, despues se maneja todo con la lista dentro de modeloLista
        List allCompetencias = gestorCompetencia.allCompetenciasOrdenadasPorNombre();

        //ademas de pasar la lista de competencias (que ya viene como parametro dentro de puesto) a la tabla,
        //SE BUSCAN LAS PONDERACIONES EN LA BD y tambien se cargan en la tabla
        gestorPuesto.cargarTablaCompetenciasYPonderaciones(modeloTabla, puesto, competenciasSeleccionadas);

        //le borro a la lista de competencias originales las que ya estan cargadas en el puesto para que no se muestren repetidas 
        Competencia comp;
        int idCompPuesto;
        int idCompOriginal;
        //comparo la primer competencia de competenciasSeleccionadas (las del puesto) con todas las de allCompetencias (las originales)
        //cuando encuentro la coincidencia de ids, borro la competencia de la lista allCompetencias y
        //borro la primer competencia de competenciasSeleccionadas para poder salir del while cuando se vacie esta lista
        while (!competenciasSeleccionadas.isEmpty()) {
            comp = (Competencia) competenciasSeleccionadas.get(0);
            idCompPuesto = comp.getIdCompetencia();
            for (int i = 0; i < allCompetencias.size(); i++) {
                comp = (Competencia) allCompetencias.get(i);
                idCompOriginal = comp.getIdCompetencia();
                if (idCompPuesto == idCompOriginal) {
                    allCompetencias.remove(i);
                    //no me importa vaciar la lista competenciasSeleccionadas porque ya no se usa (las competencias del puesto estan en la lista data de modeloTabla)
                    competenciasSeleccionadas.remove(0);
                }
            }
        }

        Competencia competencia;
        //completo la tabla izq con las competencias originales menos las que ya estan en el puesto (borradas arriba)
        for (int i = 0; i < allCompetencias.size(); i++) {
            competencia = (Competencia) allCompetencias.get(i);
            modeloLista.addCompetencia(competencia);
        }
        

        //puestoEnUso= true -> el puesto tiene puestosCopias asociados y esta en uso (no se pueden modificar las competencias)
        //puestoEnUso= false -> el puesto no esta en uso y se pueden modificar las competencias
        puestoEnUso = gestorPuesto.verificarPuestoEnUso(puesto.getIdPuesto());

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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campoTexto = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnRemove = new javax.swing.JButton();
        btnAddAll = new javax.swing.JButton();
        btnRemoveAll = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtEmpresa = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JLabel();
        cancelar = new javax.swing.JButton();
        aceptar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        fondoImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMaximumSize(new java.awt.Dimension(1024, 768));
        jPanel1.setMinimumSize(new java.awt.Dimension(1024, 768));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 768));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 44)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(219, 219, 219));
        jLabel1.setText("Modificar Puesto");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Lista original");

        campoTexto.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        campoTexto.setForeground(new java.awt.Color(255, 255, 255));
        campoTexto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnAdd.setBackground(new java.awt.Color(0, 51, 102));
        btnAdd.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(204, 204, 204));
        btnAdd.setText(">>");
        btnAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        btnAdd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnAddKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Lista a rellenar");

        btnRemove.setBackground(new java.awt.Color(0, 51, 102));
        btnRemove.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnRemove.setForeground(new java.awt.Color(204, 204, 204));
        btnRemove.setText("<<");
        btnRemove.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        btnRemove.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnRemoveKeyPressed(evt);
            }
        });

        btnAddAll.setBackground(new java.awt.Color(0, 51, 102));
        btnAddAll.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnAddAll.setForeground(new java.awt.Color(204, 204, 204));
        btnAddAll.setText("Add All");
        btnAddAll.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAllActionPerformed(evt);
            }
        });
        btnAddAll.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnAddAllKeyPressed(evt);
            }
        });

        btnRemoveAll.setBackground(new java.awt.Color(0, 51, 102));
        btnRemoveAll.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnRemoveAll.setForeground(new java.awt.Color(204, 204, 204));
        btnRemoveAll.setText("Remove All");
        btnRemoveAll.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRemoveAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveAllActionPerformed(evt);
            }
        });
        btnRemoveAll.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnRemoveAllKeyPressed(evt);
            }
        });

        lista.setBackground(new java.awt.Color(0, 51, 102));
        lista.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lista.setForeground(new java.awt.Color(255, 255, 255));
        lista.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lista.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                listaComponentAdded(evt);
            }
        });
        lista.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                listaFocusGained(evt);
            }
        });
        jScrollPane3.setViewportView(lista);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Código:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nombre de puesto:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Empresa:");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Descripción:");

        txtNombre.setBackground(new java.awt.Color(0, 51, 102));
        txtNombre.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtEmpresa.setBackground(new java.awt.Color(0, 51, 102));
        txtEmpresa.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        txtEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        txtEmpresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmpresaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmpresaKeyTyped(evt);
            }
        });

        txtCodigo.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(255, 255, 255));

        cancelar.setBackground(new java.awt.Color(0, 51, 102));
        cancelar.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        cancelar.setForeground(new java.awt.Color(255, 255, 255));
        cancelar.setText("Cancelar");
        cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelar.setPreferredSize(new java.awt.Dimension(137, 41));
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        cancelar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cancelarKeyPressed(evt);
            }
        });

        aceptar.setBackground(new java.awt.Color(0, 51, 102));
        aceptar.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        aceptar.setForeground(new java.awt.Color(255, 255, 255));
        aceptar.setText("Aceptar");
        aceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });
        aceptar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                aceptarKeyPressed(evt);
            }
        });

        txtDescripcion.setBackground(new java.awt.Color(0, 51, 102));
        txtDescripcion.setColumns(20);
        txtDescripcion.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        txtDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        txtDescripcion.setRows(3);
        txtDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDescripcionKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescripcionKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(txtDescripcion);

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
        tabla.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tablaAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tabla);
        tabla.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setPreferredWidth(190);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(90, 90, 90)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(txtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(190, 190, 190)
                                .addComponent(jLabel2)
                                .addGap(370, 370, 370)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(246, 246, 246)
                                .addComponent(aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(237, 237, 237)
                                .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(58, 58, 58)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(campoTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 890, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(7, 7, 7)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(31, 31, 31)
                                            .addComponent(btnAdd))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(31, 31, 31)
                                            .addComponent(btnRemove))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(11, 11, 11)
                                            .addComponent(btnAddAll, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(btnRemoveAll))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(jLabel1)))
                .addGap(76, 76, 76))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtCodigo))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel7))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnAdd)
                        .addGap(9, 9, 9)
                        .addComponent(btnRemove)
                        .addGap(9, 9, 9)
                        .addComponent(btnAddAll)
                        .addGap(9, 9, 9)
                        .addComponent(btnRemoveAll))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(campoTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        fondoImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Abstracto Azul_1024.jpg"))); // NOI18N
        fondoImagen.setText("jLabel9");
        fondoImagen.setPreferredSize(new java.awt.Dimension(1024, 768));
        getContentPane().add(fondoImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
         
        int resultado = gestorPuesto.modificarPuesto(puestoAux, txtNombre.getText(), txtEmpresa.getText(), txtDescripcion.getText(), modeloTabla.getListaCompetencias(), modeloTabla.getListaPonderacion());
        /* 1: todo correcto
           2: ponderaciones vacias
           3: ponderaciones fuera de rango (0-10)
           4: campos en blanco
           5: sin al menos una competencia seleccionada
           6: el nombre ya esta en uso
         */

        switch (resultado) {
            //todo correcto
            case 1:
                AudioClip sonido;
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/exito4.wav"));
                sonido.play();
                JOptionPane.showMessageDialog(null, "La operación ha culminado con éxito");
                GestionDePuestos obj = new GestionDePuestos();
                obj.setVisible(true);
                dispose();
                break;

            //hay ponderaciones sin completar
            case 2:
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/error2.wav"));
                sonido.play();
                campoTexto.setText("Algunas competencias no tienen una ponderación definida");
                break;

            //hay ponderaciones que no estan entre 0 y 10
            case 3:
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/error2.wav"));
                sonido.play();
                campoTexto.setText("Las ponderaciones deben ser valores entre 0 y 10");
                break;

            //nombre o empresa estan vacios
            case 4:
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/error2.wav"));
                sonido.play();
                campoTexto.setText("Algunos campos se encuentran en blanco");
                if (txtEmpresa.getText().equals("")) {
                    txtEmpresa.requestFocus();
                    txtEmpresa.setBackground(java.awt.Color.RED);
                }
                if (txtDescripcion.getText().equals("")) {
                    txtDescripcion.requestFocus();
                    txtDescripcion.setBackground(java.awt.Color.RED);
                }
                if (txtNombre.getText().equals("")) {
                    txtNombre.requestFocus();
                    txtNombre.setBackground(java.awt.Color.red);
                }
                break;

            //sin al menos una competencia seleccionada
            case 5:
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/error2.wav"));
                sonido.play();
                campoTexto.setText("Seleccione al menos una competencia");
                lista.setForeground(java.awt.Color.red);
                break;

            //sin al menos una competencia seleccionada
            case 6:
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/error2.wav"));
                sonido.play();
                campoTexto.setText("El nombre del puesto ya esta en uso");
                txtNombre.requestFocus();
                txtNombre.setBackground(java.awt.Color.red);
                break;
        }
    }//GEN-LAST:event_aceptarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed

        GestionDePuestos obj = new GestionDePuestos();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void listaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_listaFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_listaFocusGained

    private void listaComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_listaComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_listaComponentAdded

    private void btnRemoveAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveAllActionPerformed
        if (!puestoEnUso) { //significa que se pueden agregar/quitar competencias porq el puesto no esta en uso
            while (modeloTabla.getRowCount() != 0) { //se va a ejecutar mientras haya alguna fila en la tabla
                modeloLista.addCompetencia((Competencia) modeloTabla.getCompetencia(0));
                modeloTabla.deleteRow(0);
            }
        } else {
            AudioClip sonido;
            sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/error2.wav"));
            sonido.play();
            campoTexto.setText("No es posible quitar competencias debido a que hay cuestionarios generados para este puesto");
        }
    }//GEN-LAST:event_btnRemoveAllActionPerformed

    private void btnAddAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAllActionPerformed
        if (!puestoEnUso) { //significa que se pueden agregar/quitar competencias porq el puesto no esta en uso
            while (modeloLista.getSize() != 0) {
                Competencia competencia = modeloLista.getCompetencia(0);
                modeloTabla.addCompetencia(competencia);
                modeloLista.eliminarCompetencia(0);
            }
        } else {
            AudioClip sonido;
            sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/error2.wav"));
            sonido.play();
            campoTexto.setText("No es posible agregar competencias debido a que hay cuestionarios generados para este puesto");
        }
    }//GEN-LAST:event_btnAddAllActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        if (!puestoEnUso) { //significa que se pueden agregar/quitar competencias porq el puesto no esta en uso
            if ((tabla.getSelectedRow() == -1)) {
                AudioClip sonido;
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/error2.wav"));
                sonido.play();
                campoTexto.setText("Seleccione un elemento antes de presionar el boton");
            } else {
                campoTexto.setText("");
                int row = tabla.getSelectedRow();
                Competencia competencia = modeloTabla.getCompetencia(row);
                modeloLista.addCompetencia(competencia);
                modeloTabla.deleteRow(row);
            }
        } else {
            AudioClip sonido;
            sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/error2.wav"));
            sonido.play();
            campoTexto.setText("No es posible quitar competencias debido a que hay cuestionarios generados para este puesto");
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if (!puestoEnUso) { //significa que se pueden agregar/quitar competencias porq el puesto no esta en uso
            if (lista.getSelectedValue() != null || lista.getComponentCount() == 0) {
                campoTexto.setText("");
                // String aux = lista.getSelectedValue();
                Competencia competencia = modeloLista.getCompetencia(lista.getSelectedIndex());
                modeloTabla.addCompetencia(competencia);
                modeloLista.eliminarCompetencia(lista.getSelectedIndex());
            } else {
                AudioClip sonido;
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/error2.wav"));
                sonido.play();
                campoTexto.setText("Seleccione un elemento antes de presionar el boton");
            }
        } else {
            AudioClip sonido;
            sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/error2.wav"));
            sonido.play();
            campoTexto.setText("No es posible agregar competencias debido a que hay cuestionarios generados para este puesto");
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked

//no se sabe todavia para que sirve
        /*   
        int fila = tabla.rowAtPoint(evt.getPoint());
    int columna = tabla.columnAtPoint(evt.getPoint());
    if ((fila > -1) && (columna > -1)) {
        filaSeleccionada = fila;
    }*/

    }//GEN-LAST:event_tablaMouseClicked

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        gestorValidacionesPantalla.keyReleased(txtNombre);
    }//GEN-LAST:event_txtNombreKeyReleased

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        gestorValidacionesPantalla.keyTyped(txtNombre, evt);
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtEmpresaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmpresaKeyReleased
        gestorValidacionesPantalla.keyReleased(txtEmpresa);
    }//GEN-LAST:event_txtEmpresaKeyReleased

    private void txtEmpresaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmpresaKeyTyped
        gestorValidacionesPantalla.keyTyped(txtEmpresa, evt);
    }//GEN-LAST:event_txtEmpresaKeyTyped

    private void txtDescripcionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyReleased
        gestorValidacionesPantalla.keyReleased(txtDescripcion);
    }//GEN-LAST:event_txtDescripcionKeyReleased

    private void txtDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyTyped
        gestorValidacionesPantalla.keyTyped(txtDescripcion, evt);
    }//GEN-LAST:event_txtDescripcionKeyTyped

    private void aceptarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aceptarKeyPressed
       if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            aceptarActionPerformed(null);
        }
    }//GEN-LAST:event_aceptarKeyPressed

    private void cancelarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cancelarKeyPressed
       if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            cancelarActionPerformed(null);
        }
    }//GEN-LAST:event_cancelarKeyPressed

    private void btnAddKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnAddKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            btnAddActionPerformed(null);
        }
    }//GEN-LAST:event_btnAddKeyPressed

    private void btnRemoveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnRemoveKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            btnRemoveActionPerformed(null);
        }
    }//GEN-LAST:event_btnRemoveKeyPressed

    private void btnAddAllKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnAddAllKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            btnAddAllActionPerformed(null);
        }
    }//GEN-LAST:event_btnAddAllKeyPressed

    private void btnRemoveAllKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnRemoveAllKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            btnRemoveAllActionPerformed(null);
        }
    }//GEN-LAST:event_btnRemoveAllKeyPressed

    private void tablaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tablaAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaAncestorAdded

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
            java.util.logging.Logger.getLogger(ModificarPuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarPuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarPuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarPuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ModificarPuesto().setVisible(true);
            }
        });
    }

    // http://serprogramador.es/usando-un-jlist-para-almacenar-objetos-java-swing/
    public class CustomListModel extends AbstractListModel {

        private ArrayList<Competencia> lista = new ArrayList<>();

        @Override
        public int getSize() {
            return lista.size();
        }

        @Override
        public Object getElementAt(int index) {
            Competencia c = lista.get(index);
            return c.getNombreCompetencia();
        }

        public void addCompetencia(Competencia c) {
            lista.add(c);
            this.fireIntervalAdded(this, getSize(), getSize() + 1);
        }

        public void eliminarCompetencia(int index0) {
            lista.remove(index0);
            this.fireIntervalRemoved(index0, getSize(), getSize() + 1);
        }

        public Competencia getCompetencia(int index) {
            return lista.get(index);
        }

    }

    //http://jcaballero-progravan1.blogspot.com.ar/2011/03/jtable.html
    //http://docs.oracle.com/javase/tutorial/uiswing/components/table.html#data
    public class CustomTableModel extends AbstractTableModel {

        private ArrayList<Competencia> data = new ArrayList<Competencia>();
        private ArrayList<Integer> ponderacion = new ArrayList<Integer>();
        private int numColumns = 2; //cant de columnas con la que se crea la tabla
        private String columnNames[] = {"Competencia", "Ponderación"};
        // private Class classes[]={String.class ,String.class}; //tipo de las columnas
        private boolean editable[] = {false, true};

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

        @Override
        // Cambia el valor que contiene una determinada casilla de la tabla
        public void setValueAt(Object value, int row, int col) {

            if (value.getClass() == String.class) {
                //si entra el valor por pantalla viene un string
                String c = (String) value;
                Integer valorNumerico = null;
                if (c.matches("[0-9]*")) {
                    valorNumerico = Integer.parseInt(c);
                    if (valorNumerico >= 0 && valorNumerico <= 10) {
                        ponderacion.set(row, valorNumerico);
                    } else {
                        campoTexto.setText("La ponderacion debe estar entre 0 y 10");
                    }

                } else {
                    campoTexto.setText("El campo ponderacion debe ser numerico entre 0 y 10");
                }
                /*valorNumerico = Integer.parseInt((String) value);
                ponderacion.set(row, valorNumerico);*/
            } else {
                //si se carga desde la BD viene como un int
                ponderacion.set(row, (Integer) value);
            }

            fireTableCellUpdated(row, col);
        }

        public Competencia getCompetencia(int fila) {
            return (Competencia) data.get(fila);
        }

        public List<Competencia> getListaCompetencias() {
            return data;
        }

        public List<Integer> getListaPonderacion() {
            return ponderacion;
        }

        @Override
        //este metodo muestra por pantalla los nombres pero en realidad se esta manejando una lista con Competencias por detras
        public Object getValueAt(int row, int col) {
            Competencia c = (Competencia) data.get(row);
            //Si la columa es la 0 muestra el nombre de la competencia
            // sino (es la columna 1) muestro la ponderacion
            return col == 0 ? c.getNombreCompetencia() : ponderacion.get(row);  //cosas locas sacadas de internet
            //return data.get(row)[col];
        }

        public void addCompetencia(Competencia competencia) {
            data.add(competencia);
            ponderacion.add(null);
            fireTableDataChanged();
        }

        private void deleteRow(int row) {
            data.remove(row);
            ponderacion.remove(row);
            fireTableDataChanged();
        }

        public void mostrar() {
            for (int i = 0; i < ponderacion.size(); i++) {

                System.out.print(i + 1 + " -> " + ponderacion.get(i) + "\n");
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAddAll;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnRemoveAll;
    private javax.swing.JLabel campoTexto;
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel fondoImagen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList<String> lista;
    private javax.swing.JTable tabla;
    private javax.swing.JLabel txtCodigo;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtEmpresa;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
