
public class Loops {
    public static void main(String[] args) {
        // to print number from 1 to 10 in increasing order
        for (int num = 1; num <= 10; num++) {
        System.out.println(num);
        }
        
       
        //to print number from 10 to 1 in decreasing order
        for (int num = 10; num >= 1; num--) {
        System.out.println(num);
        }

       // to print table
        int tableNumber = 13;
        for (int num = 1; num <= 10; num++) {
        System.out.println(tableNumber + " X " + num + " = " + tableNumber * num);
        }
       
    }
}
