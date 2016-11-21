package Entidades;
// Generated 19/11/2016 22:59:25 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * RaEliminacion generated by hbm2java
 */
public class RaEliminacion  implements java.io.Serializable {


     private int idRaEliminacion;
     private Consultor consultor;
     private Object objetoEliminado;
     private Date fecha;
     private String objetoBorrado;

    public RaEliminacion() {
    }

	
    public RaEliminacion(int idRaEliminacion) {
        this.idRaEliminacion = idRaEliminacion;
    }
    public RaEliminacion(int idRaEliminacion, Consultor consultor, Object objetoEliminado, Date fecha, String objetoBorrado) {
       this.idRaEliminacion = idRaEliminacion;
       
       this.consultor = consultor;
       this.objetoEliminado = objetoEliminado;
       this.fecha = fecha;
       this.objetoBorrado = objetoBorrado;
    }
   
    public int getIdRaEliminacion() {
        return this.idRaEliminacion;
    }
    
    public void setIdRaEliminacion(int idRaEliminacion) {
        this.idRaEliminacion = idRaEliminacion;
    }
   
    public Consultor getConsultor() {
        return this.consultor;
    }
    
    public void setConsultor(Consultor consultor) {
        this.consultor = consultor;
    }
    
    
    public Object getObjetoEliminado() {
        return this.objetoEliminado;
    }
    
    public void setObjetoEliminado(Object objetoEliminado) {
        this.objetoEliminado = objetoEliminado;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public String getObjetoBorrado() {
        return this.objetoBorrado;
    }
    
    public void setObjetoBorrado(String objetoBorrado) {
        this.objetoBorrado = objetoBorrado;
    }

}


