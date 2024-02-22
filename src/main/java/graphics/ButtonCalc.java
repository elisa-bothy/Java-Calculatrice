/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graphics;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Elisa Bothy
 */
public class ButtonCalc {
    JButton jb1;
    JButton jb2;
    JButton jb3;
    JButton jb4;
    JButton jb5;
    JButton jb6; 
    JPanel east;
    public ButtonCalc(){
        jb1 = new JButton("CE");
        jb2 = new JButton("C");
        jb3 = new JButton("+");
        jb4 = new JButton("-");
        jb5 = new JButton("x");
        jb6 = new JButton("/");
        east = new JPanel();
        
        assign();
    }

    private void assign() {
        east.setLayout(new GridLayout(3,3));
        jb1.setBackground(Color.YELLOW);
        jb2.setBackground(Color.YELLOW);
        jb3.setBackground(Color.YELLOW);
        jb4.setBackground(Color.YELLOW);
        jb5.setBackground(Color.YELLOW);
        jb6.setBackground(Color.YELLOW);
        east.add(jb1);
        east.add(jb2);
        east.add(jb3);
        east.add(jb4);
        east.add(jb5);
        east.add(jb6);
    }
}
