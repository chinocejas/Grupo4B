/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPrueba;

import Entidades.Competencia;
import Entidades.Consultor;
import Gestores.GestorCompetencia;
import Gestores.GestorConsultor;
import Gestores.GestorEliminacion;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Rolando
 */
public class Main {
    
    public static void main(String[] args) {
       ArrayList<Competencia> data = new ArrayList<Competencia>();
        data= (ArrayList<Competencia>) GestorCompetencia.getInstance().allCompetenciasOrdenadasPorNombre();
        Competencia competencia= data.get(2);
    Consultor consultor = GestorConsultor.getInstance().getConsultor();
                    Date fechaActual = new Date();
                    DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
                    hourdateFormat.format(fechaActual);
                    System.out.println("Hora y fecha: " + fechaActual);
                    GestorEliminacion gestorEliminacion = GestorEliminacion.getInstance();
                    gestorEliminacion.generarRegistroAuditoria(competencia, consultor, fechaActual);
    
    }
}
