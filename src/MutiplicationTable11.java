import java.util.Scanner;

public class MutiplicationTable11 {
    public static void main(String[] args)
    {
        System.out.println("Please enter an integer to print tables : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Table of " + number + " is : ");
        int a = 1;
        while(a <= 10)
        {
            System.out.printf("%d * %d = %d \n", number, a, number * a);
            a++;
        }
        sc.close();
    }
}
