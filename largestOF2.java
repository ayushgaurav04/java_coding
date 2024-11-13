import java.util.Scanner;


public class largestOF2 {
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the first number - ");
int num1= sc.nextInt();
System.out.print("Enter the second number - ");
int num2= sc.nextInt();
// sc.close();
if(num1>num2){
    System.out.println(num1+" number is greater");
}else if(num1 == num2){
    System.out.println("Both the number are equal");
    }else{
          System.out.println(num2+" number is greater");
    }
}
}
