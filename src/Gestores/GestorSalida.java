/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestores;

import Entidades.Cuestionario;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

/**
 *
 * @author pc
 */
public class GestorSalida {
    
    private GestorSalida(){
    }
    
    public static GestorSalida getInstance() {
        return GestorSalidaHolder.INSTANCE;
    }
    
    private static class GestorSalidaHolder {

        private static final GestorSalida INSTANCE = new GestorSalida();
    }
    
    public void generarXls(List<Cuestionario> cuest) {
        JFileChooser fch = new JFileChooser();
        FileNameExtensionFilter filtro=new FileNameExtensionFilter("Archivos .xls", "xls");
        fch.setFileFilter(filtro);//Meto filtro para que solo se vean directorios y archivos XLS
        
        List<Cuestionario> cuestionarios = new ArrayList<Cuestionario>();//uso arraylist para acceder a indices en un for
        cuestionarios.addAll(cuest);
        
        //Muestro un dialogo sin pasarle parent con el boton de guardar
        int seleccion = fch.showDialog(null, "Guardar XLS");
        

        //analizamos la respuesta
        switch (seleccion) {
            case JFileChooser.APPROVE_OPTION:
                //Aca saco la ruta donde guardo el archivo
                String auxiliar = fch.getSelectedFile()+ ".xls";
                File archivoXLS = new File(auxiliar);
                
                try {
                    archivoXLS.createNewFile();

                    /*Se crea el libro de excel usando el objeto de tipo Workbook*/
                    Workbook libro = new HSSFWorkbook();
                    /*Se inicializa el flujo de datos con el archivo xls*/
                    FileOutputStream archivo = new FileOutputStream(archivoXLS);

                    /*Utilizamos la clase Sheet para crear una nueva hoja de trabajo dentro del libro que creamos anteriormente*/
                    Sheet hoja = libro.createSheet("Candidatos - Claves");

                    /*Hacemos un ciclo para inicializar los valores de N filas de celdas*/
                    for (int f = 0; f < cuest.size() + 1; f++) {//pongo size+1 porque la primera fila es de titulos
                        /*La clase Row nos permitirá crear las filas*/
                        Row fila = hoja.createRow(f);

                        /*Cada fila tendrá 5 celdas de datos (apellido, nombre, tipo, dni, clave)*/
                        for (int c = 0; c < 5; c++) {
                            /*Creamos la celda a partir de la fila actual*/
                            Cell celda = fila.createCell(c);

                            /*Si la fila es la número 0, estableceremos los encabezados*/
                            if (f == 0) {//pongo titulos
                                switch (c) {
                                    case 0:
                                        celda.setCellValue("Apellido");
                                        break;
                                    case 1:
                                        celda.setCellValue("Nombre");
                                        break;
                                    case 2:
                                        celda.setCellValue("Tipo de Documento");
                                        break;
                                    case 3:
                                        celda.setCellValue("Numero de Documento");
                                        break;
                                    case 4:
                                        celda.setCellValue("Clave");
                                        break;
                                }
                            } else {
                                /*Si no es la primera fila establecemos un valor*/
                                celda.setCellValue("Valor celda " + c + "," + f);

                                switch (c) {
                                    case 0:
                                        celda.setCellValue(cuestionarios.get(f - 1).getCandidato().getApellido());
                                        break;
                                    case 1:
                                        celda.setCellValue(cuestionarios.get(f - 1).getCandidato().getNombre());
                                        break;
                                    case 2:
                                        celda.setCellValue(cuestionarios.get(f - 1).getCandidato().getTipoDocumento());
                                        break;
                                    case 3:
                                        celda.setCellValue(cuestionarios.get(f - 1).getCandidato().getNumeroDocumento());
                                        break;
                                    case 4:
                                        celda.setCellValue(cuestionarios.get(f - 1).getClave());
                                        break;
                                }
                            }
                        }
                    }

                    /*Escribimos en el libro*/
                    libro.write(archivo);
                    /*Cerramos el flujo de datos*/
                    archivo.close();
                    /*Y abrimos el archivo con la clase Desktop*/
                    Desktop.getDesktop().open(archivoXLS);

                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;

            case JFileChooser.CANCEL_OPTION:
                
                break;

            case JFileChooser.ERROR_OPTION:
                
                break;
        }
        
        
    }
    
    
}
