import java.io.*;
import java.util.*;
import java.math.*;

public class Java_Datatypes {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++){            
            Byte byteValue = null;
            Short shortValue = null;
            Integer intValue = null;
            Long longValue = null;
            
            BigDecimal number = new BigDecimal(scanner.next());            
            try {
                byteValue = number.byteValueExact();                          
            } catch (ArithmeticException e){}
            
            try {
                shortValue = number.shortValueExact();                
            } catch (ArithmeticException e){}
            
            try {
                intValue = number.intValueExact();                
            } catch (ArithmeticException e){}
            
            try {
                longValue = number.longValueExact();
            } catch (ArithmeticException e){}
            
            if (byteValue == null && shortValue == null && intValue == null && longValue == null){
                System.out.println(number + " can't be fitted anywhere.");
            } else {
                System.out.println(number + " can be fitted in:");
                if (byteValue != null){
                    System.out.println("* byte");
                }
                if (shortValue != null){
                    System.out.println("* short");
                }
                if (intValue != null){
                    System.out.println("* int");
                }
                if (longValue != null){
                    System.out.println("* long");
                }
            }
        }
    }
}