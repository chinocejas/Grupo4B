/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Persona {
    
    private String nombre; 
    
     public Persona(){
 
    }
    
    public Persona(String nombre){
        this.nombre=nombre;
        
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public static ArrayList<Persona> getPersonas(){
        
        ArrayList<Persona> personas = new ArrayList<Persona>();
        
        Persona p1= new Persona("Hernesto");
        Persona p2= new Persona("Carlos");
        Persona p3= new Persona("Roberto");
        
        personas.add(p1);
        personas.add(p2);
        personas.add(p3);
        
        return personas;
    }
}
