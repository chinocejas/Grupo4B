/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestores;

import Entidades.*;
import Dao.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * @author Agustina
 */
public class GestorCuestionario {
    
    DaoCuestionario daoCuestionario = new DaoCuestionario();
    DaoCandidato daoCandidato = new DaoCandidato();
    DaoRespuesta daoRespuesta = new DaoRespuesta();
    DaoCuestionarioPreguntaCopia daoCuestionarioPreguntaCopia = new DaoCuestionarioPreguntaCopia();
    //pido la instancia de gestor de reposiorio
    GestorRepositorio gestorRepositorio = GestorRepositorio.getInstance();
    
            
    
    
    public GestorCuestionario() {
    }
    
    public static GestorCuestionario getInstance() {
        return GestorCuestionarioHolder.INSTANCE;
    }

    public void iniciaCuestionario(Cuestionario cuestionarioactivo) {
           
           List<PreguntaCopia> preguntasAsignadas = new LinkedList<PreguntaCopia>(); 
           PuestoCopia puestoAevaluar = cuestionarioactivo.getPuestoCopia();
           //Le pido y casteo competenciasCopia
           Set<CompetenciaCopia> competenciasSet= puestoAevaluar.getCompetencias();
            // castea set to list
           List<CompetenciaCopia> competencias= new ArrayList<CompetenciaCopia>(competenciasSet);
           // PARAPROBAR
            for (CompetenciaCopia competencia : competencias) {
                
                /* PARA ESCRIBIR EN EL PANEL DE INSTRUCCIONES
                try {
                    doc.insertString(doc.getLength(),"\n COMPETENCIA:"+competencia.getNombreCompetencia()+"\n", null);
                }                
                catch(BadLocationException exc) {
                    exc.printStackTrace();
                }   */          
                
                                
                //Le pido y casteo FactoresCopia a cada Competencia
                 Set<FactorCopia> factoresSet= competencia.getFactorCopias();
                // castea set to list
                 List<FactorCopia> factores= new ArrayList<FactorCopia>(factoresSet);
                 for (FactorCopia factor : factores){
                    //Le pido y casteo PreguntasCopia a cada FACTOR
                    Set<PreguntaCopia> preguntasSet= factor.getPreguntaCopias();
                    // castea set to list
                    List<PreguntaCopia> preguntas = new LinkedList<PreguntaCopia>(preguntasSet);
                    
                    // ESTO VA EN UN METODO 
                    Collections.shuffle(preguntas);
                    
                    //Guardo las dos primeras posiciones de la lista desordenada
                    preguntasAsignadas.add(preguntas.get(0));
                    preguntasAsignadas.add(preguntas.get(1));
                                        
                }
            }
            // Desordeno nuevamente la lista de preguntasAsignadas
            Collections.shuffle(preguntasAsignadas);
            
            
                    for(int i = 0 ; i < preguntasAsignadas.size(); i++){
                        // GUARDANDO LAS PREGUNTA
                        CuestionarioPreguntaCopiaId cuestionarioPreguntaCopiaId = new CuestionarioPreguntaCopiaId(cuestionarioactivo.getIdCuestionario(), preguntasAsignadas.get(i).getIdPreguntaCopia());
                        CuestionarioPreguntaCopia guardando = new CuestionarioPreguntaCopia(cuestionarioPreguntaCopiaId, cuestionarioactivo, preguntasAsignadas.get(i),i);
                        savePreguntaCopiaAsignada(guardando);
                    }
            // CAMBIO DE ESTADO DE CUESTIONARIO
            cuestionarioactivo.setEstado(5);
            cuestionarioactivo.setFechaCreacion(getFecha());
            cuestionarioactivo.setPreguntasContestadas(0);
            update(cuestionarioactivo);
                    
             
        
    }
    
    private static class GestorCuestionarioHolder {

        private static final GestorCuestionario INSTANCE = new GestorCuestionario();
    }
        
    public List findQuest(int id_cuestionario) {      
       
       return daoCuestionario.findQuestFor(id_cuestionario);
       
       
           
                    
    }
        
    public List<Cuestionario> cargarCuestionarios(List<Candidato> candidatos, PuestoCopia puestoCopiado){
        List<Cuestionario> ret = new ArrayList<Cuestionario>();
        /*id_cuestionario, preguntas_contestadas, cantidad_accesos, fecha_creacion, 
            fecha_inicio, fecha_ultimo_ingreso, fecha_finalizacion, clave, 
            estado, tiempo_maximo, id_candidato, id_puesto_copia)*/
        //id_puesto X, id_candidato, clave X, estado=activo X,
        
        
        for(Candidato cand: candidatos){
            Cuestionario cuest = new Cuestionario();
            
            //estado
            cuest.setEstado(1);
            //clave
            String clave = generarClave(8);
            cuest.setClave(clave);
            //clave foranea a puestoCopia
            cuest.setPuestoCopia(puestoCopiado);
            //candidato
            cuest.setCandidato(cand);
            //fecha
            Date fechaCreacion = new Date();
            DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
            hourdateFormat.format(fechaCreacion);
            cuest.setFechaCreacion(fechaCreacion);
            cuest.setTiempoMaximo(0);
            
            
            //Asocio cuestionario y candidato
            //cand.addCuestionario(cuest);
            //update Candidato
            //daoCandidato.update(cand);
            
            
            //debo devolverlo con las id ascociadas
            ret.add(cuest);
        }
        daoCuestionario.saveCuestionarios(ret);
        
        return ret;
    }
        
