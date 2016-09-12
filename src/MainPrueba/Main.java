/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPrueba;

import Dao.CompetenciaDaoHibernate;
import Entidades.Consultor;
import Dao.ConsultorDaoHibernate;
import Dao.PuestoDaoHibernate;
import Entidades.Competencia;
import Entidades.Puesto;
import java.util.Date;
import java.util.List;
import net.sf.ehcache.hibernate.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author Rolando
 */
public class Main {
    
    public static void main(String[] args) {
        //esta parte funca
        /*ConsultorDaoHibernate consultorDAO = new ConsultorDaoHibernate();
        Consultor consultor = new Consultor();
        consultor.setIdConsultor(1000);
        consultor.setUsername("juano47");
        consultor.setClave("000");
        consultor.setNombre("juancito");
        consultorDAO.save(consultor);

        
        Consultor consultor=null;
        
        ConsultorDaoHibernate consultorDAO = new ConsultorDaoHibernate();
        consultor=consultorDAO.findPorUsernameYClave("juano4","000");
        System.out.println(consultor.getNombre());

        
        Consultor consultor= new Consultor();
        consultor.setIdConsultor(1000);
        consultor.setNombre("juancitoo");
        System.out.println(consultor.getNombre());
*/

        
    //creo puestos, le agrego una lista de competencias que es obligacion que ya esten en la base de datos
    //y subo los puestos a la bs o los borro
    //se carga la tabla intermedia automaticamente
    //si guardo o borro un puesto no se toca la tabla competencia por la conf del .hbm
        Puesto puesto = new Puesto();
    puesto.setIdPuesto(1234);
    puesto.setNombrePuesto("puesto2");
    puesto.setNombreEmpresa("empresa2");

    Competencia competencia1 = new Competencia();
    competencia1.setIdCompetencia(1222);
    competencia1.setNombreCompetencia("comp2");
    

    puesto.addCompetencia(competencia1);
   
    
   PuestoDaoHibernate puestoDao= new PuestoDaoHibernate();
    puestoDao.delete(puesto);
    

  
    }
}
