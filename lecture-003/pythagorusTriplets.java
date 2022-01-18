

import java.util.Scanner;

public class pythagorusTriplets{
 
    public static boolean pytha(int a, int b, int c){
    if( (a*a == b*b + c*c) || (b*b == a*a+ c*c) || (c*c ==a *a + b*b) ) 
    return true;
    else
    return false;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt(); 
        int b = scn.nextInt(); 
        int c = scn.nextInt();

        boolean ans = pytha(a, b, c);
        System.out.println(ans);
}
}