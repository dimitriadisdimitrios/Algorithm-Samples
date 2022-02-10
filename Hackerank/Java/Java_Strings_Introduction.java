package Hackerank.Java;
import java.io.*;
import java.util.*;

public class Java_Strings_Introduction {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String A = scanner.next();
        String B = scanner.next();
        int sumOfStrings = A.length() + B.length();
        
        System.out.println(sumOfStrings);
        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
        
        System.out.println(capitalize(A) + " " + capitalize(B));
    }
    
    private static String capitalize(String text){
        return text.substring(0,1).toUpperCase() + text.substring(1);
    }
}