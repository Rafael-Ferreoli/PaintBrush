package model;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.BasicStroke;
import java.awt.Color;

/**
 * Classe para representar uma reta.
 */
public class Reta extends D2 {

    public int x1, y1;
    public int tamanhoPonto; // Tamanho do ponto específico para Reta

    public Reta() {
        this.tamanhoPonto = 1; // Tamanho padrão do ponto para Reta
    }

    public void setTamanhoPonto(int tamanhoPonto) {
        this.tamanhoPonto = tamanhoPonto;
    }

    @Override
    public float area() {
        return 0;
    }

    @Override
    public float perimetro() {
        return Math.abs(x - x1);
    }

    @Override
    public void desenhar(Graphics g) {
        super.desenhar(g);

        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(corPrimaria);

        // Defina a espessura da linha (aumente este valor para fazer o ponto mais grosso)
        g2d.setStroke(new BasicStroke(tamanhoPonto)); // Ajuste o tamanho do ponto conforme necessário

        g2d.drawLine(x, y, x1, y1);
        if (showArea) {
            g.setColor(Color.BLACK);
            desenharInformacoes(g);
        }
    }

    public void desenharInformacoes(Graphics g) {
        float volume = perimetro();

        // Formata os valores com uma casa decimal
        String perimetroFormatado = String.format("%.1f", volume);

        String informacoes = "Medida: " + perimetroFormatado;

        g.drawString(informacoes,x,y);
    }
}
