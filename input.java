// in this we are going to see about input from ther user in the java
import java.util.*;
public class input{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // String input =sc.next();// sapce print nahi karega                                                                                                           
        String input = sc.nextLine();// sapce ke sath print kar dega
        System.out.println(input);
    }
}
/* notes
(sc.next)--> me hum spaces ko print nahi karwa shakte agar hum input me suppose ki ayuh gaurav enter kare toh keval ayush hi output ayega 

spaces ke liye hum sc.nextline()--> use karenge agar hum nextline use karenge toh ayush gaurav space ke sath prin hokar ayega









*/