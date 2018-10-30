/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROG_Boletin_6_1;

import java.util.Scanner;

/**
 *
 * @author fsancheztemprano
 */
public class PROG_Boletin_6_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero = -1;
        while (numero < 0) {
            System.out.println("Introduce un numero positivo: ");
            numero = scan.nextInt();
        }
        System.out.println(numero + " es positivo");
    }

}
