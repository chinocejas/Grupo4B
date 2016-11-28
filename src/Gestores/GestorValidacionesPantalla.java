/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestores;

/**
 *
 * @author John
 */
public class GestorValidacionesPantalla {
    
    private GestorValidacionesPantalla() {
    }
    
    public static GestorValidacionesPantalla getInstance() {
        return GestorValidacionesPantallaHolder.INSTANCE;
    }
    
    private static class GestorValidacionesPantallaHolder {

        private static final GestorValidacionesPantalla INSTANCE = new GestorValidacionesPantalla();
    }
    
    // Los metodos se reescriben para un JTextField y para un JTextArea
    //------------ METODOS PARA ALTA PUESTO Y MODIFICAR PUESTO---------------
    public void keyReleased (javax.swing.JTextField jTextfieldS){
        //Convierte el texto ingresado a mayusculas
            int pos = jTextfieldS.getCaretPosition();
            convertiraMayusculas(jTextfieldS, pos);
    }
   
    public void keyReleased (javax.swing.JTextArea jTextAreaS){
        //Convierte el texto ingresado a mayusculas
            int pos = jTextAreaS.getCaretPosition();
            convertiraMayusculas(jTextAreaS, pos);
    }
    
    public void keyTyped(javax.swing.JTextField jTextfieldS, java.awt.event.KeyEvent evt){
        jTextfieldS.setBackground(new java.awt.Color(0, 51, 102));
        char c = evt.getKeyChar();
        int pos = jTextfieldS.getCaretPosition();
        //Solo permite letras, espacios, numeros y caracteres comunes
        if (c < 32 || (c > 32 && c < 40) || (c > 57 && c < 65) || (c>90 && c<97) || c > 122 ||(pos>101)) {
            evt.consume();
        } else {
            //Convierte el texto ingresado a mayusculas
            pos = jTextfieldS.getCaretPosition();
            convertiraMayusculas(jTextfieldS, pos);
            
        }
    }

    public void keyTypedSoloNumeros(javax.swing.JTextField jTextfieldS, java.awt.event.KeyEvent evt) {
        jTextfieldS.setBackground(new java.awt.Color(0, 51, 102));
        char c = evt.getKeyChar();
        int pos = jTextfieldS.getCaretPosition();
        //Solo permite letras, espacios, numeros y caracteres comunes
        if (c < 48 || c > 57 || (pos > 14)) {
            evt.consume();
        } else {
            //Convierte el texto ingresado a mayusculas
            pos = jTextfieldS.getCaretPosition();
            convertiraMayusculas(jTextfieldS, pos);

        }
    }
    //Admite solo numeros. No espacios ni nada
    public void keyTypedSoloNumeros2(javax.swing.JTextField jTextfieldS, java.awt.event.KeyEvent evt) {
        jTextfieldS.setBackground(new java.awt.Color(0, 51, 102));
        char c = evt.getKeyChar();
        int pos = jTextfieldS.getCaretPosition();
        //Solo permite numeros
        if (c < 48 || c > 57) {
            evt.consume();
        }
    }
    
    //Solo permite caracteres y espacios
    public void keyTypedTextoYEspacios(javax.swing.JTextField jTextfieldS, java.awt.event.KeyEvent evt){
        jTextfieldS.setBackground(new java.awt.Color(0, 51, 102));
        char c = evt.getKeyChar();
        int pos = jTextfieldS.getCaretPosition();
        //Solo permite letras, espacios, numeros y caracteres comunes
        if (c < 32 || (c > 32 && c < 65) || (c>90 && c<97) || c > 122 ||(pos>101)) {
            evt.consume();
        } else {
            //Convierte el texto ingresado a mayusculas
            pos = jTextfieldS.getCaretPosition();
            convertiraMayusculas(jTextfieldS, pos);
            
        }
    }
    
    public void keyTyped(javax.swing.JTextArea jTextAreaS, java.awt.event.KeyEvent evt){
        jTextAreaS.setBackground(new java.awt.Color(0, 51, 102));
        char c = evt.getKeyChar();
        int pos = jTextAreaS.getCaretPosition();
        //Solo permite letras, espacios, numeros y caracteres comunes
        if (c < 32 || (c > 32 && c < 40) || (c > 57 && c < 65) || (c>90 && c<97) || c > 122 ||(pos>101)) {
            evt.consume();
        } else {
            //Convierte el texto ingresado a mayusculas
            pos = jTextAreaS.getCaretPosition();
            convertiraMayusculas(jTextAreaS, pos);
            
        }
    }
    
    public void convertiraMayusculas(javax.swing.JTextField jTextfieldS, int pos) {
        String cadena = (jTextfieldS.getText()).toUpperCase();
        jTextfieldS.setText(cadena);
        jTextfieldS.setCaretPosition(pos);
    }
    
    public void convertiraMayusculas(javax.swing.JTextArea jTextAreaS, int pos) {
        String cadena = (jTextAreaS.getText()).toUpperCase();
        jTextAreaS.setText(cadena);
        jTextAreaS.setCaretPosition(pos);
    }
    
    //--------------------------------------------------------------------------
    
}
