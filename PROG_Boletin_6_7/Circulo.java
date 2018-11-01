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
public class Circulo {
    float radio;

    public Circulo() {        
        radio= PROG_Boletin_6_7.introduceFloat("el radio");
    }

    public Circulo(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float calcArea() {
        double area = Math.pow(radio, 2) * Math.PI;
        return (float) area;
    }
    public void mostrarArea(){
        JOptionPane.showMessageDialog(null, "Circulo: \nradio : "+radio+"\nArea  =  "+calcArea(), "Boletin_6_7 - Circulo", 1);
    }

    public float calclongitud() {
        double area = 2 * radio * Math.PI;
        return (float) area;
    }
}
