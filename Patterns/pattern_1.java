
import java.util.Scanner;
//Pattern 1

public class pattern_1 {
    public static void pattern(int n){
        int nsp = n-1;
        int nst = 1;
        for( int i  = 1; i<= n; i++)
        {
            for(int csp= 1; csp<=nsp; csp++ )
            System.out.print("\t");
    
            for (int cst = 1; cst<=nst; cst ++)
            System.out.print("*\t");
    
            nsp--;
            nst++;
        
            System.out.println();
        }
        }
    
      public static void main (String[] args){
          Scanner scn = new Scanner(System.in);
          int n = scn.nextInt();
    
          pattern(n);
      }
}

