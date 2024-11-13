import java.util.Scanner;

public class calculator {
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("enter the a - ");
int a = sc.nextInt();
System.out.print("enter the b - ");
int b = sc.nextInt();
System.out.print("enter the operator - ");
char operator = sc.next().charAt(0);// this .charAt(0)__> will help to take the single input of the chracter
switch (operator) {
    case '+':
        System.out.println(a+b);
        break;
    
    case '-':
        System.out.println(a-b);
        break;
    
    case '*':
        System.out.println(a*b);
        break;
    
    case '/':
        System.out.println(a/b);

    default: System.out.print("Enter the valid operator in the system ");
    }
}
}