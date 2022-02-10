import java.util.Scanner;

public class template {
//nsp = no. of space , nst= no. of stars
// csp = count of space, cst = count of stars
    public static void pattern(int n){
    int nsp = n;
    int nst = n;
    for( int i  = 1; i<= n; i++)
    {
        for(int csp= 1; csp<=nsp; csp++ )
        System.out.print("\t");

        for (int cst = 1; cst<=nst; cst ++)
        System.out.print("*\t");

        nsp +=0;
        nst +=0;
    
        System.out.println();
    }

   

    }

  public static void main (String[] args){
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();

      pattern(n);
  }

}
