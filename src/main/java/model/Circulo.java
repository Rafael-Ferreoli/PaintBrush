/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author rafael
 */
public class Circulo extends D2{
    public Color corInterna;
    public float raio;
    public float diametro;
    @Override
    public void desenhar(Graphics g){
        super.desenhar(g);
        g.setColor(corPrimaria);
        g.drawOval(x, y,(int) raio,(int) raio);
        g.setColor(corInterna);
        g.fillOval(x, y,(int) raio,(int) raio);
    }

    @Override
    public float area() {
        float retorno = (float) (Math.PI*raio*raio);         
        return retorno;
    }

    @Override
    public float perimetro() {
        return (float) (2*Math.PI * raio);
    }
    
}
