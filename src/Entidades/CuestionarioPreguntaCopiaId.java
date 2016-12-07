package Entidades;
// Generated 06-dic-2016 15:03:43 by Hibernate Tools 4.3.1



/**
 * CuestionarioPreguntaCopiaId generated by hbm2java
 */
public class CuestionarioPreguntaCopiaId  implements java.io.Serializable {


     private int idCuestionario;
     private int idPreguntaCopia;

    public CuestionarioPreguntaCopiaId() {
    }

    public CuestionarioPreguntaCopiaId(int idCuestionario, int idPreguntaCopia) {
       this.idCuestionario = idCuestionario;
       this.idPreguntaCopia = idPreguntaCopia;
    }
   
    public int getIdCuestionario() {
        return this.idCuestionario;
    }
    
    public void setIdCuestionario(int idCuestionario) {
        this.idCuestionario = idCuestionario;
    }
    public int getIdPreguntaCopia() {
        return this.idPreguntaCopia;
    }
    
    public void setIdPreguntaCopia(int idPreguntaCopia) {
        this.idPreguntaCopia = idPreguntaCopia;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof CuestionarioPreguntaCopiaId) ) return false;
		 CuestionarioPreguntaCopiaId castOther = ( CuestionarioPreguntaCopiaId ) other; 
         
		 return (this.getIdCuestionario()==castOther.getIdCuestionario())
 && (this.getIdPreguntaCopia()==castOther.getIdPreguntaCopia());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdCuestionario();
         result = 37 * result + this.getIdPreguntaCopia();
         return result;
   }   


}

