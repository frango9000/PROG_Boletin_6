/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROG_Boletin_6_3;

import java.util.Scanner;

/**
 *
 * @author fsancheztemprano
 */
public class PROG_Boletin_6_3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numero;

        System.out.println("Introduce un numero : ");
        numero = scan.nextInt();
        if (numero > 0) {
            System.out.println(" + ");
        } else if (numero < 0) {
            System.out.println(" - ");
        } else {
            System.out.println(numero);
        }
    }

}
