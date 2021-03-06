package Entidades;
// Generated 06-dic-2016 15:03:43 by Hibernate Tools 4.3.1



/**
 * PonderaId generated by hbm2java
 */
public class PonderaId  implements java.io.Serializable {


     private int idPregunta;
     private int idRespuesta;

    public PonderaId() {
    }

    public PonderaId(int idPregunta, int idRespuesta) {
       this.idPregunta = idPregunta;
       this.idRespuesta = idRespuesta;
    }
   
    public int getIdPregunta() {
        return this.idPregunta;
    }
    
    public void setIdPregunta(int idPregunta) {
        this.idPregunta = idPregunta;
    }
    public int getIdRespuesta() {
        return this.idRespuesta;
    }
    
    public void setIdRespuesta(int idRespuesta) {
        this.idRespuesta = idRespuesta;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof PonderaId) ) return false;
		 PonderaId castOther = ( PonderaId ) other; 
         
		 return (this.getIdPregunta()==castOther.getIdPregunta())
 && (this.getIdRespuesta()==castOther.getIdRespuesta());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdPregunta();
         result = 37 * result + this.getIdRespuesta();
         return result;
   }   


}


