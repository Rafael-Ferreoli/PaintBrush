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
public class Piramide extends D2 {

    public int x1;
    public int y1;
    public int largura;
    public int altura;
    public Color corSecundaria;


    @Override
    public float area() {
        return 0;
    }

    @Override
    public float perimetro() {
        return 0;
    }

    @Override
    public void desenhar(Graphics g) {
       g.setColor(corPrimaria);
       g.drawLine(x,y,x+largura/2,y-altura);
       g.drawLine(x+largura, y, x+largura/2, y-altura);
       g.drawRect(x, y, largura, altura);
       g.drawLine(x, y1, x+largura/2, y-altura);
       g.drawLine(x+largura, y1, x+largura/2, y-altura);
    }
}

//coloquei as duas linhas centrais depois de fazer o retangulo para pegar as pontas inferiores.