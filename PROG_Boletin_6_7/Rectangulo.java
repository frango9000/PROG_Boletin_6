/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROG_Boletin_6_7;

import javax.swing.JOptionPane;

/**
 *
 * @author NarF
 */
public class Rectangulo {
    float lado1;
    float lado2;

    public Rectangulo() {
        lado1= PROG_Boletin_6_7.introduceFloat("lado 1");
        lado2= PROG_Boletin_6_7.introduceFloat("lado 2");
    }

    public Rectangulo(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public float getLado1() {
        return lado1;
    }

    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    public float getLado2() {
        return lado2;
    }

    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }
    
    public float calcArea() {
        float area = lado1 * lado2;
        return area;
    }
    
    public void mostrarArea(){
        JOptionPane.showMessageDialog(null, "Rectangulo: \nlado1 : "+lado1+"\nlado 2 : "+lado2+"\nArea  =  "+calcArea(), "Boletin_6_7 - Rectangulo", 1);
    }
    
    public float calcSumaLados() {
        float sLados = 2*(lado1 + lado2);
        return sLados;
    }
    
}
