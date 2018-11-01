/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROG_Boletin_6_2;

import javax.swing.JOptionPane;

/**
 *
 * @author fsancheztemprano
 */
public class PROG_Boletin_6_2 {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Implementa un programa no que se tecleen dous números de tipo short.\n Se o primeiro é maior ou igual que o segundo, \n visualizaremos a resta . En calquera caso visualizaremos a suma .", "Boletin_6_2", 1);

        short num1 = introduceShort("primer");
        short num2 = introduceShort("segundo");

        if (num1 >= num2) {
            JOptionPane.showMessageDialog(null, "Resta: " + (num1 - num2), "Boletin_6_2", 1);
        }
        JOptionPane.showMessageDialog(null, "Suma: " + (num1 + num2), "Boletin_6_2", 1);
    }

    public static short introduceShort(String str) {
        int numInt;
        do {
            try {
                numInt = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el " + str + " numero.\n Rango: -32768 , 32767", "Boletin_6_2", 1));
            } catch (NumberFormatException e) {
                numInt = 33333;
            }
        } while (numInt > 32767 || numInt < -32768);
        short numShort = (short) numInt;
        return numShort;
    }

}
