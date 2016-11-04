/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entidades.Competencia;
import Entidades.Puesto;
import Entidades.PuestoCompetencia;
import java.math.BigInteger;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.ejb.*;
import javax.persistence.EntityManager;



/**
 *
 * @author Rolando
 */
public class PuestoDaoHibernate extends AbstractDao {

    public PuestoDaoHibernate() {
        super();
    }

    /**
     * Insert a new Usuario into the database.
     * @param usuario
     */
    public void save(Puesto puesto, int idPuesto, List<Competencia> competencias, List<Integer> ponderaciones) throws DataAccessLayerException {
        super.save(puesto);
        actualizarPuntajesCompetencias(idPuesto, competencias, ponderaciones);
    }

    
    /**
     * Updates a new Usuario into the database.
     * @param usuario
     */
    public void update(Puesto puesto) throws DataAccessLayerException {
        super.update(puesto);
    }

    /**
     * Delete a detached Usuario from the database.
     * @param usuario
     */
    public void delete(Puesto puesto) throws DataAccessLayerException {
        super.delete(puesto);
    }

    /**
     * Find an Event by its primary key.
     * @param id
     * @return
     */
    public Puesto find(int id) throws DataAccessLayerException {
        Puesto obj= new Puesto();
        try {
            startOperation();
            Query query = null;
         query = session.createQuery("from Puesto WHERE id_puesto= :id");     
                query.setParameter("id", id);
                obj= (Puesto) query.uniqueResult();
          tx.commit();
        }
        catch (HibernateException e) {
            handleException(e);
        } finally {
            HibernateFactory.close(session);
        }
        return obj;
    }
    
    public List findPorCodigoAndPuestoAndEmpresa() throws DataAccessLayerException{
        List objects = null;
        try {
            startOperation();
            Query query = null;
            query = session.createQuery("from Puesto");     
            objects = query.list();
            tx.commit();
        } catch (HibernateException e) {
            handleException(e);
        } finally {
            HibernateFactory.close(session);
        }
        return objects;
    }
    
