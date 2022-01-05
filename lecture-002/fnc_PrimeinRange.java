import java.util.Scanner;

public class fnc_PrimeinRange {
    
    public static Scanner scn = new Scanner(System.in);

    public static boolean isPrime(int num) {
        for (int i = 2; i * i <= num; i++) {
            if ((num % i) == 0)
                return false;
        }
        return true;
    }

        public static void rangeOfPrimeNos ( int a, int b){
        for (int num = a; num<= b; num++) {
            if (isPrime(num)) {
                System.out.println(num);
            }
        }

    }

        public static void main (String[]args){

        int x = scn.nextInt();
        int y = scn.nextInt();

        rangeOfPrimeNos(x, y);
    }
    
}
