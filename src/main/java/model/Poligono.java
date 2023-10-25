package model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.BasicStroke;
import java.util.ArrayList;

/**
 * Classe para representar um polígono.
 */
public class Poligono {

    private ArrayList<Integer> coordX;
    private ArrayList<Integer> coordY;
    private Color corPrimaria;
    private Color corInterna;
    public int espessuraLinha; // Espessura da linha

    public Poligono() {
        coordX = new ArrayList<>();
        coordY = new ArrayList<>();
        this.espessuraLinha = 1; // Espessura padrão da linha
    }

    public void setEspessuraLinha(int espessuraLinha) {
        this.espessuraLinha = espessuraLinha;
    }

    public void adicionarPonto(int x, int y) {
        coordX.add(x);
        coordY.add(y);
    }

    public void limparPontos() {
        coordX.clear();
        coordY.clear();
    }

    public void desenhar(Graphics c) {
        if (coordX.size() > 2) { // Verificar se há pontos suficientes para desenhar um polígono
            Graphics2D g2d = (Graphics2D) c;
            g2d.setStroke(new BasicStroke(espessuraLinha)); // Configurar a espessura da linha

            int[] vetX = new int[coordX.size()];
            int[] vetY = new int[coordY.size()];
            for (int i = 0; i < coordX.size(); i++) {
                vetX[i] = coordX.get(i);
                vetY[i] = coordY.get(i);
            }
            g2d.setColor(corInterna);
            g2d.drawPolygon(vetX, vetY, coordX.size());
            g2d.setColor(corPrimaria);
            g2d.fillPolygon(vetX, vetY, coordX.size());
        }
    }

    public void setCorPrimaria(Color corPrimaria) {
        this.corPrimaria = corPrimaria;
    }

    public void setCorInterna(Color corInterna) {
        this.corInterna = corInterna;
    }
}
