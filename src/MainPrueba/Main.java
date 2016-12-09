/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPrueba;

import Dao.DaoCuestionario;
import Entidades.Cuestionario;

/**
 *
 * @author Rolando
 */
public class Main {
    
    public static void main(String[] args) {
       DaoCuestionario daoCuestionario= new DaoCuestionario();
       
       Cuestionario cuestionario= new Cuestionario();
    daoCuestionario.save(cuestionario);
    System.out.print("listo");
    }
}
