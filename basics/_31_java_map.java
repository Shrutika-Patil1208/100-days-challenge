import java.util.*;
// import java.io.*;
public class _31_java_map {

    public static void main(String []argh) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();  // number of phone book entries
        in.nextLine();         // consume the leftover newline

        // Create a map to store name -> phone number
        Map<String, Integer> phoneBook = new HashMap<>();

        // Read the phone book entries
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            in.nextLine(); // consume the leftover newline
            phoneBook.put(name, phone); // store in map
        }

        // Process queries until end-of-file
        while (in.hasNext()) {
            String query = in.nextLine();
            if (phoneBook.containsKey(query)) {
                System.out.println(query + "=" + phoneBook.get(query));
            } else {
                System.out.println("Not found");
            }
        }

        in.close();
    }
}


