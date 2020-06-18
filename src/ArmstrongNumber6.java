import java.util.Scanner;

public class ArmstrongNumber6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number");
        int number = scanner.nextInt();
        int num = 153;
        int temp = num;
        int r, sum = 0;

        while (number > 0) {
            r = number % 10;
            number = number / 10;
            sum = sum + r * r * r;

        }
        if (temp == sum)
            System.out.println("Its an Armstrong number");
        else {
            System.out.println("Its not an Armstrong Number");

        }
    }
}