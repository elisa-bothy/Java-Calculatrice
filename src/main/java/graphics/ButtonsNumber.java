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
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Elisa Bothy
 */
public class ButtonsNumber extends JPanel{

    private String messageButton[] = {
        "7", "8", "9", 
        "4", "5", "6", 
        "1", "2", "3", 
        "0", ".", "="
    };
    private ArrayList<JButton> buttons;
    private static final long serialVersionUID = 1L;
    
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

    /**
     * @return the buttons
     */
    public ArrayList<JButton> getButtons() {
        return buttons;
    }

    /**
     * @param buttons the buttons to set
     */
    public void setButtons(ArrayList<JButton> buttons) {
        this.buttons = buttons;
    }

   
    public ButtonsNumber() {
        this.buttons = new ArrayList<>();
        assign();

    }

    private void assign() {
        this.setLayout(new GridLayout(4, 3, 2, 2));
        for (String s : getMessageButton()) {
            JButton jb = new JButton(s);
            jb.addActionListener((ActionEvent ae) -> {
                System.out.println(s);
            });
            jb.setBackground(Color.LIGHT_GRAY);
            jb.setFont(new Font("Bold", Font.BOLD, 30));
            jb.setPreferredSize(new Dimension(100, 75));
            getButtons().add(jb);
            this.add(jb);
        }
    }
}
