/*

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graphics;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Elisa Bothy
 */
public class Graphism extends JFrame {

    Display north;
    ButtonCalc east;
    ButtonsNumber west;

    private static final long serialVersionUID = 1L;

    public Graphism() {
        super("Ma calculatrice");

        north = new Display();
        east = new ButtonCalc();
        west = new ButtonsNumber();

        initGui();
        initEvents();
        
        //empêche d'agrandir la fenêtre
        this.setResizable(false);
        //laisser la fenêtre s'autodimentionner par rapport au contenu
        this.pack();
        //centrer fenêtre
        this.setLocationRelativeTo(null);

        //fermer la fenêtre quand on ferme avec la croix
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }

    private void initGui() { 
        this.getContentPane().setLayout(new BorderLayout(2, 3));
        this.getContentPane().add(north, BorderLayout.NORTH);
        this.getContentPane().add(east, BorderLayout.CENTER);
        this.getContentPane().add(west, BorderLayout.WEST);
    }

    private void initEvents() {
        for (JButton jb : west.getButtons()){
            jb.addActionListener((ActionEvent ae) -> {
                if(!(jb.getText().equals("=") )){
                    if((north.getJl().getText().equals("0") && (!jb.getText().equals(".")))){
                        north.getJl().setText(jb.getText());
                    }
                    else{
                        if((!(north.getJl().getText().contains(".") && jb.getText().equals(".")))){
                        north.getJl().setText(north.getJl().getText()+jb.getText());}
                    }
                    
                }else{
                    JOptionPane.showMessageDialog(
                        null, 
                        "Je ne sais pas encore faire de calcul..." , 
                        "Oups", 
                        JOptionPane.ERROR_MESSAGE
                    );
                }
                
            });
            
        }
        for (JButton jb : east.getButtons()){
            jb.addActionListener((ActionEvent ae) -> {
                if(jb.getText().equals("C")||jb.getText().equals("CE")){
                    north.getJl().setText("");
                }
                
            });
            
        }
    }
}
