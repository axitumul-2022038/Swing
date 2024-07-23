/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.axelxitumul.vista;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
/**
 *
 * @author Axel
 */
public class Ventana04 extends JFrame {
    public Ventana04() {
        setTitle("Axel Xitumul");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = getContentPane();
        GridLayout grid = new GridLayout(4, 3);
        grid.setHgap(5);
        grid.setVgap(5);
        container.setLayout(grid);
        for (int i = 1; i <= 9; i++) {
            container.add(new JButton(String.valueOf(i)));
        }
        container.add(new JButton("*"));
        container.add(new JButton("0"));
        container.add(new JButton("#"));
    }
}
