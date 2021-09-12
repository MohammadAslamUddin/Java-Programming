package string_method;

public class String_method {

    public static void main(String[] args) {

        String name = "Aslam Uddin";
        String name1= " Dabit";
        
        System.out.println(name.length());//to know string length
        
        System.out.println(name+" Dabit");//string add function

        System.out.println(name.toUpperCase());//all string uppercase

        System.out.println(name.toLowerCase());//lower case

        if (name.startsWith("Aslam")) //searching starts function
        {
            System.out.println("Mohammad "+ name);
        }

        if (name.equalsIgnoreCase(name1))//equal or not case ignore 
        {
            System.out.println("Dabit");
        }
        System.out.println(name.concat(name1));//concat for add string
        
        System.out.println(name.charAt(3));//position ar value 
        
        System.out.println(name.replace(' ', '_'));//replace a value to another
        
        System.out.println(name.substring(3));//to show the value after position 3
        
        System.out.println(name.substring(2, 7));//to show the value from position 2 to 7
        
        System.out.println(name.trim());//to remove white space from befor or after the string       
    } 
}