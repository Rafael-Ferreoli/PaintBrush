package model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.BasicStroke;

/**
 * Classe para representar um cilindro.
 */
public class Cilindro extends Ponto {

    public Color corInterna;
    public boolean showArea = false;
    public int x1;
    public int y1;
    public int espessuraLinha; // Espessura da linha

    public Cilindro() {
        this.espessuraLinha = 2; // Espessura padrão da linha
    }

    public void setEspessuraLinha(int espessuraLinha) {
        this.espessuraLinha = espessuraLinha;
    }

    @Override
    public void desenhar(Graphics g) {
        g.setColor(corInterna);

        // Defina a espessura da linha
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(espessuraLinha)); // Ajuste a espessura da linha conforme necessário

        g.drawRect(x, y, Math.abs(x1 - x), Math.abs(y1 - y));
        g.setColor(corPrimaria);
        g.fillRect(x + 1, y, Math.abs(x1 - x) - 1, Math.abs(y1 - y));

        int offsetY = Math.abs((y1 - y) / 20);
        int height = Math.abs((y1 - y) / 10);

        g.fillOval(x, y - offsetY, Math.abs(x1 - x), height);
        g.fillOval(x, y1 - offsetY, Math.abs(x1 - x), height);
        g.setColor(corInterna);
        g.drawOval(x, y - offsetY, Math.abs(x1 - x), height); // parte de cima
        g.drawOval(x, y1 - offsetY, Math.abs(x1 - x), height); // parte de baixo

        g.setColor(Color.BLACK);
        if (showArea) {
            g.drawString("Area: " + calculaArea() + " Volume: " + calculaVolume(), x - 60, y - 5);
        }
    }

    public float calculaVolume() {
        float altura = Math.abs(y1 - y) / 10;
        return (float) Math.PI * altura * altura * Math.abs(x1 - x); // V = Pi*R^2 * H
    }

    public float calculaArea() {
        float altura = Math.abs(y1 - y) / 10;
        float raio = altura;
        return (float) ((2 * Math.PI * raio * altura) + (2 * (Math.PI * raio * raio))); // 2*Pi*R*H + 2*Pi*R^2
    }
}
