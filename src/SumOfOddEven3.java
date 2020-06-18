import java.util.Scanner;

public class SumOfOddEven3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the number");
       int n= sc.nextInt();
        int evencount = 0, oddcount = 0,sum=0;

        while (n > 0) {
            int rem = n % 10;
            if (rem % 2 == 0)
                evencount++;
            else
                oddcount++;
            n = n / 10;
        }

        System.out.println("Even count : " + evencount);
        System.out.println("Odd count : " +  oddcount);
    }
    }

