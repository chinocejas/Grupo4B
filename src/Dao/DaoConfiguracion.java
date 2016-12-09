/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entidades.Configuracion;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;


/**
 *
 * @author nico
 */
public class DaoConfiguracion extends AbstractDao {

    public DaoConfiguracion() {
        super();
    }

    //El entero es el id de configuracion
    public Configuracion getConfiguracion(int idConfiguracion) {
        Configuracion configuracion=null;
        try {
            startOperation();
            
          Query query = session.createQuery("from Configuracion where id_configuracion= :idConfiguracion");
          query.setParameter("idConfiguracion", idConfiguracion);
          
          configuracion = (Configuracion) query.uniqueResult();
            tx.commit();
        } catch (HibernateException e) {
            handleException(e);
        } finally {
            HibernateFactory.close(session);
        }
        return configuracion;
    }
}
