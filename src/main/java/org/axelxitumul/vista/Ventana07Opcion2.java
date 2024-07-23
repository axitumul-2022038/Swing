/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.axelxitumul.vista;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Axel
 */
public class Ventana07Opcion2 extends JFrame {

    private final JTextField cuadroTexto;

    class EventoSaludo implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "¡Hola, "
                    + cuadroTexto.getText() + "!");
        }
    }

    public Ventana07Opcion2() {
        
        super("Axel Xitumul");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        Container container = getContentPane();
        container.add(new JLabel("Nombre :"));
        JTextField texto = new JTextField(20);
        cuadroTexto = new JTextField(20);
        container.add(cuadroTexto);
        JButton botonSaludo = new JButton("Saludar");
        container.add(botonSaludo);
        botonSaludo.addActionListener(new EventoSaludo());

    }

}