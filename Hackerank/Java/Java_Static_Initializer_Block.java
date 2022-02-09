import java.io.*;
import java.util.*;

public class Java_Static_Initializer_Block {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int B = scanner.nextInt();
        int H = scanner.nextInt();
        System.out.println(calculateArea(B, H));
    }
    
    private static String calculateArea(int B, int H){
        if(B <= 0 || H <= 0){
            return "java.lang.Exception: Breadth and height must be positive";
        }
        
        return String.valueOf(B*H);
    }
    
}