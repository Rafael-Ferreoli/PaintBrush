package model;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.BasicStroke;
import java.awt.Color;

/**
 * Classe para representar um círculo.
 */
public class Circulo extends D2 {

    public Color corInterna;
    public float raio;
    public float diametro;
    public int tamanhoPonto; // Tamanho do ponto específico para Circulo

    public Circulo() {
        this.tamanhoPonto = 3; // Tamanho padrão do ponto para Circulo
    }

    public void setTamanhoPonto(int tamanhoPonto) {
        this.tamanhoPonto = tamanhoPonto;
    }

    @Override
    public float area() {
        float retorno = (float) (Math.PI * raio * raio);
        return retorno;
    }

    @Override
    public float perimetro() {
        return (float) (2 * Math.PI * raio);
    }

    @Override
    public void desenhar(Graphics g) {
        super.desenhar(g);

        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(corInterna);
        // Defina a espessura da linha (aumente este valor para fazer o ponto mais grosso)
        g2d.setStroke(new BasicStroke(tamanhoPonto)); // Ajuste o tamanho do ponto conforme necessário

        g2d.drawOval(x, y, (int) raio, (int) raio);
        g2d.setColor(corPrimaria);
        g2d.fillOval(x, y, (int) raio, (int) raio);
    }
}
