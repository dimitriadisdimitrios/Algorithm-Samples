import java.io.*;
import java.util.*;

public class Java_End_of_file {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int lineNum = 0;
        while (scanner.hasNext()){
            lineNum++;
            System.out.println(lineNum + " " + scanner.nextLine());
        }
    }
}