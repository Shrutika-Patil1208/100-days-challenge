// import java.io.*;
import java.util.*;
// import java.text.*;
import java.math.*;
// import java.util.regex.*;

public class _24_bigint {


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        
        Scanner sc = new Scanner(System.in); 
         BigInteger a = new BigInteger(sc.next()); 
         BigInteger b = new BigInteger(sc.next()); 
          BigInteger sum = a.add(b); 
          BigInteger product = a.multiply(b); 
           System.out.println(sum);
            System.out.println(product); 
            sc.close();
    }
}

