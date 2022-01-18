import java.util.Scanner;

public class reverseOfNo2 {
    
    public static void reverseNo(int num){
        while(num!=0){
            int lastdigit = (num%10);
            num/=10;
        System.out.print(lastdigit);
        }

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        reverseNo(n);
    }
}
