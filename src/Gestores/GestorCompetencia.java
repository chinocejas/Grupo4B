/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestores;

import Dao.CompetenciaDaoHibernate;
import Entidades.Puesto;
import java.util.List;


/**
 *
 * @author John
 */
public class GestorCompetencia {
    
    private GestorCompetencia() {
    }
    
    public static GestorCompetencia getInstance() {
        return GestorCompetenciaHolder.INSTANCE;
    }
    
    private static class GestorCompetenciaHolder {

        private static final GestorCompetencia INSTANCE = new GestorCompetencia();
    }
    
    public List allCompetenciasOrdenadasPorNombre(){
        
        List listaCompetencias=null;
        
        
        CompetenciaDaoHibernate competenciaDAO = new CompetenciaDaoHibernate();
        listaCompetencias=competenciaDAO.findAllOrdenadoPorNombre();
        
        return listaCompetencias;
        
        
    }
}
