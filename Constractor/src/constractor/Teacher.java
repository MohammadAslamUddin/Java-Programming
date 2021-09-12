package constractor;
public class Teacher {
    String Name,
            Gender;
    int Phone;
    
    Teacher(String n, String m, int ph){
        Name = n;
        Gender = m;
        Phone = ph;
    }
    
    void display(){
        System.out.println("Name = "+Name);
        System.out.println("Gender = "+Gender);
        System.out.println("Phone = "+Phone);
    }
    
}
