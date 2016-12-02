/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestores;

import Dao.DaoConsultor;
import Dao.LDAP;
import Entidades.Consultor;

//COMPROBAR QUE FUNCIONA COMO SINGLETON!
/**
 *
 * @author John
 */
public class GestorConsultor {
    
    private Consultor consultor;
    
    private GestorConsultor() {
    }
    
    public static GestorConsultor getInstance() {
        return GestorConsultorHolder.INSTANCE;
    }
    
    private static class GestorConsultorHolder {

        private static final GestorConsultor INSTANCE = new GestorConsultor();
    }
    
    public int validarConsultor(String username, String password){
      
        Integer idConsultor;
        LDAP ldap = new LDAP();
        idConsultor=ldap.findPorUsernameYClave(username, password);
        if(idConsultor!=null){
        
        DaoConsultor consultorDAO = new DaoConsultor();
        consultor=consultorDAO.buscarConsultor(idConsultor);
        return 1;
        }
        else
        return 0;
    }
    
     public Consultor getConsultor() {
        return this.consultor;
    }
    
     //no creo que sea necesario y hasta peligroso
    /*public void setConsultor(Consultor consultor) {
        this.consultor = consultor;
    }
    */
}
