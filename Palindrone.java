import java.util.Scanner;

/**
 * Created by kim on 6/18/2015.
 */
public class Palindrone {
    public static void main(String args[])
    {
        String input, reverse = "";
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a string to check if it is a palindrome:  ");
        input = in.nextLine();

        int length = input.length();

        for ( int i = length - 1; i >= 0; i-- )
            reverse = reverse + input.charAt(i);

        if (input.equals(reverse))
            System.out.println(input + " is the string you entered and it is a palindrome.");
        else
            System.out.println(input + " is the string you entered and it is not a palindrome.");


    }
}
