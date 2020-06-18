import java.util.Scanner;

public class Reverse4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter the Number");
        int n = sc.nextInt();

        int num = n, rem, rev = 0;
        while (num != 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        System.out.println("Reverse Number is: " +rev);

    }
}
