/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.axelxitumul.vista;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author Diego
 */
public class Ventana01 extends JFrame {
    public  Ventana01() {
        Dimension tamanioPantalla = new Dimension();
        tamanioPantalla = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(400,300);
        //miVentana.setSize(tamanioPantalla.width, tamanioPantalla.height);        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        setLocationRelativeTo(null);//para centrar
        setTitle("Axel Xitumul");
    }
}
