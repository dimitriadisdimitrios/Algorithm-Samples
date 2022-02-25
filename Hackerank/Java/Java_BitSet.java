import java.io.*;
import java.util.*;

public class Java_BitSet {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.nextLine();
        BitSet B1 = new BitSet(M);
        BitSet B2 = new BitSet(M);
        for (int i=0; i<M; i++){
            String[] action = scanner.nextLine().split(" ");
            
            switch (action[0]) {
                case "AND":
                    getBitSet(action[1], B1, B2).and(getBitSet(action[2], B1, B2));
                    break;
                case "OR":
                    getBitSet(action[1], B1, B2).or(getBitSet(action[2], B1, B2));
                    break;
                case "XOR":
                    getBitSet(action[1], B1, B2).xor(getBitSet(action[2], B1, B2));
                    break;
                case "FLIP":                    
                    getBitSet(action[1], B1, B2).flip(Integer.parseInt(action[2]));
                    break;
                case "SET":
                    getBitSet(action[1], B1, B2).set(Integer.parseInt(action[2]), true);
                    break;
            }
            System.out.println("" + B1.cardinality()+ " " + B2.cardinality());
        } 
        
    }
    
    private static BitSet getBitSet(String bitSetNumber, BitSet b1, BitSet b2){
        if (Integer.parseInt(bitSetNumber) == 1){
            return b1;
        } 
        return b2;                                       
    }
}