    private String generarClave(int longitud) {
        String cadenaAleatoria = "";
        long milis = new java.util.GregorianCalendar().getTimeInMillis();
        Random r = new Random(milis);
        int i = 0;
        while (i < longitud) {
            char c = (char) r.nextInt(255);
            if ((c >= '0' && c <= '9') || (c >= 'A' && c <= 'Z')) {
                cadenaAleatoria += c;
                i++;
            }
        }
        return cadenaAleatoria;
    }       
        
    
    // este es el metodo que si tiene que llamar en la pantalla
    public List traerPreguntas(Cuestionario cuestionario){
        
        List lista = daoRespuesta.buscarPreguntaCopia(cuestionario.getIdCuestionario());
        
        return lista;
    }
    public Cuestionario getCuestionarioActivoEnProceso(List<Cuestionario> cuestionarios) {
        Cuestionario cuestionario = null;
        for (Cuestionario cuest : cuestionarios) {
            if (cuest.getEstado()==5 || cuest.getEstado()==1) {
                cuestionario= cuest;
            }
        }
        return cuestionario;
    }
     public Cuestionario getCuestActivo(Candidato candidato){
          Set<Cuestionario> cuestionariosSet= candidato.getCuestionarios();
          // castea set to list
          List<Cuestionario> cuestionarios= new ArrayList<Cuestionario>(cuestionariosSet);
          Cuestionario cuestionarioValido= getCuestionarioActivoEnProceso(cuestionarios);
          
           return cuestionarioValido;
    
    }
    
    public Date getFecha(){
        //Devuelve año, mes, dia, hora, minutos
        
        Date ret = new Date();
        Calendar calendario = new GregorianCalendar();
        ret = calendario.getTime();
        
        return ret;
    }
    
    public void savePreguntaCopiaAsignada(CuestionarioPreguntaCopia dato){
        daoCuestionarioPreguntaCopia.save(dato);
    }
    
    public void update(Cuestionario cuestionario){
    daoCuestionario.update(cuestionario);
    }
    
    public Object verificarAcceso(Cuestionario cuestionario){
        Object objeto = new Object();
        List<PreguntaCopia> preguntasAMostrar = new ArrayList<PreguntaCopia>();
        switch(cuestionario.getEstado()){
            case 1:
                if (superaTimeActivoMax(cuestionario)){
                    // set cuestionario SIN CONTESTAR
                    cuestionario.setEstado(4);
                    cuestionario.setFechaFinalizacion(getFecha());
                    update(cuestionario);
                }
                else // RETORNA INSTRUCCIONES
                    objeto = gestorRepositorio.getInstrucciones();
                break;
            case 5:
                if (superaTimePaCompletarMax(cuestionario)){
                    // set cuestionario INCOMPLETO
                    cuestionario.setEstado(2);
                    cuestionario.setFechaFinalizacion(getFecha());
                    update(cuestionario);
                }
                else // Retorna Lista de Preguntas 
                    preguntasAMostrar = preguntasSinContestar(cuestionario);
                    
                break;
                
              
        }
     return objeto;
    }
    
    public boolean superaTimeActivoMax(Cuestionario cuestionario){
        Date fechaCreacion = cuestionario.getFechaCreacion();
        Date fechaActual = getFecha();
        
        int tiempoMaximoActivo = gestorRepositorio.configuracion().getTiempoMaximoCuestionarioActivo();
        //RESTAR LAS DOS FECHAS
        /*
        if(resta > tiempoMaximoActivo)
            ret = false;
        else ret = true;
        */
        
        return Boolean.FALSE;
    }
    
    public  boolean  superaTimePaCompletarMax(Cuestionario cuestionario){
        Date fechaUltimoIngreso = cuestionario.getFechaUltimoIngreso();
        Date fechaActual = getFecha();
        
        int tiempoMaximoCuestionario = gestorRepositorio.configuracion().getTiempoMaximoCuestionario();
      
        //RESTAR LAS DOS FECHAS
        /*
        if(resta > tiempoMaximoCuestionario)
            ret = false;
        else ret = true;
        */
        
        //return ret;
        return Boolean.FALSE;
    }
    
    public List<PreguntaCopia> preguntasSinContestar(Cuestionario cuestionario){
        List<PreguntaCopia> preguntasAmostrar = new ArrayList<PreguntaCopia>();
        //tabla intermedia de cuestionarioPreguntaCopia de este cuestionario
        List<CuestionarioPreguntaCopia> cuestionarioPreguntaCopia = daoCuestionarioPreguntaCopia.buscarPreguntaCopia(cuestionario.getIdCuestionario());
        //Preguntas Copia
        List<PreguntaCopia> preguntasDelCuestionario = new ArrayList();
        for(CuestionarioPreguntaCopia cpc: cuestionarioPreguntaCopia){
            preguntasDelCuestionario.add(cpc.getPreguntaCopia());
        }
        
        
        int preguntasContestadas = cuestionario.getPreguntasContestadas();
        
        for (int i = preguntasContestadas; i< preguntasDelCuestionario.size();i++){
            preguntasAmostrar.add(preguntasDelCuestionario.get(i)); 
        }
        
        return preguntasAmostrar;
    }
    //Aumenta en 1 la cantidad de accesos
    public Cuestionario nuevoIntento(Cuestionario cuestionario){
        int intentos = cuestionario.getCantidadAccesos();
        intentos++;
        cuestionario.setCantidadAccesos(intentos);
        
        daoCuestionario.update(cuestionario);
        return cuestionario;
    }
    
    public void setEstadoFinalizado(Cuestionario cuestionario){
        cuestionario.setEstado(3);
        cuestionario.setFechaFinalizacion(getFecha());
        daoCuestionario.update(cuestionario);
    }
    
}
