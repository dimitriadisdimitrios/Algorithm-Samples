// you can also use imports, for example:
import java.util.*;
import java.util.Collection;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N) {
        
        // Array with char array of binary number
        char[] digitElement = Integer.toBinaryString(N).toCharArray();
        //trigger to start count zeros
        boolean trigToCount = false;
        // Variable to count zeros before save them in 
        int zeroCounter = 0;
        // Variable to save the max number
        int maxVal = 0;
        
        for(char element : digitElement){
            
            // If its 0 and the trigger is activate add on counter
            if (element == '0' && trigToCount){
                // Add on counter 1 to calculate later the binary gap
                zeroCounter += 1;
                
            } else if (element == '1'){
                // Execute only when it finds the first 1 
                trigToCount = true;
                
                if (zeroCounter > 0){
                    // If zeroCounter is bigger from maxVal, update maxVal
                    maxVal = maxVal > zeroCounter ? maxVal : zeroCounter;
                }
                // Reset counter
                zeroCounter = 0;
            }
        }
        return maxVal;
    }
}