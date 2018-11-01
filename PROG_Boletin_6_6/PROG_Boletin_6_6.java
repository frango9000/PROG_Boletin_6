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
public class PROG_Boletin_6_6 {
        public static void main(String[] args) {

            Producto prod1 = new Producto("Nombre1", 100);
            Producto prod2 = new Producto("Nombre500", 500);            
            Producto prod3 = new Producto("Nombre1000", 1000);            
            Producto prod4 = new Producto("Nombre1001", 1001);
            
            prod1.mostrarInfo();
            prod2.mostrarInfo();
            prod3.mostrarInfo();
            prod4.mostrarInfo();
    }
}
