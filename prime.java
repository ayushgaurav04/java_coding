import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check: ");
        int n = sc.nextInt();

        if (n == 2) {
            System.out.println("The given number is a prime number.");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= n / 2; i++) {//i<=Math.squrt(n);
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime== true) {
                System.out.println("The given number is a prime number.");
            } else {
                System.out.println("The given number is not a prime number.");
            }
        }
        
        sc.close(); // closed the scanner
    }
}
