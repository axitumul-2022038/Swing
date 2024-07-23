/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.axelxitumul.vista;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Axel
 */
public class Ventana06 extends JFrame{
    public interface ActionListener {
 void actionPerformed(ActionEvent e);
}
    public Ventana06() {
        super("Axel Xitumul");
        setSize(400,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        JButton boton = new JButton("¡Púlsame!");
        boton.addActionListener(new EventoBotonPulsado());
        container.add(boton);
    }
}
class EventoBotonPulsado implements ActionListener {
  public void actionPerformed(ActionEvent e) {
      JButton boton = (JButton) e.getSource();  
      boton.setText("¡Gracias!");
 }
}
