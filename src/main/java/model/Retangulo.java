package model;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.BasicStroke;
import java.awt.Color;

/**
 * Classe para representar um retângulo.
 */
public class Retangulo extends D2 {

    public int base, largura;
    public int tamanhoPonto; // Tamanho do ponto específico para Retangulo

    public Retangulo() {
        this.tamanhoPonto = 3; // Tamanho padrão do ponto para Retangulo
    }

    public void setTamanhoPonto(int tamanhoPonto) {
        this.tamanhoPonto = tamanhoPonto;
    }

    @Override
    public float area() {
        return base * largura;
    }

    @Override
    public float perimetro() {
        return 2 * (base + largura);
    }

    @Override
    public void desenhar(Graphics g) {
        super.desenhar(g);

        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(corPrimaria);

        // Defina a espessura da linha (aumente este valor para fazer o ponto mais grosso)
        g2d.setStroke(new BasicStroke(tamanhoPonto)); // Ajuste o tamanho do ponto conforme necessário

        g2d.fillRect(x, y, base, largura);
        g2d.setColor(corInterna);
        g2d.drawRect(x, y, base, largura);
        if (showArea) {
            g.setColor(Color.BLACK);
            desenharInformacoes(g);
        }
    }

    public void desenharInformacoes(Graphics g) {
        float area = area();
        float volume = perimetro();

        // Formata os valores com uma casa decimal
        String areaFormatada = String.format("%.1f", area);
        String perimetroFormatado = String.format("%.1f", volume);

        String informacoes = "Área: " + areaFormatada + "  Perimetro: " + perimetroFormatado;

        g.drawString(informacoes,x,y);
    }

}
