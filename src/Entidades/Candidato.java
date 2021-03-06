package Entidades;
// Generated 21-nov-2016 16:04:03 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Candidato generated by hbm2java
 */
public class Candidato  implements java.io.Serializable {


     private int idCandidato;
     private Integer numeroDocumento;
     private String tipoDocumento;
     private String nombre;
     private String apellido;
     private Date fechaNacimiento;
     private String genero;
     private String nacionalidad;
     private String email;
     private String escolaridad;
     private Boolean eliminado;
     private Set cuestionarios = new HashSet(0);

    public Candidato() {
    }

	
    public Candidato(int idCandidato) {
        this.idCandidato = idCandidato;
    }
    public Candidato(int idCandidato, Integer numeroDocumento, String tipoDocumento, String nombre, String apellido, Date fechaNacimiento, String genero, String nacionalidad, String email, String escolaridad, Boolean eliminado, Set cuestionarios) {
       this.idCandidato = idCandidato;
       this.numeroDocumento = numeroDocumento;
       this.tipoDocumento = tipoDocumento;
       this.nombre = nombre;
       this.apellido = apellido;
       this.fechaNacimiento = fechaNacimiento;
       this.genero = genero;
       this.nacionalidad = nacionalidad;
       this.email = email;
       this.escolaridad = escolaridad;
       this.eliminado = eliminado;
       this.cuestionarios = cuestionarios;
    }
   
    public int getIdCandidato() {
        return this.idCandidato;
    }
    
    public void setIdCandidato(int idCandidato) {
        this.idCandidato = idCandidato;
    }
    public Integer getNumeroDocumento() {
        return this.numeroDocumento;
    }
    
    public void setNumeroDocumento(Integer numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }
    public String getTipoDocumento() {
        return this.tipoDocumento;
    }
    
    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
    public String getNombre() {
        return this.nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    public String getNombreApellido() {
        return (this.nombre +" "+ this.apellido);
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public Date getFechaNacimiento() {
        return this.fechaNacimiento;
    }
    
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public String getGenero() {
        return this.genero;
    }
    
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getNacionalidad() {
        return this.nacionalidad;
    }
    
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEscolaridad() {
        return this.escolaridad;
    }
    
    public void setEscolaridad(String escolaridad) {
        this.escolaridad = escolaridad;
    }
    public Boolean getEliminado() {
        return this.eliminado;
    }
    
    public void setEliminado(Boolean eliminado) {
        this.eliminado = eliminado;
    }
    public Set getCuestionarios() {
        return this.cuestionarios;
    }
    
    public void setCuestionarios(Set cuestionarios) {
        this.cuestionarios = cuestionarios;
    }

    public void addCuestionario(Cuestionario cuest){
        this.cuestionarios.add(cuest);
    }


}


