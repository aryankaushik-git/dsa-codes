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

    public static int countDigit(int num){ //when we pass some input then it returns some output
         int count=0;
        while(num != 0) //Till the no. does not becomes 0    
        {
            num/=10;
            count++;
        }
        return count;
    }

public static int invers(int num){
int totaldigit = countDigit(num);
int lastindex = totaldigit, result= 0;
while(num!=0){
    int lastdigit = num%10;
    num /= 10;
    result += lastindex * (int)Math.pow(10, totaldigit -lastdigit);
    lastindex--; 
}
return result;
}


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(invers(n)); 
    }
}
