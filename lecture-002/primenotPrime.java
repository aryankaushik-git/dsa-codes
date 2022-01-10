import java.util.Scanner;

public class primenotPrime {

    public static Scanner scn = new Scanner(System.in);

    public static boolean isPrime(int num) {
        for (int i = 2; i * i <= num; i++) {
            if ((num % i) == 0)
                return false;
        }
        return true;
    }
        public static void main(String[] args){
                if (isPrime(scn.nextInt())) {
                    System.out.println("prime");

                } else {
                    System.out.println("not prime");
                }



        }
    
}
