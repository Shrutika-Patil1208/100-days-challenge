// import java.io.*;
import java.util.*;
// import java.text.*;
// import java.math.*;
// import java.util.regex.*;
public class _29_arraylist {



    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
                Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // Reading n lines
        for (int i = 0; i < n; i++) {
            int d = sc.nextInt(); // number of elements in this line
            ArrayList<Integer> row = new ArrayList<>();

            for (int j = 0; j < d; j++) {
                row.add(sc.nextInt());
            }

            list.add(row);
        }

        int q = sc.nextInt(); // number of queries

        // Processing queries
        for (int i = 0; i < q; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            try {
                System.out.println(list.get(x - 1).get(y - 1));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }

        sc.close();
    }
}

        


