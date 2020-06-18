import java.util.Scanner;

public class FirstAndLastDigitSum5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Number");

        int number = scanner.nextInt();
        // Last digit we use % operator
        int lastdigit = number % 10;

        int firstdigit = number;
        while (firstdigit >= 10){
            firstdigit=firstdigit/10;
        }
        System.out.println("First digit=" +firstdigit);
        System.out.println("Last digit=" +lastdigit);
        System.out.println("Sum="+(firstdigit+lastdigit) );
}
}