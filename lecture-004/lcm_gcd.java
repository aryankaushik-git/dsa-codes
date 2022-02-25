import java.util.Scanner;
//Lcm & GCD
public class lcm_gcd {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        scn.close();
        gcd_lcm(num1, num2);
        
        
    }

        public static void gcd_lcm(int n1, int n2){
        int on1 = n1;
        int on2 = n2;

        while(n1%n2 != 0){
            int re =n1%n2;
            n1 =n2;
            n2 =re;
        }


        int lc = (on1 * on2) / n2 ;


        System.out.println("GCD is " + n2);
        System.out.println("lcm is " + lc);
    }


        
    }

