import java.util.Scanner;

public class lcm_gcd {
    

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        scn.close();
        
        int gcd = 0, lcm, count = 1, small;
        small = (num1 < num2) ? num1 : num2;

        while (count <= small) {
            if (num1 % count == 0 && num2 % count == 0) {
                gcd = count;
            }
            count++;
        }

        lcm = (num1 * num2) / gcd;

        System.out.println(gcd);
        System.out.println(lcm);
    }
}

