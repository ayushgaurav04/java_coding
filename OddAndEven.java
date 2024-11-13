import java.util.*;
public class OddAndEven{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number - ");
        int num1= sc.nextInt();
sc.close();
if (num1%2==0){
System.out.print("Number is the even number ");
}
else {
    System.out.print("Number is the odd number ");
}    
}
}