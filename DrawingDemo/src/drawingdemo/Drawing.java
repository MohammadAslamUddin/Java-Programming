package drawingdemo;

import java.awt.Graphics;
import javax.swing.JPanel;

public class Drawing extends JPanel{
    public void paint(Graphics g){
        
        super.paint(g);
        
        int weight = getWidth(),
                height = getHeight();
        
        //All the line for the box
        g.drawLine(20,20,270,20);
        g.drawLine(20,70,270,70);
        g.drawLine(20, 20, 20, 70);
        g.drawLine(270, 20, 270, 70);
        
        
    }
}
