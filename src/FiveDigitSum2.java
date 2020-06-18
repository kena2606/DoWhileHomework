import java.util.Scanner;

public class FiveDigitSum2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int m, n, sum = 0;
        System.out.print("Enter the number:");
        m = scanner.nextInt();
        while(m > 0)
        {
            n = m % 10;
            sum = sum + n;
            m = m / 10;
        }
        System.out.println("Sum of Digits:"+sum);
    }
    }



