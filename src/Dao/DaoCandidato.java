/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entidades.Candidato;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;


/**
 *
 * @author Rolando
 */
public class DaoCandidato extends AbstractDao {

    public DaoCandidato() {
        super();
    }

    /**
     * Insert a new Usuario into the database.
     * @param usuario
     */
    public void save(Candidato candidato) throws DataAccessLayerException {
        super.save(candidato);
    }

    /**
     * Updates a new Usuario into the database.
     * @param usuario
     */
    public void update(Candidato candidato) throws DataAccessLayerException {
        super.update(candidato);
    }

    /**
     * Delete a detached Usuario from the database.
     * @param usuario
     */
    public void delete(Candidato candidato) throws DataAccessLayerException {
        super.delete(candidato);
    }

    /**
     * Find an Event by its primary key.
     * @param id
     * @return
     */
    public Candidato find(Long id) throws DataAccessLayerException {
        return (Candidato) super.find(Candidato.class, id);
    }
    
    //agregado por el negro
    public Candidato findPorUsernameYClave(String username, String password) throws DataAccessLayerException {
        Candidato obj= null;
        try {
            startOperation();
            
          Query query = session.createQuery("from Consultor where username= :username and clave= :password");
          query.setParameter("username", username);
          query.setParameter("password", password);
          obj = (Candidato)query.uniqueResult();
            tx.commit();
        } catch (HibernateException e) {
            handleException(e);
        } finally {
            HibernateFactory.close(session);
        }
        return obj;
    }

    /**
     * Lista todos los usuarios de la base de datos
     * @return
     */
    public List findAll() throws DataAccessLayerException {
        return super.findAll(Candidato.class);
    }
    
    public List findPorApellidoAndNombreAndId() throws DataAccessLayerException{
        List objects = null;
        try {
            startOperation();
            Query query;
            query = session.createQuery("from Candidato WHERE eliminado=false");     
            objects = query.list();
            tx.commit();
        } catch (HibernateException e) {
            handleException(e);
        } finally {
            HibernateFactory.close(session);
        }
        return objects;
    }
    
    public List findPorApellidoAndNombreAndId(String apellido, String nombre, String id) throws DataAccessLayerException {
        //codigo-puesto-empresa
        //apellido-nombre-id
        List objects = null;

        //codigo = "%" + codigo + "%";     al usar el criterio contiene busco todas las cadenas que contengan codigo
        apellido = "%" + apellido + "%";
        nombre = "%" + nombre + "%";
        id = "%" + id + "%";
        try {
            startOperation();
            Query query;

    /**/        if (apellido != null && nombre != null && id != null) { //busqueda por los tres parametros
                query = session.createQuery("from Candidato WHERE TRIM(TO_CHAR(id_candidato, '9999999999')) LIKE :id AND apellido LIKE :apellido AND nombre LIKE :nombre AND eliminado=false");
                query.setParameter("id", id);
                query.setParameter("apellido", apellido);
                query.setParameter("nombre", nombre);
                objects = query.list();
            } else if ("".equals(nombre)) { //busqueda solo por id y apellido
     /**/           query = session.createQuery("from Candidato WHERE TRIM(TO_CHAR(id_candidato, '9999999999')) LIKE :id AND apellido LIKE :apellido AND eliminado=false");
                query.setParameter("id", id);
                query.setParameter("apellido", apellido);
                objects = query.list();
            } else if ("".equals(apellido)) { //busqueda solo por id y nombre
      /**/          query = session.createQuery("from Candidato WHERE TRIM(TO_CHAR(id_candidato, '9999999999')) LIKE :id AND nombre LIKE :nombre AND eliminado=false");
                query.setParameter("id", id);
                query.setParameter("nombre", nombre);
                objects = query.list();
            } else if ("".equals(id)) { //busqueda solo por apellido y nombre
      /**/          query = session.createQuery("from Candidato WHERE apellido LIKE :apellido AND nombre LIKE :nombre AND eliminado=false");
                query.setParameter("apellido", apellido);
                query.setParameter("nombre", nombre);
                objects = query.list();
            } else if ("".equals(nombre) && "".equals(id)) { //busqueda solo por apellido
      /**/          query = session.createQuery("from Candidato WHERE apellido LIKE :apellido AND eliminado=false");
                query.setParameter("apellido", apellido);
                objects = query.list();
            } else if ("".equals(apellido) && "".equals(id)) { //busqueda solo por nombre
      /**/          query = session.createQuery("from Candidato WHERE nombre LIKE :nombre AND eliminado=false");
                query.setParameter("nombre", nombre);
                objects = query.list();
            } else if ("".equals(apellido) && "".equals(nombre)) { //busqueda solo por id
     /**/           query = session.createQuery("from Candidato WHERE TRIM(TO_CHAR(id_candidato, '9999999999')) LIKE :id AND eliminado=false");
                //el operador like funciona solo con cadenas por eso uso esto para id_candidato
                query.setParameter("id", id);
                objects = query.list();
            }

            tx.commit();
        } catch (HibernateException e) {
            handleException(e);
        } finally {
            HibernateFactory.close(session);
        }
        return objects;
    }
}
