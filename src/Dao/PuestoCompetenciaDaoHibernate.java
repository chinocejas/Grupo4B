/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entidades.Competencia;

import Entidades.PuestoCompetencia;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;

/**
 *
 * @author John
 */
public class PuestoCompetenciaDaoHibernate extends AbstractDao {

    public PuestoCompetenciaDaoHibernate() {
        super();
    }
    
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
}
