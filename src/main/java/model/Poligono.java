/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author rafael
 */
public class Poligono extends Ponto{
    public ArrayList coordX;
    public ArrayList coordY;
    public Color corSecundaria;
    public Poligono(){
        coordX = new ArrayList<Integer>();
        coordY = new ArrayList<Integer>();
    }
    @Override
    public void desenhar(Graphics g){
       g.setColor(corPrimaria);
        int[] vetX = new int[coordX.size()];
        int[] vetY = new int[coordX.size()];
        for(int i = 0; i < coordX.size(); i++){
            vetX[i] = (int) coordX.get(i);
            vetY[i] = (int) coordY.get(i);
        }
       g.drawPolygon(vetX, vetY, coordX.size());
       g.setColor(corSecundaria);
       g.fillPolygon(vetX, vetY, coordX.size());
    }
}
