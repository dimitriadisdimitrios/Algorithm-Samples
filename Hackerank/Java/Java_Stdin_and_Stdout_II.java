import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scnr = new Scanner(System.in);
        
        int intValue = scnr.nextInt();
        double doubleValue = scnr.nextDouble();
        scnr.nextLine();
        String stringValue = scnr.nextLine();
        
        System.out.println("String: " + stringValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Int: " + intValue);
    }
}
