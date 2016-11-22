/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestores;


/**
 *
 * @author Agustina
 */
public class GestorRepositorio {
    String instrucciones = "Lorem ipsum dolor sit amet, consectetur  adipiscing elit, sed do eiusmod tempor incididunt ut \n "
            + "labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut \n"
            + "aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum \n"
            + "dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia\n"
            + "Lorem ipsum dolor sit amet, consectetur  adipiscing elit, sed do eiusmod tempor incididunt ut \n "
            + "labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut \n"
            + "aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum \n"
            + "dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia\n"
            + "deserunt mollit anim id est laborum \n " 
            + "Lorem ipsum dolor sit amet, consectetur  adipiscing elit, sed do eiusmod tempor incididunt ut \n "
            + "labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut \n"
            + "aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum \n";
    String inst2 = "<html><h1>INSTRUCCIONES</h1><b><u>T</u>wo</b><br>lines</html>";
    

    public String getInst2() {
        return inst2;
    }
    
    
    
    public void setInstrucciones(String instrucciones) {
        this.instrucciones = instrucciones;
    }
    
    
    private GestorRepositorio() {
    }
    
    public String getInstrucciones(){
        
        return inst2;
    }
    public static GestorRepositorio getInstance() {
        return GestorRepositorioHolder.INSTANCE;
    }
    
    private static class GestorRepositorioHolder {

        private static final GestorRepositorio INSTANCE = new GestorRepositorio();
    }
}
