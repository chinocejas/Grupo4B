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

import Gestores.GestorCompetencia;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
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
    /*Puesto puesto = new Puesto();
    
    puesto.setNombrePuesto("puestoooo");
    puesto.setNombreEmpresa("empresaaaaa");

    Competencia competencia1 = new Competencia();
    competencia1.setIdCompetencia(11);
    competencia1.setNombreCompetencia("comp2");
     Set<Competencia> competencias = new HashSet<Competencia>();
     competencias.add(competencia1);

    puesto.setPuestoCompetencias(competencias);
   
   
  PuestoDaoHibernate puestoDao= new PuestoDaoHibernate();
   puestoDao.save(puesto);
   */
  
    

    /* GestorCompetencia gestor = GestorCompetencia.getInstance();
    List allCompetencias= gestor.allCompetencias();
        System.out.println(allCompetencias.getClass());
        Competencia competencia= (Competencia) allCompetencias.get(0);
        System.out.println(competencia.getClass());
        System.out.println(competencia.getNombreCompetencia());
*/
    
    
    
    Integer num=null;
    }
}
