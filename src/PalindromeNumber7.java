import java.util.Scanner;

public class PalindromeNumber7 {
    public static void main(String[] args) {
        {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter the number: ");

            int n = in.nextInt();
            int sum = 0, r;
            int temp = n;
            while(n>0)
            {
                r = n % 10;
                sum = (sum*10)+r;
                n = n/10;
            }
            if(temp==sum)
                System.out.println("It is a Palindrome number.");
            else
                System.out.println("It is Not a palindrome");
        }
    }
    }



