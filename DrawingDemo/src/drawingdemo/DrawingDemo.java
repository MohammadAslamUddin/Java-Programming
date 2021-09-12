package drawingdemo;
    
import javax.swing.JFrame;

public class DrawingDemo {

    public static void main(String[] args) {
        Drawing draw = new Drawing();
        
        JFrame app = new JFrame();
        
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        app.add(draw);
        
        app.setSize(300,300);
        
        app.setVisible(true);
                
    }
    
}
