import java.util.Scanner;

public class TriangleOfNumber18 {

    public static void main(String args[])
    {
        int rows, number = 1, j;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows for floyd's triangle:");
        rows = scanner.nextInt();
        System.out.println("Floyd's triangle");
        System.out.println("****************");
        for ( int i = 1 ; i <= rows ; i++ )
        {
            for ( j = 1 ; j <= i ; j++ )
            {
                System.out.print(number+" ");
                //Incrementing the number value
                number++;
            }
            System.out.println();
        }
    }
}

