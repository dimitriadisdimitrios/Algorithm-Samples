package Hackerank.Java;
import java.io.*;
import java.util.*;

public class Java_Substring {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
 
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int start = scanner.nextInt();
        int end = scanner.nextInt();        
        System.out.println(text.substring(start, end));
    }
}