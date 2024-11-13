import java.util.Scanner;


public class  imcomeTax {
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter Your Anuual Income - ");
int income= sc.nextInt();
// sc.close();
if(income<500000){
    System.out.println("You have to give the 0% tax");
}else if(income==500000 && income<=100000){
    System.out.println("You have to give 20% tax");
    }else if(income>1000000){
          System.out.println("You have to give 30% tax");
          }
          
    }
}

