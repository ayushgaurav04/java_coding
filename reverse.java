 // this is tto print the reverse of the number in the java 
 public class reverse{
    public static void main (String args[]){
        int n = 10899;
        
       while(n>0){
         int lastDigit = n%10;
         System.out.print(lastDigit + "");
        n = n/10; //ToSmallThenum
       }
        
    }
 }

 // to caculate the reverse of the given number in the java reverse= (reverse*10)+the digit at the 1 place  in the number system