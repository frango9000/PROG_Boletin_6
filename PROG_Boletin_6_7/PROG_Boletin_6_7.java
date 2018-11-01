/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROG_Boletin_6_7;

import javax.swing.JOptionPane;

/**
 *
 * @author fsancheztemprano
 */
public class PROG_Boletin_6_7 {

    public static void main(String[] args) {

        String[] opciones = {"Circulo", "Rectangulo", "Triangulo"};

        JOptionPane.showMessageDialog(null, "Calculadora de Areas Geometricas", "Boletin_6_7", 1);
        // int seleccion = JOptionPane.showOptionDialog( null, "Seleccione opcion", "Selector de opciones", JOptionPane.QUESTION_MESSAGE, null, opciones, 1);
        int seleccion = JOptionPane.showOptionDialog(null, "Selecciona una figura geometrica", "Boletin_6_7", 0, 0, null, opciones, 1);

        switch (seleccion) {
            case 0:
                Circulo circulo = new Circulo();
                circulo.mostrarArea();
                break;
            case 1:
                Rectangulo rectangulo = new Rectangulo();
                rectangulo.mostrarArea();
                break;
            case 2:
                Triangulo triangulo = new Triangulo();
                triangulo.mostrarArea();
                break;

        }

    }

    public static float introduceFloat(String str) {
        float numFloat = -1;
        boolean ask;
        do {
            try {
                ask = false;
                numFloat = Float.parseFloat(JOptionPane.showInputDialog(null, "Introduce " + str, "Boletin_6_7", 1));
            } catch (NumberFormatException e) {
                ask = true;
            }
        } while (ask || numFloat < 0);
        return numFloat;
    }

}
