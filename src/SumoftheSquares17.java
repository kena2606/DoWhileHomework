import java.util.Scanner;

public class SumoftheSquares17 {

    public static void main(String[] args) {
//1*1 + 2*2+3*3+.....+100*100 The Sum of Square the natural numbers are
//(1+2+....+100)2 The Square of the sum of the natural numbers are
        int i;
        int sum1=0;
        int sum2=0;
        for (i=1;i<=100;i++){
          sum1 += (i*i);
          sum2 += i;
        }
        System.out.println("Answer is: " + (sum2*sum2-sum1));
    }
}
