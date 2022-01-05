import java.util.Scanner;

public class Prime {

     public static void main(String[] args) {
        

    Scanner scn = new Scanner(System.in);
    boolean isPrime = true;
    int num = scn.nextInt();
    for (int i = 2; i < num; i++) {
        if (num % i == 0) {
            isPrime = false;
            break;
        }
    }

   if(isPrime){
       System.out.println(num + " is prime");
   }else{
       System.out.println(num + " is not prime");
   }
 } 
}
