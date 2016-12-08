/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestores;

import Dao.DaoCompetencia;
import Dao.DaoPuesto;
import Entidades.Competencia;
import Entidades.CompetenciaCopia;
import Entidades.Puesto;
import Entidades.PuestoCompetencia;
import Entidades.PuestoCopia;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Eunice
 */
public class GestorCopia {
    
    private GestorCopia() {
    }
    
    public static GestorCopia getInstance() {
        return GestorCopiaHolder.INSTANCE;
    }
    
    private static class GestorCopiaHolder {

        private static final GestorCopia INSTANCE = new GestorCopia();
    }
 
    public PuestoCopia duplicarPuesto(Puesto puesto) {

         DaoCompetencia daoCompetencia= new DaoCompetencia();
        
        Date fechaCopia = new Date();
        DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
        hourdateFormat.format(fechaCopia);

        PuestoCopia puestoCopiado = new PuestoCopia();
        DaoPuesto daoPuesto= new DaoPuesto();
        daoPuesto.savePuestoCopia(puestoCopiado);
        puestoCopiado.setPuestoOriginal(puesto);
        puestoCopiado.setNombrePuesto(puesto.getNombrePuesto());
        puestoCopiado.setNombreEmpresa(puesto.getNombreEmpresa());
        puestoCopiado.setDescripcion(puesto.getDescripcion());
        puestoCopiado.setFechaCopia(fechaCopia);
        
        List<CompetenciaCopia> competenciasCopia= new ArrayList();
        Set competenciasSet=puesto.getCompetencias();
        List<Competencia> competenciasOriginales=  new ArrayList();
        competenciasOriginales.addAll(competenciasSet);
        
         GestorPuesto gestorPuesto = GestorPuesto.getInstance();
         
        PuestoCompetencia puestoCompetencia;
        int idCompetencia;
        int ponderacion;
        
        //por cada competencia original realizo una copia y la seteo con los parametros correspondientes
        for (Competencia compOriginal : competenciasOriginales) {
            
            //creo una competenciaCopia
            CompetenciaCopia competenciaCopia = new CompetenciaCopia();
            //seteo nombre
            competenciaCopia.setNombreCompetencia(compOriginal.getNombreCompetencia());
            //seteo descripcion
            competenciaCopia.setDescripcion(compOriginal.getDescripcion());
        
            //SE RECUPERAN LAS PONDERACIONES DE LAS COMPETENCIAS DESDE LA BD
            //guardo el id de competenciaOriginal para buscar las ponderaciones en la tabla de union
            idCompetencia = compOriginal.getIdCompetencia();
            //recupero una instancia de PuestoCompetencia pasando los id del puesto y la competencia
            puestoCompetencia = gestorPuesto.find(Long.valueOf(puesto.getIdPuesto()), Long.valueOf(idCompetencia));
            //pido la ponderacion guardada en esa instancia
            ponderacion = puestoCompetencia.getPuntajeRequerido();
            
            //seteo puntaje
            competenciaCopia.setPuntajeRequerido(ponderacion);
            //seteo el puesto copiado a la que pertenece la competencia copia
            competenciaCopia.setPuestoCopia(puestoCopiado);
            
            //agrego a la lista de competenciasCopia la competenciaCopia inicializada y seteada
            competenciasCopia.add(competenciaCopia);
            
           //daoCompetencia.save(competenciaCopia);
                
            }
        Set competenciasCopiaSet=new HashSet();
        competenciasCopiaSet.addAll(competenciasCopia);
        puestoCopiado.setCompetencias(competenciasCopiaSet);
        daoPuesto.updatePuestoCopia(puestoCopiado);
                return puestoCopiado;
            
    }
}
