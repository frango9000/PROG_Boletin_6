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
public class Triangulo {
    float base;
    float altura;

    public Triangulo() {
        base= PROG_Boletin_6_7.introduceFloat("la base");
        altura= PROG_Boletin_6_7.introduceFloat("la altura");
    }

    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public float calcArea() {
        float area = (base * altura)/2;
        return area;
    }
    public void mostrarArea(){
        JOptionPane.showMessageDialog(null, "Triangulo: \nbase : "+this.base+"\naltura : "+altura+"\nArea  =  "+calcArea(), "Boletin_6_7 - Triangulo", 1);
    }
}
