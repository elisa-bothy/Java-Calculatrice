/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graphics;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author Elisa Bothy
 */
public class Calc{

    JLabel jl;
    JPanel north;
    Border blackline;
    public Calc(){
        jl = new JLabel("0");
        north = new JPanel();
        
        assign();
    }

    private void assign() {
        jl.setBackground(Color.GRAY);
        north.add(jl);
        blackline = BorderFactory.createLineBorder(Color.black, 2);
        north.setBorder(blackline);
    }
}
