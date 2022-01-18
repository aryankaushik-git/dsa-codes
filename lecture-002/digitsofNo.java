import java.util.Scanner;

public class digitsofNo {

    public static int countDigit(int num){
        int count=0;
        while(num != 0) //Till the no. does not becomes 0    
        {
            num/=10;
            count++;
        }
        return count;
    }

    public static void digits(int num){
     int len = countDigit(num) - 1; //here we take length -1

     while (len >=0){
         int digit = num / (int)Math.pow(10,len);
        num = num % (int)Math.pow(10,len);
        System.out.println(digit);
        len--;
     }

     }

     public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
         int n= scn.nextInt();
         digits(n);

     }
    }

