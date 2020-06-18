import java.util.Scanner;

public class RightangleTriangle14 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter the number of row");
          int rows = scanner.nextInt();

            for(int i = 1; i <= rows; ++i) {

                for(int j = 1; j <= i; ++j)
                {
                    System.out.print("@");
                }

                System.out.println();
            }
        }
}