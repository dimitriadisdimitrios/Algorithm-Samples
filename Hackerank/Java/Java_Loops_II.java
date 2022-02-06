import java.io.*;
import java.util.*;

public class Java_Loops_II {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int numberOfSeries = scanner.nextInt();
        for (int i = 0; i<numberOfSeries; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            int mPower=1;
            int tempResult = a + 1 * b; 
            System.out.print(tempResult);
            for (int j=0; j<n-1; j++){                                
                mPower *= 2;                   
                tempResult += mPower * b;
                System.out.print(" " + tempResult);
                
            }
            System.out.println();
        }
    }
}