package Entidades;
// Generated 06-dic-2016 15:03:43 by Hibernate Tools 4.3.1



/**
 * CuestionarioPreguntaCopia generated by hbm2java
 */
public class CuestionarioPreguntaCopia  implements java.io.Serializable {


     private CuestionarioPreguntaCopiaId id;
     private Cuestionario cuestionario;
     private PreguntaCopia preguntaCopia;
     private Integer orden;

    public CuestionarioPreguntaCopia() {
    }

	
    public CuestionarioPreguntaCopia(CuestionarioPreguntaCopiaId id, Cuestionario cuestionario, PreguntaCopia preguntaCopia) {
        this.id = id;
        this.cuestionario = cuestionario;
        this.preguntaCopia = preguntaCopia;
    }
    public CuestionarioPreguntaCopia(CuestionarioPreguntaCopiaId id, Cuestionario cuestionario, PreguntaCopia preguntaCopia, Integer orden) {
       this.id = id;
       this.cuestionario = cuestionario;
       this.preguntaCopia = preguntaCopia;
       this.orden = orden;
    }
   
    public CuestionarioPreguntaCopiaId getId() {
        return this.id;
    }
    
    public void setId(CuestionarioPreguntaCopiaId id) {
        this.id = id;
    }
    public Cuestionario getCuestionario() {
        return this.cuestionario;
    }
    
    public void setCuestionario(Cuestionario cuestionario) {
        this.cuestionario = cuestionario;
    }
    public PreguntaCopia getPreguntaCopia() {
        return this.preguntaCopia;
    }
    
    public void setPreguntaCopia(PreguntaCopia preguntaCopia) {
        this.preguntaCopia = preguntaCopia;
    }
    public Integer getOrden() {
        return this.orden;
    }
    
    public void setOrden(Integer orden) {
        this.orden = orden;
    }




}


