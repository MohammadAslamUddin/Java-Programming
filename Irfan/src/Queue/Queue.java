package Queue;

public class Queue {
    static int Back = -1,
                 Front = -1;
    static int[] Array = new int[20];

    void Push(int data) {
        if (Back == 20)
            System.out.println("The Queue is OverFlow");
        else
        {
            if (Front == -1) 
            {
                Front++;              
            }
            Back++;
            Array[Back] = data;
            System.out.println("Array["+Back+"] = "+data);
        }
    }

    void Pop(int data) {
        if (Front == -1 || Front>Back) 
        {
            System.out.println("The Queue is UnderFlow");
            Front = -1;
        }
        else
        {
            System.out.println(Array[Front]+" is deleted from your list");
            Front++;
        }
    }
    
    void Display(){
        if (Front == -1) 
        {
            System.out.println("Your Link List is Empty");
        }
        else
        {
            System.out.println("Your Present Link List is:");
            for (int i = Front; i <= Back; i++) 
            {
                System.out.println("Array["+i+"] = "+Array[i]);
            }
        }
    }    
}
