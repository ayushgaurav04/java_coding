import java.util.*;
// public class circle{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the Radius of the circle");
//         int r = sc.nextInt();
//         double area = 3.14*r*r;
//         System.out.println("The area of the circle is "+area);

//     } // THIS IS MY CODE 
// }
public class circle{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the Radius of the circle");
        float r = sc.nextInt();
        float area = 3.14f*r*r;
        System.out.println("The area of the circle is "+area);

    }
}

/*
notes--> kisi bhi float value ke andar hum double value ko nahi rakh shakte hai matlab agra ralhna ho to hum double value ke age f likh kar kar shakte hai ab koi error nahi aa ayega 
FOR EXAMPLE--> float area = 3.14f*r*r;(SEE THE ABOVE CODDE);




*/