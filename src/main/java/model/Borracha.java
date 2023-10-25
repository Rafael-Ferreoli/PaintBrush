/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.awt.Graphics;

/**
 *
 * @author rafael
 */
public class Borracha extends D2{
    public int base,largura;
    private int tamanhoBorracha = 20;
    @Override
    public float area() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public float perimetro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public void desenhar(Graphics g){
        g.setColor(corPrimaria);
        g.fillRect(x, y, tamanhoBorracha, tamanhoBorracha);
    }

    /**
     * @param tamanhoBorracha the tamanhoBorracha to set
     */
    public void setTamanhoBorracha(int tamanhoBorracha) {
        this.tamanhoBorracha = tamanhoBorracha;
    }
    
}
