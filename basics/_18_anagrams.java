import java.util.Scanner;
public class _18_anagrams {


    static boolean isAnagram(String a, String b) {
        // Complete the function
                a = a.toLowerCase();
        b = b.toLowerCase();

        // If lengths differ, not anagrams
        if (a.length() != b.length()) {
            return false;
        }

        // Frequency array for a-z
        int[] count = new int[26];

        for (int i = 0; i < a.length(); i++) {
            count[a.charAt(i) - 'a']++;
            count[b.charAt(i) - 'a']--;
        }

        // Check all frequencies
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                return false;
            }
        }

        return true;
    }

    

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

