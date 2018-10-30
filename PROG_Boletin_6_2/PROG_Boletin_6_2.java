/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROG_Boletin_6_2;

import java.util.Scanner;

/**
 *
 * @author fsancheztemprano
 */
public class PROG_Boletin_6_2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Introduce el primer numero :");
        short num1 = scan.nextShort();

        System.out.println("Introduce el segundo numero :");
        short num2 = scan.nextShort();

        if (num1 >= num2) {
            System.out.println("Resta num 1 - num2 : " + (num1 - num2));
        }

        System.out.println("Suma num 1 + num2 : " + (num1 + num2));

    }

}
