package dost;

import javax.swing.JOptionPane; 

public class Dost_Box {
    public static void main(String[] args) {
        
        String n = String.format("You have to answer with Irfan \nor Pushpita \nor Sraboni \nor Sushmita \nor Saima \nor Habib!");
        JOptionPane.showMessageDialog(null,n);
        
        String name = JOptionPane.showInputDialog("What is your name? Sir!");
        
        String i = "Irfan",
                j = "Pushpita",
                k = "Sraboni",
                l = "Sushmita",
                m = "Saima",
                o = "Habib";
        
        
        if (name.equalsIgnoreCase(i)) {
            String message = String.format("Crush_khor\nBojjat pola\nNojor kharap");
            JOptionPane.showMessageDialog(null, message);
        }
        else if (name.equalsIgnoreCase(j)) {
            String message = String.format("Fakibaj No 1\nBaas baganer Malik\nkhadok");
            JOptionPane.showMessageDialog(null, message);
        }
        else if (name.equalsIgnoreCase(k)) {
            String message = String.format("Drama Queen\n\tkhadok number 1\n\t\t Dhongi");
            JOptionPane.showMessageDialog(null, message);
        }
        else if (name.equalsIgnoreCase(l)) {
            String message = String.format("Battery\n\tKotha bolta thot kape\n\t\t Dorailla vut");
            JOptionPane.showMessageDialog(null, message);
        }
        else if (name.equalsIgnoreCase(m)) {
            String message = String.format("Lamboni\n\tMost Confused Person\nVai tora ki bolos buji na kano?");
            JOptionPane.showMessageDialog(null, message);
        }
        else if (name.equalsIgnoreCase(o)) {
            String message = String.format("Cikna\nFucker Boy\nDipzol\nPut koira dimo!");
            JOptionPane.showMessageDialog(null, message);
        }
        else 
            JOptionPane.showMessageDialog(null, "Who the fuck are you? \nBitch");
    }   
}