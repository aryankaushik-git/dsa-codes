import java.util.Scanner;

public class Reverse {

    public static void reverseOfaNumber(int num) {
      int lastdigit;
      while (num!=0){
          lastdigit = num % 10;
          num/=10;

          System.out.println(lastdigit);
        }      

    }

    public static void main (String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        reverseOfaNumber(n);
    }
    
}
