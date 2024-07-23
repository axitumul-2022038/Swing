/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.axelxitumul.vista;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Axel
 */
    public class Ventana08 extends JFrame {

        public Ventana08() { 
            setTitle("Axel Xitumul");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(400, 400);
            Container container = getContentPane();
            container.add(new PanelSol());
        }
    }

class PanelSol extends JPanel {

    public void paintComponent(Graphics grafico) {
        grafico.setColor(Color.ORANGE);
        grafico.fillOval(100, 100, 200, 200);
        for (double d = 0; d < 2 * Math.PI; d += 0.1) {
            int xEnd = (int) (200 + 150 * Math.cos(d));
            int yEnd = (int) (200 + 150 * Math.sin(d));
            grafico.drawLine(200, 200, xEnd, yEnd);
        }
        grafico.setColor(Color.BLACK);
        grafico.drawArc(150, 150, 100, 100, 230, 80);
        grafico.fillOval(150, 150, 20, 20);
        grafico.fillOval(230, 150, 20, 20);
    }
}