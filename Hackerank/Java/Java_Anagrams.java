import java.util.Scanner;

public class Java_Anagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if (a.length() == b.length()){
            a = a.toUpperCase();
            b = b.toUpperCase();
            char[] aArray = a.toCharArray();
            char[] bArray = b.toCharArray();
            java.util.Arrays.sort(aArray);
            java.util.Arrays.sort(bArray);
                    
            for(int i=0; i<aArray.length; i++){                    
                if(aArray[i]!=bArray[i]){
                    return false;
                }
            }
            return true;
        }
        return false;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
