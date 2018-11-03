/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROG_Boletin_6_4;

//import java.util.Scanner;

/**
 *
 * @author fsancheztemprano
 */
public class PROG_Boletin_6_4 {
        public static void main(String[] args) {

            Persona pers1 = new Persona("Nombre1", 10f);
            Persona pers2 = new Persona("Nombre2", 10f);
            
//            if(Persona.compararPeso(pers1, pers2)>0){
//                System.out.println("La persona mas pesada es: \n");
//                pers1.visualizarPersona();
//                System.out.println("Pesa: " + Persona.compararPeso(pers1, pers2) + " mas que " + pers2.getNombre()+".\n");
//            }else if (Persona.compararPeso(pers1, pers2)<0){
//                System.out.println("La persona mas pesada es: \n");
//                pers2.visualizarPersona();
//                System.out.println("Pesa: " + Persona.compararPeso(pers2, pers1) + " mas que " + pers2.getNombre()+".\n");
//            }else{
//                System.out.println(pers1.getNombre() + " y " + pers2.getNombre() + " pesan igual.\n" );
//            }
            System.out.println("El Mas Gordo es:");
            pers1.masGordo(pers2).visualizarPersona();
            System.out.println("Diferencia de peso: " + pers1.masGordo(pers2).compararPeso(pers1.masFlaco(pers2)));
            

    }
}
