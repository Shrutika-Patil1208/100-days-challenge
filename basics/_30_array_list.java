// import java.io.*;
import java.util.*;
// import java.text.*;
// import java.math.*;
// import java.util.regex.*;
public class _30_array_list {


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
                Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();     // number of elements
        ArrayList<Integer> list = new ArrayList<>();

        // Taking list elements
        for(int i = 0; i < n; i++){
            list.add(sc.nextInt());
        }

        int q = sc.nextInt();     // number of queries

        for(int i = 0; i < q; i++){
            String operation = sc.next();

            if(operation.equals("Insert")){
                int x = sc.nextInt();
                int y = sc.nextInt();
                list.add(x, y);
            }
            else if(operation.equals("Delete")){
                int x = sc.nextInt();
                list.remove(x);
            }
        }

        // Printing final list
        for(int num : list){
            System.out.print(num + " ");
        }

        sc.close();

    }
}

