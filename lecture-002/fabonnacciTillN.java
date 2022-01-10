// 1. You've to print first n fibonacci numbers.
// 2. Take as input "n", the count of fibonacci numbers to print.
// 3. Print first n fibonacci numbers.
import java.util.Scanner;

public class fabonnacciTillN {


public static void fibo(int num) {
    int a=0,b=1;

    for(int i=0; i < num; i++)
    {
        System.out.println(a);
        int c=a+b;
        a=b;
        b=c;
        
    }
    
}

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
    fibo(num);


}
    
}
