package model;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.BasicStroke;
import java.awt.Color;

/**
 * Classe para representar um ponto.
 */
public class Ponto {

    public int x;
    public int y;
    public Color corPrimaria;
    public Color corInterna;
    public int tamanhoPonto; // Tamanho do ponto

    public Ponto() {
        this.tamanhoPonto = 2; // Tamanho padrão do ponto
    }

    public void setTamanhoPonto(int tamanhoPonto) {
        this.tamanhoPonto = tamanhoPonto;
    }

    public void desenhar(Graphics c) {
        Graphics2D g2d = (Graphics2D) c;
        g2d.setColor(corPrimaria);

        // Defina a espessura da linha (aumente este valor para fazer o ponto mais grosso)
        g2d.setStroke(new BasicStroke(tamanhoPonto)); // Ajuste o tamanho do ponto conforme necessário

        // Desenhe o ponto
        g2d.drawLine(x, y, x, y);
    }
}
