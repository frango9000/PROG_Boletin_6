/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROG_Boletin_6_4;

/**
 *
 * @author fsancheztemprano
 */

public class Persona {
    
    private String nombre;
    private float peso;
    
    
    
    public Persona(){
        
    }

    public Persona(String nombre, float peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        
        this.peso = peso;
    
    }
    
    public static float compararPeso(Persona a, Persona b){
        return a.peso - b.peso;                          
    }
    public void visualizarPersona(){
        System.out.println("Nombre: " + nombre + " Peso: " + peso + "\n");
    }
    
    
}
