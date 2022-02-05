import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int valueToCheck = scanner.nextInt();
        if (valueToCheck % 2 == 1) {
            System.out.println("Weird");
        } else if (valueToCheck >= 2 && valueToCheck <= 5){
            System.out.println("Not Weird");
        } else if (valueToCheck >= 6 && valueToCheck <= 20){
            System.out.println("Weird");
        } else { 
            System.out.println("Not Weird");
        }
    }
}