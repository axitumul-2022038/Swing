/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.axelxitumul.vista;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 *
 * @author Axel
 */
public class Ventana05 extends JFrame {

    public Ventana05() {
        setTitle("Axel Xitumul");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,300);
        // Panel de fecha
        JPanel fechaDePanel = new JPanel();
        fechaDePanel.setLayout(new FlowLayout());
        fechaDePanel.add(new JTextField(2));
        fechaDePanel.add(new JLabel("/"));
        fechaDePanel.add(new JTextField(2));
        fechaDePanel.add(new JLabel("/"));
        fechaDePanel.add(new JTextField(2));
        // Panel de datos
        JPanel datosDePanel = new JPanel();
        GridLayout grid = new GridLayout(3, 2, 0, 5);
        datosDePanel.setLayout(grid);
        datosDePanel.add(new JLabel("Nombre:"));
        datosDePanel.add(new JTextField(10));
        datosDePanel.add(new JLabel("DNI:"));
        datosDePanel.add(new JTextField(10));
        datosDePanel.add(new JLabel("Fecha de nacimiento: "));
        datosDePanel.add(fechaDePanel);
        // Panel de botones
        JPanel botonesDelPanel = new JPanel();
        botonesDelPanel.setLayout(new FlowLayout());
        botonesDelPanel.add(new JButton("Aceptar"));
        botonesDelPanel.add(new JButton("Cancelar"));

        Container cp = getContentPane();
        cp.add(datosDePanel, BorderLayout.CENTER);
        cp.add(botonesDelPanel, BorderLayout.SOUTH);
    }
}