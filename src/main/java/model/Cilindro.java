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
public class Cilindro extends Ponto {

    public Color corInterna;
    public boolean showArea = false;
    public int x1;
    public int y1;

    @Override
    public void desenhar(Graphics g) {
        g.setColor(corPrimaria);
        g.drawRect(x, y, x1 - x, y1 - y);
        g.setColor(corInterna);
        g.fillRect(x + 1, y, x1 - x - 1, y1 - y);// para nao aparecer as partes de cima e de baixo do retangulo, fiz o preenchimento em x + 1 para aparecer a borda da esquerda e x - 1 para aparecer a borda da direita
        g.fillOval(x, y - ((y1 - y) / 20), x1 - x, ((y1 - y) / 10));
        g.fillOval(x, y1 - ((y1 - y) / 20), x1 - x, ((y1 - y) / 10));
        g.setColor(corPrimaria);
        g.drawOval(x, y - ((y1 - y) / 20), x1 - x, ((y1 - y) / 10));// parte de cima
        g.drawOval(x, y1 - ((y1 - y) / 20), x1 - x, ((y1 - y) / 10));//parte de baixo
        g.setColor(Color.BLACK);
        if (showArea) {
            g.drawString("Area: " + calculaArea() + " Volume: " + calculaVolume(), x - 60, y - 5);
        }

    }

    public float calculaVolume() {
        return (float) Math.PI * ((y1 - y) / 10) * ((y1 - y) / 10) * (x - x1); //V = Pi*R^2 * H
    }

    public float calculaArea() {
        return (float) ((2 * Math.PI * ((y1 - y) / 10) * ((y1 - y) / 10)) + (2 * (Math.PI * (((y1 - y) / 10) * ((y1 - y) / 10))))); //2*Pi*R*H + 2*Pi*R^2
    }
}
