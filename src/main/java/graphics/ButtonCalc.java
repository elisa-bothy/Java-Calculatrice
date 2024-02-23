/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graphics;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Elisa Bothy
 */
public class ButtonCalc extends JPanel {

    private static final long serialVersionUID = 1L;
    private String messageButton[] = {
        "CE", "C", "+", 
        "-", "x", "/"
    };
    private ArrayList<JButton> buttons;

    /**
     * @return the messageButton
     */
    public String[] getMessageButton() {
        return messageButton;
    }

    /**
     * @param messageButton the messageButton to set
     */
    public void setMessageButton(String[] messageButton) {
        this.messageButton = messageButton;
    }

    

    public ArrayList<JButton> getButtons() {
        return buttons;
    }

    public void setButtons(ArrayList<JButton> buttons) {
        this.buttons = buttons;
    }

    public ButtonCalc() {
        
        this.buttons = new ArrayList<>();
        assign();
    }

    private void assign() {
        this.setLayout(new GridLayout(3, 3, 2, 2));
        for (String s : getMessageButton()) {
            JButton jb = new JButton(s);
            jb.setBackground(new Color(255, 255, 191));
            jb.setFont(new Font("Bold", Font.BOLD, 30));
            jb.setPreferredSize(new Dimension(150, 100));
            getButtons().add(jb);
            this.add(jb);        
        }
        getButtons().get(0).setForeground(Color.red);
    }
}
