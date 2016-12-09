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
import Entidades.Factor;
import Entidades.FactorCopia;
import Entidades.OpcionRespuesta;
import Entidades.OpcionRespuestaCopia;
import Entidades.Pregunta;
import Entidades.PreguntaCopia;
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

        GestorPuesto gestorPuesto = GestorPuesto.getInstance();
        DaoPuesto daoPuesto = new DaoPuesto();
        DaoCompetencia daoCompetencia = new DaoCompetencia();

        Date fechaCopia = new Date();
        DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
        hourdateFormat.format(fechaCopia);

        PuestoCopia puestoCopiado = new PuestoCopia();

        puestoCopiado.setPuestoOriginal(puesto);
        puestoCopiado.setNombrePuesto(puesto.getNombrePuesto());
        puestoCopiado.setNombreEmpresa(puesto.getNombreEmpresa());
        puestoCopiado.setDescripcion(puesto.getDescripcion());
        puestoCopiado.setFechaCopia(fechaCopia);

        //obtengo el set de COMPETENCIAS originales y lo convierto a list
        Set competenciasSet = puesto.getCompetencias();
        List<Competencia> competenciasOriginales = new ArrayList();
        competenciasOriginales.addAll(competenciasSet);

        PuestoCompetencia puestoCompetencia;
        int idCompetencia;
        int ponderacion;

        List<CompetenciaCopia> competenciasCopia = new ArrayList();

        //por cada COMPETENCIA original realizo una copia y la seteo con los parametros correspondientes
        for (Competencia compOriginal : competenciasOriginales) {

            //creo una competenciaCopia
            CompetenciaCopia competenciaCopia = new CompetenciaCopia();
            daoCompetencia.saveCompetenciaCopia(competenciaCopia);

            //SE RECUPERAN LAS PONDERACIONES DE LAS COMPETENCIAS DESDE LA BD
            //guardo el id de competenciaOriginal para buscar las ponderaciones en la tabla de union
            idCompetencia = compOriginal.getIdCompetencia();
            //recupero una instancia de PuestoCompetencia pasando los id del puesto y la competencia
            puestoCompetencia = gestorPuesto.find(Long.valueOf(puesto.getIdPuesto()), Long.valueOf(idCompetencia));
            //pido la ponderacion guardada en esa instancia
            ponderacion = puestoCompetencia.getPuntajeRequerido();

            //seteo la competencia copia:
            //seteo nombre
            competenciaCopia.setNombreCompetencia(compOriginal.getNombreCompetencia());
            //seteo descripcion
            competenciaCopia.setDescripcion(compOriginal.getDescripcion());
            //seteo el puesto copiado a la que pertenece la competencia copia
            competenciaCopia.setPuestoCopia(puestoCopiado);
            //seteo puntaje
            competenciaCopia.setPuntajeRequerido(ponderacion);

            //REALIZO LA COPIA DE LOS FACTORES PARA CADA COMPETENCIA..............
            //obtengo el set de FACTORES originales y lo convierto a list
            Set factoresSet = compOriginal.getFactores();
            List<Factor> factoresOriginales = new ArrayList();
            factoresOriginales.addAll(factoresSet);

            List<FactorCopia> factoresCopia = new ArrayList();

            //por cada FACTOR original realizo una copia y lo seteo con los parametros correspondientes
            for (Factor factOriginal : factoresOriginales) {

                //creo un factorCopia
                FactorCopia factorCopia = new FactorCopia();

                //seteo el factor copia:
                //seteo nombre
                factorCopia.setNombre(factOriginal.getNombre());
                //seteo descripcion
                factorCopia.setDescripcion(factOriginal.getDescripcion());
                //seteo NroOrden
                factorCopia.setNumeroOrden(factOriginal.getNumeroOrden());
                //seteo la competencia copia a la que pertenece el factor copia
                factorCopia.setCompetenciaCopia(competenciaCopia);

                //---REALIZO LA COPIA DE LAS PREGUNTAS PARA CADA FACTOR--------------
                //-------------------------------------------------------------------
                //obtengo el set de PREGUNTAS originales y lo convierto a list
                Set preguntasSet = factOriginal.getPreguntas();
                List<Pregunta> preguntasOriginales = new ArrayList();
                preguntasOriginales.addAll(preguntasSet);

                List<PreguntaCopia> preguntasCopia = new ArrayList();

                //por cada PREGUNTA original realizo una copia y lo seteo con los parametros correspondientes
                //seteo opcion de rta:
                //creo una OpcionRespuestaCopia
                OpcionRespuestaCopia opcRtaCopia = new OpcionRespuestaCopia();
                //seteo el nombre de la opcRtaCopia
                if (!preguntasOriginales.isEmpty()) {
                    //pido la opcRta original
                    OpcionRespuesta opcRtaOriginal = preguntasOriginales.get(0).getOpcionRespuesta();

                    opcRtaCopia.setNombreOpcionRespuesta(opcRtaOriginal.getNombreOpcionRespuesta());
                    //seteo la descripcion de la opcRtaCopia
                    opcRtaCopia.setDescripcion(opcRtaOriginal.getDescripcion());

                }
                for (Pregunta pregOriginal : preguntasOriginales) {

                    //creo una preguntaCopia
                    PreguntaCopia preguntaCopia = new PreguntaCopia();

                    //seteo la pregunta copia:
                    //seteo nombre
                    preguntaCopia.setNombrePregunta(pregOriginal.getNombrePregunta());
                    //seteo descripcion
                    preguntaCopia.setDescripcion(pregOriginal.getDescripcion());
                    //seteo la pregunta
                    preguntaCopia.setPregunta(pregOriginal.getPregunta());
                    //seteo el factor copia al que pertenece la pregunta copia
                    preguntaCopia.setFactorCopia(factorCopia);
                    //seteo la opcRta
                    preguntaCopia.setOpcionRespuestaCopia(opcRtaCopia);

                    //agrego a la lista de preguntasCopia la preguntaCopia recien seteada
                    preguntasCopia.add(preguntaCopia);

                }
                //conversion de list a set
                Set preguntasCopiaSet = new HashSet();
                preguntasCopiaSet.addAll(preguntasCopia);
                factorCopia.setPreguntaCopias(preguntasCopiaSet);
                //------------------------------------------------------------------
                //------------------------------------------------------------------
                //agrego a la lista de factoresCopia el factorCopia recien seteado
                factoresCopia.add(factorCopia);

            }
            //conversion de list a set
            Set factoresCopiaSet = new HashSet();
            factoresCopiaSet.addAll(factoresCopia);
            //....................................................................

            //seteo los factores a la competencia copiada
            competenciaCopia.setFactorCopias(factoresCopiaSet);

            //agrego a la lista de competenciasCopia la competenciaCopia inicializada y seteada
            competenciasCopia.add(competenciaCopia);

        }
        //conversion de list a set
        Set competenciasCopiaSet = new HashSet();
        competenciasCopiaSet.addAll(competenciasCopia);

        //seteo las competencias al puesto copiado
        puestoCopiado.setCompetencias(competenciasCopiaSet);
        //actualizo el puesto ya con todos los datos
        daoPuesto.savePuestoCopia(puestoCopiado);
        return puestoCopiado;
    }
}