    //agregado por el negro
    public List findPorCodigoAndPuestoAndEmpresa(String codigo, String puesto, String empresa) throws DataAccessLayerException {
        List objects = null;

        codigo = "%" + codigo + "%";     //al usar el criterio contiene busco todas las cadenas que contengan codigo
        puesto = "%" + puesto + "%";
        empresa = "%" + empresa + "%";
        try {
            startOperation();
            Query query = null;

           if (codigo!=null && puesto!=null && empresa!=null)  { //busqueda por los tres parametros
               query = session.createQuery("from Puesto WHERE TRIM(TO_CHAR(id_puesto, '9999999999')) LIKE :codigo AND nombre_puesto LIKE :puesto AND nombre_empresa LIKE :empresa");     
                query.setParameter("codigo", codigo);
                query.setParameter("puesto", puesto);
                query.setParameter("empresa", empresa);
                objects = query.list();
           }
           else if("".equals(empresa)){ //busqueda solo por codigo y puesto
               query = session.createQuery("from Puesto WHERE TRIM(TO_CHAR(id_puesto, '9999999999')) LIKE :codigo AND nombre_puesto LIKE :puesto");    
                query.setParameter("codigo", codigo);
                query.setParameter("puesto", puesto);
                objects = query.list();
           }
            else if("".equals(puesto)){ //busqueda solo por codigo y empresa
               query = session.createQuery("from Puesto WHERE TRIM(TO_CHAR(id_puesto, '9999999999')) LIKE :codigo AND nombre_empresa LIKE :empresa");     
                query.setParameter("codigo", codigo);
                query.setParameter("empresa", empresa);
                objects = query.list();
           }
            else if ("".equals(codigo)) { //busqueda solo por puesto y empresa
                query = session.createQuery("from Puesto WHERE nombre_puesto LIKE :puesto AND nombre_empresa LIKE :empresa");
                query.setParameter("puesto", puesto);
                query.setParameter("empresa", empresa);
                objects = query.list();
            } else if ("".equals(puesto) && "".equals(empresa)) //busqueda solo por codigo
            {

                query = session.createQuery("from Puesto WHERE TRIM(TO_CHAR(id_puesto, '9999999999')) LIKE :codigo");      //el operador like funciona solo con cadenas por eso uso esto para id_puesto
                query.setParameter("codigo", codigo);
                objects = query.list();
            } else if ("".equals(codigo) && "".equals(empresa)) { //busqueda solo por puesto
                query = session.createQuery("from Puesto WHERE nombre_puesto LIKE :puesto");
                query.setParameter("puesto", puesto);
                objects = query.list();
            } else if ("".equals(codigo) && "".equals(puesto)) { //busqueda solo por empresa
                query = session.createQuery("from Puesto WHERE nombre_empresa LIKE :empresa");
                query.setParameter("empresa", empresa);
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

    /**
     * Lista todos los usuarios de la base de datos
     * @return
     */
    public List findAll() throws DataAccessLayerException {
        return super.findAll(Puesto.class);
    }
    
    
    
    
    public int buscarSecuencia() throws DataAccessLayerException {
        BigInteger seq = BigInteger.ONE;
        try {
            startOperation();
            
            Query query = session.createSQLQuery("select last_value from public.puesto_id_seq");

            List result = query.list();
            seq = (BigInteger) result.get(0);
                       
            tx.commit();
        }
        catch (HibernateException e) {
            handleException(e);
        } finally {
            HibernateFactory.close(session);
        }
        return seq.intValue();
    }
    
    public int verificarNombrePuestoUnico(String nombre){
        Integer retorno=null;
           Puesto puesto = null;
        try {
            startOperation();
            Query query = null;
            query = session.createQuery("from Puesto WHERE nombre_puesto= :nombre"); 
            query.setParameter("nombre", nombre);
            puesto = (Puesto) query.uniqueResult();
            tx.commit();
        } catch (HibernateException e) {
            handleException(e);
        } finally {
            HibernateFactory.close(session);
        }
        
        //si no se retorna ningun puesto de la bd con ese nombre significa que no esta en uso
        if (puesto == null)
            //el nombre no esta en uso
            retorno = 1;
        else 
            //el nombre esta en uso
            retorno = 0;

        return retorno;

    }
    

    //metodos para actualizar la ponderacion en la tabla union entre puesto y competencia
    
     public void actualizarPuntajesCompetencias(int idPuesto, List<Competencia> competencias, List<Integer> puntajes){
       //hago una busqueda con el id del puesto y para cada competencia en la lista
       //traigo de la bs el registro que coincidan el idPuesto y el idCompetencia actual y lo guardo en una instancia de PuestoCompetencia
       //le agrego el puntaje y lo actualizo en la bs
        PuestoCompetencia puestoCompetencia=null;
    
        for (int i = 0; i < competencias.size(); i++) {
            try {
                startOperation();
                //busco el registro
               
                puestoCompetencia = this.findParaPantalla(Long.valueOf(idPuesto), Long.valueOf(competencias.get(i).getIdCompetencia()));
                //le agrego el puntaje sacado de la lista de puntajes
                
                puestoCompetencia.setPuntajeRequerido(puntajes.get(i));
                
                //actualizo el registro en la bs
                this.update(puestoCompetencia);
                
                //tx.commit(); al pedo
            } catch (HibernateException e) {
                handleException(e);
            } finally {
                HibernateFactory.close(session);
            }
        }
    }

    public PuestoCompetencia findParaPantalla(Long idPuesto, Long idCompetencia) throws DataAccessLayerException {
        PuestoCompetencia obj = null;
        try {
            startOperation();
            
          Query query = session.createQuery("from PuestoCompetencia where id_puesto= :idPuesto and id_competencia= :idCompetencia");
          query.setParameter("idPuesto", idPuesto);
          query.setParameter("idCompetencia", idCompetencia);
         
          obj = (PuestoCompetencia)query.uniqueResult();
          obj.setPuntajeRequerido(-1); //necesario para evitar problemas con punteros a null
            tx.commit();
             
        } catch (HibernateException e) {
            handleException(e);
        } finally {
            HibernateFactory.close(session);
        }
        return obj;
    }
      public PuestoCompetencia find(Long idPuesto, Long idCompetencia) throws DataAccessLayerException {
        PuestoCompetencia obj = null;
        try {
            startOperation();
            
          Query query = session.createQuery("from PuestoCompetencia where id_puesto= :idPuesto and id_competencia= :idCompetencia");
          query.setParameter("idPuesto", idPuesto);
          query.setParameter("idCompetencia", idCompetencia);
         
          obj = (PuestoCompetencia)query.uniqueResult();
       
            tx.commit();
             
        } catch (HibernateException e) {
            handleException(e);
        } finally {
            HibernateFactory.close(session);
        }
        return obj;
    }
    
    public void update(PuestoCompetencia puestoCompetencia) throws DataAccessLayerException {
        super.update(puestoCompetencia);
    }

    private Object getJpaTemplate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
