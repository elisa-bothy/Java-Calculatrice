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
public class ButtonsNumber {

    JButton jb1;
    JButton jb2;
    JButton jb3;
    JButton jb4;
    JButton jb5;
    JButton jb6;
    JButton jb7;
    JButton jb8;
    JButton jb9;
    JButton jb10;  
    JButton jb11;
    JButton jb12; 
    JPanel west;
    public ButtonsNumber(){
        jb1 = new JButton("7");
        jb2 = new JButton("8");
        jb3 = new JButton("9");
        jb4 = new JButton("4");
        jb5 = new JButton("5");
        jb6 = new JButton("6");
        jb7 = new JButton("1");
        jb8 = new JButton("2");
        jb9 = new JButton("3");
        jb10 = new JButton("0");
        jb11 = new JButton(".");
        jb12 = new JButton("=");
        west = new JPanel();
        
        assign();
        
        
        
        
    }

    private void assign() {
        west.setLayout(new GridLayout(3,4));
        jb1.setBackground(Color.GRAY);
        jb2.setBackground(Color.GRAY);
        jb3.setBackground(Color.GRAY);
        jb4.setBackground(Color.GRAY);
        jb5.setBackground(Color.GRAY);
        jb6.setBackground(Color.GRAY);
        jb7.setBackground(Color.GRAY);
        jb8.setBackground(Color.GRAY);
        jb9.setBackground(Color.GRAY);
        jb10.setBackground(Color.GRAY);
        jb11.setBackground(Color.GRAY);
        jb12.setBackground(Color.GRAY);
        west.add(jb1);
        west.add(jb2);
        west.add(jb3);
        west.add(jb4);
        west.add(jb5);
        west.add(jb6);
        west.add(jb7);
        west.add(jb8);
        west.add(jb9);
        west.add(jb10);
        west.add(jb11);
        west.add(jb12);
    }
}

