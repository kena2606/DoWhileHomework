import java.util.Scanner;

public class Vowel19 {
    public static void main(String[] args) {
        int vowels =0, digits = 0;
        String line = "testing12367 ";

        line = line.toLowerCase();
        for(int i = 0; i < line.length(); ++i)
        {
            char ch = line.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u')
            {
                ++vowels;
            }
            else if( ch >= '0' && ch <= '9')
            {
                ++digits;
            }
        }

        System.out.println("No of Vowels: " + vowels);

        System.out.println("No of Digits: " + digits);

    }
}
