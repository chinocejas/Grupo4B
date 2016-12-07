/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestores;

import Dao.DaoCompetencia;
import Entidades.Competencia;
import Entidades.Factor;
import Entidades.Puesto;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


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
        
        
        DaoCompetencia competenciaDAO = new DaoCompetencia();
        listaCompetencias=competenciaDAO.findAllOrdenadoPorNombre();
        
        return listaCompetencias;
        
        
    }

    public Set<Factor> getFactores(Competencia comp){
        Set<Factor> ret;
        ret = comp.getFactores();
        return ret;
    }
}
