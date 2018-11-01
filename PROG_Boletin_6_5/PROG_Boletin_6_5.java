/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROG_Boletin_6_5;

import javax.swing.JOptionPane;

/**
 *
 * @author fsancheztemprano
 */
public class PROG_Boletin_6_5 {
    
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Dados 3 números que se supon distintos,\nindicar cal é o maior", "Boletin_6_5", 1);

        int num1 = introduceInt("primer");
        int num2 = introduceInt("segundo");
        int num3 = introduceInt("tercer");

        if (num1 > num2 && num1 > num3) {
            JOptionPane.showMessageDialog(null, "El primer numero es el mayor.\n" + num1, "Boletin_6_5", 1);
        }else if(num2 > num1 && num2 > num3) {            
            JOptionPane.showMessageDialog(null, "El segundo numero es el mayor.\n" + num2, "Boletin_6_5", 1);
        }else if(num3 > num1 && num3 > num2) {            
            JOptionPane.showMessageDialog(null, "El tercer numero es el mayor.\n" + num3, "Boletin_6_5", 1);
        }else{
            JOptionPane.showMessageDialog(null, "El numero mayor esta duplicado\n" + num1 +", "+ num2 +", "+ num3, "Boletin_6_5", 1);
        }
    }
    public static int introduceInt(String str) {
        int numInt = 0;
        boolean ask;
        do {
            try {
                ask=false;
                numInt = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el " + str + " numero.", "Boletin_6_5", 1));
            } catch (NumberFormatException e) {
                ask=true;
            }
        } while (ask);
        return numInt;
    }
    
}

