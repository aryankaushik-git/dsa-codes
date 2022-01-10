// Sum of Two Numbers using Functions
import java.util.Scanner;

public class sumOftwoNos {


    public static Scanner scn = new Scanner(System.in);

    public static int sumofTwoNos() {
        int a= scn.nextInt();
        int b= scn.nextInt();

        return (a+b);
    }

    public static void main(String[] args) {
        int ans = sumofTwoNos();

        System.out.println(ans);

    }


}
    

