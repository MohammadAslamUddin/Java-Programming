package abox;

import javax.swing.JOptionPane;

public class ABox {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What is your name?");
        String borboti = String.format("Fuck you %s witch!\nYou magi,\nYou Cudani,\nBaaal", name);
        for(int i = 1;i<=20;i++){
        JOptionPane.showMessageDialog(null, borboti);    
        }       
               
    }
}    
