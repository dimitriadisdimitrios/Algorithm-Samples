import java.io.*;
import java.util.*;

public class Java_String_Reverse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String reversedString = "";
        /* Enter your code here. Print output to STDOUT. */
        for(int i=A.length() -1; i>=0; i--){
            reversedString += A.charAt(i);
        }
        boolean isReversed = reversedString.equals(A);
        System.out.println(isReversed ? "Yes" : "No");
    }
}