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

    public ButtonsNumber() {
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
        west.setLayout(new GridLayout(4, 3));
        JButton[] buttons = {jb1, jb2, jb3, jb4, jb5, jb6, jb7, jb8, jb9, jb10, jb11, jb12};
        for (JButton button : buttons) {
            button.setBackground(Color.LIGHT_GRAY);
            button.setFont(new Font("Bold", Font.BOLD, 30));
            button.setPreferredSize(new Dimension(100, 75));
            west.add(button);
        }
    }
}
