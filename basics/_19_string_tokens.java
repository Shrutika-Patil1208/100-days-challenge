// import java.io.*;
import java.util.*;
public class _19_string_tokens {



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
                s = s.trim();

        // If string is empty
        if (s.length() == 0) {
            System.out.println(0);
            return;
        }

        // Split using non-alphabet characters
        String[] tokens = s.split("[^A-Za-z]+");

        // Print number of tokens
        System.out.println(tokens.length);

        // Print each token
        for (String token : tokens) {
            System.out.println(token);
        }
    }

}



