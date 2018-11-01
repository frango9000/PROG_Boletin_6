/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROG_Boletin_6_6;


/**
 *
 * @author fsancheztemprano
 */

public class Producto {
    
    private String nombre;
    private int ventasAnuales;
    
    
    
    public Producto(){
        
    }

    public Producto(String nombre, int ventasAnuales) {
        this.nombre = nombre;
        this.ventasAnuales = ventasAnuales;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeso() {
        return ventasAnuales;
    }

    public void setPeso(int ventasAnuales) {
        
        this.ventasAnuales = ventasAnuales;
    
    }
    
    public String tipoProducto() {
        if (ventasAnuales <= 100) {
            return "bajo";
        } else if (ventasAnuales > 100 && ventasAnuales <= 500) {
            return "medio";
        } else if (ventasAnuales > 500 && ventasAnuales <= 1000) {
            return "alto";
        } else {
            return "primera necesidad";
        }
    }

    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre + "\nVentas Anuales: "+ventasAnuales+"\nTipo de Producto: "+tipoProducto());
    }

    
}
