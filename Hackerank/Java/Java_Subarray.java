import java.io.*;
import java.util.*;

public class Java_Subarray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int sizeOfArray = scanner.nextInt();
        int[] mArray = new int[sizeOfArray];
        int negativeCounter = 0;
        for (int i=0; i<sizeOfArray; i++){
            mArray[i] = scanner.nextInt();            
        }
        for (int i=0; i<sizeOfArray; i++){
            int tempSum = 0;
            for(int j=0; j<sizeOfArray; j++){
                if (j<i){
                    continue;
                }                
                tempSum += mArray[j];                
                if (tempSum < 0){
                    negativeCounter++;
                }
            }      
        }   
        System.out.println(negativeCounter);             
    }
}