/*

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graphics;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Elisa Bothy
 */
public class Graphism extends JFrame {
    Calc north;
    ButtonCalc east;
    ButtonsNumber west;

    private static final long serialVersionUID = 1L;
    public Graphism(){
        super("Ma calculatrice");
        
        north = new Calc();
        east = new ButtonCalc();
        west = new ButtonsNumber();
        
        assign();
        
        //laisser la fenêtre s'autodimentionner par rapport au contenu
        this.pack();
        //centrer fenêtre
        this.setLocationRelativeTo(null);
        
        //fermer la fenêtre quand on ferme avec la croix
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }

    private void assign() {
        this.getContentPane().add(north.north, BorderLayout.NORTH);
        this.getContentPane().add(east.east, BorderLayout.CENTER);
        this.getContentPane().add(west.west, BorderLayout.WEST);
    }
}