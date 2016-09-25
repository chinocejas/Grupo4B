package backups;
// Generated 16/09/2016 18:42:16 by Hibernate Tools 4.3.1


import Entidades.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Puesto generated by hbm2java
 */
public class Puesto  implements java.io.Serializable {


     private int idPuesto;
     private String nombrePuesto;
     private String nombreEmpresa;
     private String descripcion;
     private Date fechaUltMod;
     private Set puestoCompetencias = new HashSet(0);

    public Puesto() {
    }

	
    public Puesto(int idPuesto) {
        this.idPuesto = idPuesto;
    }
    public Puesto(int idPuesto, String nombrePuesto, String nombreEmpresa,String descripcion, Date fechaUltMod, Set puestoCompetencias) {
       this.idPuesto = idPuesto;
       this.nombrePuesto = nombrePuesto;
       this.nombreEmpresa = nombreEmpresa;
       this.descripcion= descripcion;
       this.fechaUltMod = fechaUltMod;
       this.puestoCompetencias = puestoCompetencias;
    }
   
    public int getIdPuesto() {
        return this.idPuesto;
    }
    
    public void setIdPuesto(int idPuesto) {
        this.idPuesto = idPuesto;
    }
    public String getNombrePuesto() {
        return this.nombrePuesto;
    }
    
    public void setNombrePuesto(String nombrePuesto) {
        this.nombrePuesto = nombrePuesto;
    }
    public String getNombreEmpresa() {
        return this.nombreEmpresa;
    }
    
    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDecripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Date getFechaUltMod() {
        return this.fechaUltMod;
    }
    
    public void setFechaUltMod(Date fechaUltMod) {
        this.fechaUltMod = fechaUltMod;
    }
    public Set getPuestoCompetencias() {
        return this.puestoCompetencias;
    }
    
    public void setPuestoCompetencias(Set puestoCompetencias) {
        this.puestoCompetencias = puestoCompetencias;
    }




}

