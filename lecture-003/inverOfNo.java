import java.util.Scanner;

//No   =    2 3 5 6 4 1
//Index=    1 2 3 4 5 6
//        AFTER INVERSE
//No   =   6 1 2 5 3 4
//Index=   1 2 3 4 5 6

public class inverOfNo {

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
