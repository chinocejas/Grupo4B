package Entidades;
// Generated 21-nov-2016 16:04:03 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Cuestionario generated by hbm2java
 */
public class Cuestionario  implements java.io.Serializable {


     private int idCuestionario;
     private Candidato candidato;
     private PuestoCopia puestoCopia;
     private Integer preguntasContestadas;
     private Integer cantidadAccesos;
     private Date fechaCreacion;
     private Date fechaInicio;
     private Date fechaUltimoIngreso;
     private Date fechaFinalizacion;
     private String clave;
     private Integer tiempoMaximo;

    public Cuestionario() {
    }

	
    public Cuestionario(int idCuestionario) {
        this.idCuestionario = idCuestionario;
    }
    public Cuestionario(int idCuestionario, Candidato candidato, PuestoCopia puestoCopia, Integer preguntasContestadas, Integer cantidadAccesos, Date fechaCreacion, Date fechaInicio, Date fechaUltimoIngreso, Date fechaFinalizacion, String clave, Integer tiempoMaximo) {
       this.idCuestionario = idCuestionario;
       this.candidato = candidato;
       this.puestoCopia = puestoCopia;
       this.preguntasContestadas = preguntasContestadas;
       this.cantidadAccesos = cantidadAccesos;
       this.fechaCreacion = fechaCreacion;
       this.fechaInicio = fechaInicio;
       this.fechaUltimoIngreso = fechaUltimoIngreso;
       this.fechaFinalizacion = fechaFinalizacion;
       this.clave = clave;
       this.tiempoMaximo = tiempoMaximo;
    }
   
    public int getIdCuestionario() {
        return this.idCuestionario;
    }
    
    public void setIdCuestionario(int idCuestionario) {
        this.idCuestionario = idCuestionario;
    }
    public Candidato getCandidato() {
        return this.candidato;
    }
    
    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }
    public PuestoCopia getPuestoCopia() {
        return this.puestoCopia;
    }
    
    public void setPuestoCopia(PuestoCopia puestoCopia) {
        this.puestoCopia = puestoCopia;
    }
    public Integer getPreguntasContestadas() {
        return this.preguntasContestadas;
    }
    
    public void setPreguntasContestadas(Integer preguntasContestadas) {
        this.preguntasContestadas = preguntasContestadas;
    }
    public Integer getCantidadAccesos() {
        return this.cantidadAccesos;
    }
    
    public void setCantidadAccesos(Integer cantidadAccesos) {
        this.cantidadAccesos = cantidadAccesos;
    }
    public Date getFechaCreacion() {
        return this.fechaCreacion;
    }
    
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    public Date getFechaInicio() {
        return this.fechaInicio;
    }
    
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public Date getFechaUltimoIngreso() {
        return this.fechaUltimoIngreso;
    }
    
    public void setFechaUltimoIngreso(Date fechaUltimoIngreso) {
        this.fechaUltimoIngreso = fechaUltimoIngreso;
    }
    public Date getFechaFinalizacion() {
        return this.fechaFinalizacion;
    }
    
    public void setFechaFinalizacion(Date fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }
    public String getClave() {
        return this.clave;
    }
    
    public void setClave(String clave) {
        this.clave = clave;
    }
    public Integer getTiempoMaximo() {
        return this.tiempoMaximo;
    }
    
    public void setTiempoMaximo(Integer tiempoMaximo) {
        this.tiempoMaximo = tiempoMaximo;
    }




}


