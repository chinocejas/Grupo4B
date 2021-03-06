package Entidades;
// Generated 06-dic-2016 15:03:43 by Hibernate Tools 4.3.1



/**
 * PonderaCopiaId generated by hbm2java
 */
public class PonderaCopiaId  implements java.io.Serializable {


     private int idPreguntaCopia;
     private int idRespuestaCopia;

    public PonderaCopiaId() {
    }

    public PonderaCopiaId(int idPreguntaCopia, int idRespuestaCopia) {
       this.idPreguntaCopia = idPreguntaCopia;
       this.idRespuestaCopia = idRespuestaCopia;
    }
   
    public int getIdPreguntaCopia() {
        return this.idPreguntaCopia;
    }
    
    public void setIdPreguntaCopia(int idPreguntaCopia) {
        this.idPreguntaCopia = idPreguntaCopia;
    }
    public int getIdRespuestaCopia() {
        return this.idRespuestaCopia;
    }
    
    public void setIdRespuestaCopia(int idRespuestaCopia) {
        this.idRespuestaCopia = idRespuestaCopia;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof PonderaCopiaId) ) return false;
		 PonderaCopiaId castOther = ( PonderaCopiaId ) other; 
         
		 return (this.getIdPreguntaCopia()==castOther.getIdPreguntaCopia())
 && (this.getIdRespuestaCopia()==castOther.getIdRespuestaCopia());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdPreguntaCopia();
         result = 37 * result + this.getIdRespuestaCopia();
         return result;
   }   


}


