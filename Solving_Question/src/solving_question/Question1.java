package solving_question;

public class Question1 {
    
    double height,
                width,
                depth;
    
    Question1(double h,double w,double d){
       height = h;
       width = w;
       depth = d;
    }
    
    void displayvol(){
        double vol = height*width*depth;
        System.out.println("Volume is = "+vol);
    }
}
