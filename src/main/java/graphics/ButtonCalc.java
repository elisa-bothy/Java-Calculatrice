/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graphics;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
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
        JButton[] buttons = {jb1, jb2, jb3, jb4, jb5, jb6};
        jb1.setForeground(Color.red);
        for (JButton button : buttons) {
            button.setBackground(new Color(255, 255, 191));
            button.setFont(new Font("Bold", Font.BOLD, 30));
            button.setPreferredSize(new Dimension(150, 100));
            east.add(button);
        }
    }
}
