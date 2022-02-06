import java.io.*;
import java.util.*;

public class Java_Output_Formatting {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        System.out.println("================================");
        
        Scanner scnr = new Scanner(System.in);
        while (scnr.hasNext()){
            String mNext = scnr.next();
            // System.out.println(15-mNext.length());
            int sizeOfText = mNext.length();
            for(int i=0; i<15-sizeOfText; i++) {
                mNext = mNext + " ";
                // System.out.println(15-mNext.length() + "1");
            }
            
            String mNumber = scnr.next();
            int sizeOfNumber = mNumber.length();
            
            for(int i=0; i<3; i++){
                if (i < 3-sizeOfNumber){
                        mNumber = "0" + mNumber;
                }
            }
            System.out.println(mNext + mNumber);
            // System.out.println(mNext.length() + "&&&");
        }
        System.out.println("================================");
    }
}