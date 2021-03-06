package Entidades;
// Generated 06-dic-2016 15:03:43 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * FactorCopia generated by hbm2java
 */
public class FactorCopia  implements java.io.Serializable {


     private int idFactorCopia;
     private CompetenciaCopia competenciaCopia;
     private String nombre;
     private String descripcion;
     private Integer numeroOrden;
     private Set<PreguntaCopia> preguntaCopias = new HashSet<PreguntaCopia>(0);

    public FactorCopia() {
    }

	
    public FactorCopia(int idFactorCopia) {
        this.idFactorCopia = idFactorCopia;
    }
    public FactorCopia(int idFactorCopia, CompetenciaCopia competenciaCopia, String nombre, String descripcion, Integer numeroOrden, Set<PreguntaCopia> preguntaCopias) {
       this.idFactorCopia = idFactorCopia;
       this.competenciaCopia = competenciaCopia;
       this.nombre = nombre;
       this.descripcion = descripcion;
       this.numeroOrden = numeroOrden;
       this.preguntaCopias = preguntaCopias;
    }
   
    public int getIdFactorCopia() {
        return this.idFactorCopia;
    }
    
    public void setIdFactorCopia(int idFactorCopia) {
        this.idFactorCopia = idFactorCopia;
    }
    public CompetenciaCopia getCompetenciaCopia() {
        return this.competenciaCopia;
    }
    
    public void setCompetenciaCopia(CompetenciaCopia competenciaCopia) {
        this.competenciaCopia = competenciaCopia;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Integer getNumeroOrden() {
        return this.numeroOrden;
    }
    
    public void setNumeroOrden(Integer numeroOrden) {
        this.numeroOrden = numeroOrden;
    }
    public Set<PreguntaCopia> getPreguntaCopias() {
        return this.preguntaCopias;
    }
    
    public void setPreguntaCopias(Set<PreguntaCopia> preguntaCopias) {
        this.preguntaCopias = preguntaCopias;
    }




}


