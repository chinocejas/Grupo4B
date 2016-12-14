package Entidades;
// Generated 06-dic-2016 15:03:43 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * OpcionRespuestaCopia generated by hbm2java
 */
public class OpcionRespuestaCopia  implements java.io.Serializable {


     private int idOpcionRespuestaCopia;
     private String nombreOpcionRespuesta;
     private String descripcion;
     private int seleccion;
     private Set<PreguntaCopia> preguntaCopias = new HashSet<PreguntaCopia>(0);
     private Set<RespuestaCopia> respuestaCopias = new HashSet<RespuestaCopia>(0);

    public OpcionRespuestaCopia() {
    }

	
    public OpcionRespuestaCopia(int idOpcionRespuestaCopia) {
        this.idOpcionRespuestaCopia = idOpcionRespuestaCopia;
    }
    public OpcionRespuestaCopia(int idOpcionRespuestaCopia, String nombreOpcionRespuesta, String descripcion, Set<PreguntaCopia> preguntaCopias, Set<RespuestaCopia> respuestaCopias) {
       this.idOpcionRespuestaCopia = idOpcionRespuestaCopia;
       this.nombreOpcionRespuesta = nombreOpcionRespuesta;
       this.descripcion = descripcion;
       this.preguntaCopias = preguntaCopias;
       this.respuestaCopias = respuestaCopias;
    }
   
    public int getIdOpcionRespuestaCopia() {
        return this.idOpcionRespuestaCopia;
    }
    
    public void setIdOpcionRespuestaCopia(int idOpcionRespuestaCopia) {
        this.idOpcionRespuestaCopia = idOpcionRespuestaCopia;
    }
    public String getNombreOpcionRespuesta() {
        return this.nombreOpcionRespuesta;
    }
    
    public void setNombreOpcionRespuesta(String nombreOpcionRespuesta) {
        this.nombreOpcionRespuesta = nombreOpcionRespuesta;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Set<PreguntaCopia> getPreguntaCopias() {
        return this.preguntaCopias;
    }
    
    public void setPreguntaCopias(Set<PreguntaCopia> preguntaCopias) {
        this.preguntaCopias = preguntaCopias;
    }
    public Set<RespuestaCopia> getRespuestaCopias() {
        return this.respuestaCopias;
    }
    
    public void setRespuestaCopias(Set<RespuestaCopia> respuestaCopias) {
        this.respuestaCopias = respuestaCopias;
    }
    
    public void setSeleccion(int seleccion) {
        this.seleccion = seleccion;
    }
    
    public int getSeleccion() {
        return this.seleccion;
    }


}


