package Use_OF_Static.Student;

public class Student {
    
        String Name;
        int ID;
        static String UniversityName = "LU";
    
    Student(String n,int I){
        Name = n;
        ID = I;
    }
    
    void display(){
        System.out.println("Name = "+Name);
        System.out.println("ID = "+ID);
        System.out.println("University Name = "+UniversityName);
        System.out.println();
    }
}
