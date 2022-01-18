import java.util.Scanner;

public class reverseOfNo {

    public static int reverseOfaNumber(int num){
        int ans = 0;
        while(num !=0)
        {
            int digit = num%10;  //digits = quotient
            num /= 10;   // removing last no.
            ans = ans * 10 + digit; // reversing the number
        }
        return ans;
    }

    public static void main (String[] args){
        Scanner scn = new Scanner(System.in);

        int a = scn.nextInt();

        int ans = reverseOfaNumber(a);

        System.out.println(ans);
    }
    
}
