import java.util.Scanner;

public class countDigits {
    public static int countDigit(int num){ //when we pass some input then it returns some output
        int count=0;
        while(num != 0) //Till the no. does not becomes 0    
        {
            num/=10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();

        int b= countDigit(a);
        System.out.println(b);

    }
    
}
