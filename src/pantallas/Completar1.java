
package pantallas;

import Dao.DaoOpcionRespuestaCopia;
import Entidades.Cuestionario;
import Entidades.CuestionarioPreguntaCopia;
import Entidades.OpcionRespuestaCopia;
import Entidades.PreguntaCopia;
import Entidades.RespuestaCopia;
import Gestores.GestorCuestionario;
import ParaPantallaCompletar.EditorCelda;
import ParaPantallaCompletar.Renderizador;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_OPTION;
import javax.swing.table.AbstractTableModel;


/**
     * Creates new form Pantallak
     * 
     */
public class Completar1 extends javax.swing.JFrame {
    
    //pido la instancia de gestor de cuestionario
    //GestorCuestionario gestorCuestionario = GestorCuestionario.getInstance();
    Cuestionario cuestionarioGlobal;
    List<PreguntaCopia> preguntasGlobal = new ArrayList();
    
    GestorCuestionario gestorCuestionario = GestorCuestionario.getInstance();
    
     public Completar1() {
        initComponents();
        setSize(1024, 768);
        setLocationRelativeTo(null);
     }    
    
    public Completar1(Cuestionario cuestionario, List<PreguntaCopia> preguntas) {
        initComponents();
        setSize(1024, 768);
        setLocationRelativeTo(null);
        
        //Aumentar en 1 la cantidad de accesos a responder el cuestionario
        //Cuestionario aux = cuestionario;
        //cuestionario = gestorCuestionario.nuevoIntento(aux);
        
        cuestionarioGlobal=cuestionario;
        preguntasGlobal.addAll(preguntas);
        
        int longitudLista= preguntas.size();
        mostrarPreguntas(cuestionario, preguntas);
        
        switch(longitudLista){
            
            case 0:{
                
            }
                
           
            case 1:{
                
                
                ModeloPersonalizado modeloTabla1 = new ModeloPersonalizado(preguntas.get(0));

                jTablePregunta0.setModel(modeloTabla1); //Aca seteo un modelo personalizado de jtable para que pueda cargar cosas dinamicamente
                jTablePregunta0.getColumnModel().getColumn(0).setCellRenderer(new Renderizador());
                jTablePregunta0.getColumnModel().getColumn(0).setCellEditor(new EditorCelda()); //Aca estoy setenado en la columna 0 con los modelos personalizados del jcheckbox

                jTablePregunta1.setVisible(false);
                jTablePregunta2.setVisible(false);
                jTablePregunta3.setVisible(false);
                
                
                jTablePregunta3.setVisible(false);
                
            }
            
            case 2:{
                
                ModeloPersonalizado modeloTabla1 = new ModeloPersonalizado(preguntas.get(0));
                ModeloPersonalizado modeloTabla2 = new ModeloPersonalizado(preguntas.get(1));
               
                

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
                ModeloPersonalizado modeloTabla1 = new ModeloPersonalizado(preguntas.get(0));
                ModeloPersonalizado modeloTabla2 = new ModeloPersonalizado(preguntas.get(1));
                ModeloPersonalizado modeloTabla3 = new ModeloPersonalizado(preguntas.get(2));
                

                jTablePregunta0.setModel(modeloTabla1); //Aca seteo un modelo personalizado de jtable para que pueda cargar cosas dinamicamente
                jTablePregunta0.getColumnModel().getColumn(0).setCellRenderer(new Renderizador());
                jTablePregunta0.getColumnModel().getColumn(0).setCellEditor(new EditorCelda()); //Aca estoy setenado en la columna 0 con los modelos personalizados del jcheckbox

                jTablePregunta1.setModel(modeloTabla2);
                jTablePregunta1.getColumnModel().getColumn(0).setCellRenderer(new Renderizador());
                jTablePregunta1.getColumnModel().getColumn(0).setCellEditor(new EditorCelda());

                jTablePregunta2.setModel(modeloTabla3);
                jTablePregunta2.getColumnModel().getColumn(0).setCellRenderer(new Renderizador());
                jTablePregunta2.getColumnModel().getColumn(0).setCellEditor(new EditorCelda());
                 

            }
            
            default: {
                ModeloPersonalizado modeloTabla1 = new ModeloPersonalizado(preguntas.get(0));
                ModeloPersonalizado modeloTabla2 = new ModeloPersonalizado(preguntas.get(1));
                ModeloPersonalizado modeloTabla3 = new ModeloPersonalizado(preguntas.get(2));
                ModeloPersonalizado modeloTabla4 = new ModeloPersonalizado(preguntas.get(3));

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
    
    public void mostrarPreguntas(Cuestionario cuestionario, List<PreguntaCopia> preguntas){
        
        int longitudLista= preguntas.size();
        
        switch(longitudLista){
            
            case 1:{
                
                nombrePregunta0.setText(buscarPregunta(cuestionario).get(cuestionario.getPreguntasContestadas()).getPreguntaCopia().getPregunta());
                nombrePregunta1.setVisible(false);
                nombrePregunta2.setVisible(false);
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
                nombrePregunta1.setText(buscarPregunta(cuestionario).get(cuestionario.getPreguntasContestadas() + 1).getPreguntaCopia().getPregunta());
                nombrePregunta2.setText(buscarPregunta(cuestionario).get(cuestionario.getPreguntasContestadas() + 2).getPreguntaCopia().getPregunta());
                
                nombrePregunta3.setVisible(false);
            }
            
            default: {
                nombrePregunta0.setText(preguntas.get(0).getPregunta());
                nombrePregunta1.setText(preguntas.get(1).getPregunta());
                nombrePregunta2.setText(preguntas.get(2).getPregunta());
                nombrePregunta3.setText(preguntas.get(3).getPregunta());
            }
        }
        
         
    }
    
    public boolean cargarDatos(Cuestionario cuestionario,List<PreguntaCopia> preguntas){
        int longitud = preguntas.size();
        boolean ret = false;
        DaoOpcionRespuestaCopia daoORC = new DaoOpcionRespuestaCopia();
        List <OpcionRespuestaCopia> listaORC= null;
        if( jTablePregunta0.getSelectedRow()== -1 || jTablePregunta1.getSelectedRow()== -1 ||jTablePregunta2.getSelectedRow()== -1 || jTablePregunta3.getSelectedRow()== -1 ){
            JOptionPane.showConfirmDialog(null, "Debe contestar todas las preguntas antes de pasar al siguiente bloque", "Error", JOptionPane.ERROR_MESSAGE);
            ret = false;
        }
        else{
            switch(longitud){
                case 2:{
                    
                    for (int i = 0; i < 2; i++) {

                        List<RespuestaCopia> listaDeRespuestas = null;
                        Set<RespuestaCopia> respuestasSet = preguntas.get(i).getOpcionRespuestaCopia().getRespuestaCopias();
                        listaDeRespuestas = new ArrayList<RespuestaCopia>(respuestasSet);

                        switch (i) {
                            case 0: {
                                String respuesta = (String) jTablePregunta0.getValueAt(jTablePregunta0.getSelectedRow(), 1);

                                int idRespuestaSeleccionada = getIdRespuesta(respuesta, listaDeRespuestas);
                                
                                preguntas.get(i).getOpcionRespuestaCopia().setSeleccion(idRespuestaSeleccionada);
                                
                                listaORC.add(preguntas.get(i).getOpcionRespuestaCopia());
                                break;
                            }
                            case 1: {
                                String respuesta = (String) jTablePregunta1.getValueAt(jTablePregunta1.getSelectedRow(), 1);

                                int idRespuestaSeleccionada = getIdRespuesta(respuesta, listaDeRespuestas);

                                preguntas.get(i).getOpcionRespuestaCopia().setSeleccion(idRespuestaSeleccionada);
                                listaORC.add(preguntas.get(i).getOpcionRespuestaCopia());
                                break;
                            }
                        }    
                    }
                    daoORC.updateListaOpcionRespuestaCopia(listaORC);
                    
                }
                
                default: {
                    for (int i = 0; i < 4; i++) {

                        List<RespuestaCopia> listaDeRespuestas = null;
                        Set<RespuestaCopia> respuestasSet = preguntas.get(i).getOpcionRespuestaCopia().getRespuestaCopias();
                        listaDeRespuestas = new ArrayList<RespuestaCopia>(respuestasSet);

                        switch (i) {
                            case 0: {
                                String respuesta = (String) jTablePregunta0.getValueAt(jTablePregunta0.getSelectedRow(), 1);

                                int idRespuestaSeleccionada = getIdRespuesta(respuesta, listaDeRespuestas);

                                preguntas.get(i).getOpcionRespuestaCopia().setSeleccion(idRespuestaSeleccionada);
                                listaORC.add(preguntas.get(i).getOpcionRespuestaCopia());
                                break;
                            }
                            case 1: {
                                String respuesta = (String) jTablePregunta1.getValueAt(jTablePregunta1.getSelectedRow(), 1);

                                int idRespuestaSeleccionada = getIdRespuesta(respuesta, listaDeRespuestas);

                                preguntas.get(i).getOpcionRespuestaCopia().setSeleccion(idRespuestaSeleccionada);
                                listaORC.add(preguntas.get(i).getOpcionRespuestaCopia());
                                break;
                            }

                            case 2: {
                                String respuesta = (String) jTablePregunta2.getValueAt(jTablePregunta2.getSelectedRow(), 1);

                                int idRespuestaSeleccionada = getIdRespuesta(respuesta, listaDeRespuestas);

                                preguntas.get(i).getOpcionRespuestaCopia().setSeleccion(idRespuestaSeleccionada);
                                listaORC.add(preguntas.get(i).getOpcionRespuestaCopia());
                                break;
                            }

                            case 3: {
                                String respuesta = (String) jTablePregunta3.getValueAt(jTablePregunta3.getSelectedRow(), 1);

                                int idRespuestaSeleccionada = getIdRespuesta(respuesta, listaDeRespuestas);

                                preguntas.get(i).getOpcionRespuestaCopia().setSeleccion(idRespuestaSeleccionada);
                                listaORC.add(preguntas.get(i).getOpcionRespuestaCopia());
                                break;
                            }

                        }

                    }
                    daoORC.updateListaOpcionRespuestaCopia(listaORC);
                    ret = true;
                }
            }
        }
        return ret;
    }
            
    public int getIdRespuesta(String string, List<RespuestaCopia> listaRespuestaCopia){
        int ret=-1;
        for(RespuestaCopia rc: listaRespuestaCopia){
            if(string.equals(rc.getRespuesta())){
                ret = rc.getIdRespuestaCopia();
                
                break;
            }
            
        }
        return ret;
    }        
    
    public class ModeloPersonalizado extends AbstractTableModel{
       
        //Aca lo que hago es definir una lista CuestionarioPreguntaCopia
        public List<RespuestaCopia> listaDeRespuestas = null;
        private String[] columnas = {"", "Respuestas"}; 
        private boolean [] editables={true,false}; //digo que columnas de mi modelo personalizado son editables
           
                
        public ModeloPersonalizado(PreguntaCopia pregunta){
            
            
            Set<RespuestaCopia> respuestasSet=pregunta.getOpcionRespuestaCopia().getRespuestaCopias();
            
            listaDeRespuestas =  new ArrayList<RespuestaCopia>(respuestasSet);
            System.out.println(pregunta.getIdPreguntaCopia() + " "+ pregunta.getPregunta());
            for(RespuestaCopia rc: listaDeRespuestas){
                System.out.println(rc.getIdRespuestaCopia() + " " +rc.getRespuesta());
            }
            
            
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

        nombrePregunta1.setAlignment(java.awt.Label.CENTER);
        nombrePregunta1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        nombrePregunta1.setText("pregunta 1");

        nombrePregunta0.setAlignment(java.awt.Label.CENTER);
        nombrePregunta0.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        nombrePregunta0.setText("Pregunta 0");

        nombrePregunta2.setAlignment(java.awt.Label.CENTER);
        nombrePregunta2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        nombrePregunta2.setText("pregunta 2");

        nombrePregunta3.setAlignment(java.awt.Label.CENTER);
        nombrePregunta3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        nombrePregunta3.setText("pregunta 3");

        jTablePregunta0.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
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
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane5)
                    .addComponent(jScrollPane3)
                    .addComponent(nombrePregunta0, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nombrePregunta1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nombrePregunta2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nombrePregunta3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 739, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nombrePregunta0, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombrePregunta1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(nombrePregunta2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombrePregunta3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
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
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 110, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void siguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_siguienteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_siguienteMouseClicked

    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed
        if(cargarDatos(cuestionarioGlobal, preguntasGlobal)){
            
            if(gestorCuestionario.preguntasSinContestar(cuestionarioGlobal).isEmpty()){//Contesto todo
                
                gestorCuestionario.setEstadoFinalizado(cuestionarioGlobal);
                JOptionPane.showMessageDialog (null, "El cuestionario se ha completado con éxito", "Cuestionario completo", JOptionPane.INFORMATION_MESSAGE);
                
                //Vuelve al inicio
                Inicio obj = new Inicio();
                obj.setVisible(true);
                dispose();
                
            }else{//Tiene preguntas sin contestar
                //Nuevo bloque
                Completar1 obj = new Completar1(cuestionarioGlobal, gestorCuestionario.preguntasSinContestar(cuestionarioGlobal));
                obj.setVisible(true);
                dispose();
            }
            
        }

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
