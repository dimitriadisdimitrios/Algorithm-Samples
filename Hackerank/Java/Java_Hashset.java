import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Java_Hashset {

 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        
//Write your code here
        HashSet<String> hashSet = new HashSet<String>();
        for(int j=0; j<pair_left.length; j++){
            String result = pair_left[j] + " " + pair_right[j];
            hashSet.add(result);
            System.out.println(hashSet.size());
        }
   }
}