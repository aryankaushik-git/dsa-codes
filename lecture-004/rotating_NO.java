import java.util.Scanner;

public class rotating_NO{

    public static void main(String[] args){
    
        Scanner scn = new Scanner(System.in);
        int a= scn.nextInt();
        int b= scn.nextInt();

        int c = reverse(a, b);
        System.out.println(c);
    }

    public static int length(int num) {
        int count =0;    
        while(num!=0)
        {
           num /=10;
           count++;
        }
        return count;

    }

    public static int reverse(int num, int r){
    int len= length(num);

    int num1 = (num / (int)Math.pow(10, r) );
    int num2 = (num % (int)Math.pow(10, r) );

    int rev = (num2 * (int)Math.pow(10,len-r) + num1 );

    return rev;

    }
    
}