/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graphics;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Elisa Bothy
 */
public class Display extends JPanel {
    
    private static final long serialVersionUID = 1L;
    private JLabel jl;
    private JPanel north;

    /**
     * @return the jl
     */
    public JLabel getJl() {
        return jl;
    }

    /**
     * @param jl the jl to set
     */
    public void setJl(JLabel jl) {
        this.jl = jl;
    }

    /**
     * @return the north
     */
    public JPanel getNorth() {
        return north;
    }

    /**
     * @param north the north to set
     */
    public void setNorth(JPanel north) {
        this.north = north;
    }

    

    public Display() {
        jl = new JLabel("");

        assign();
    }

    private void assign() {
        getJl().setHorizontalAlignment(JLabel.RIGHT);
        getJl().setFont(new Font("Bold", Font.BOLD, 30));
        getJl().setPreferredSize(new Dimension(600, 75));
        this.add(getJl());
        this.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.black, 3),
                BorderFactory.createEmptyBorder(3, 3, 3, 3)));
    }
}
