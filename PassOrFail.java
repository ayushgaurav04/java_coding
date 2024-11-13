import java.util.Scanner;
public class PassOrFail{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();
        String check = (marks>=33)? "Pass" : "Fail";
        System.out.println("You are " +check);
    }
}