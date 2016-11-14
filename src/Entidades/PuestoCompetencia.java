package Entidades;
// Generated 16/09/2016 18:42:16 by Hibernate Tools 4.3.1

/**
 * PuestoCompetenciaId generated by hbm2java
 */
public class PuestoCompetencia  implements java.io.Serializable {


     private int idPuesto;
     private int idCompetencia;
     private Integer puntajeRequerido;

    public PuestoCompetencia() {
    }

    public PuestoCompetencia(int idPuesto, int idCompetencia, Integer puntajeRequerido) {
       this.idPuesto = idPuesto;
       this.idCompetencia = idCompetencia;
       this.puntajeRequerido= puntajeRequerido;
    }
   
    public int getIdPuesto() {
        return this.idPuesto;
    }
    
    public void setIdPuesto(int idPuesto) {
        this.idPuesto = idPuesto;
    }
    public int getIdCompetencia() {
        return this.idCompetencia;
    }
    
    public void setIdCompetencia(int idCompetencia) {
        this.idCompetencia = idCompetencia;
    }
    public int getPuntajeRequerido() {
        return this.puntajeRequerido;
    }
    
    public void setPuntajeRequerido(Integer puntajeRequerido) {
        this.puntajeRequerido = puntajeRequerido;
    }

}