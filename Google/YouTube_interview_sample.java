import java.util.*;

//Must the sum of two elements in an Array gived you, is equal to N (int). 
//There is a case that none of the sum element give you the result you want 

//Example: For N = 8
//[1,2,3,9] -> There is no sum of elements that gives you 8 : False
//[1,2,4,4] -> 4 + 4 = 8 : True

public class YouTube_interview_sample {
    public static void main(String[] argz) {
        System.out.println("\n\n");
        
        //Input 
        int[] A1 = {1,2,3,9};
        int[] A2 = {1,2,4,4};
        int N = 8;

        //Output
        System.out.println("Result for A1: " + solution(A1,N));
        System.out.println("Result for A2: " + solution(A2,N));
        System.out.println("\n");
    }

    private static int solution(int[] A, int demandedVal) {
        
        ArrayList<Integer> savedElementThatISeek = new ArrayList<Integer>();
        
        for(int i=0; i<A.length; i++) {
            if(savedElementThatISeek.contains(A[i])) { 
                return 1;
            }
            
            if( demandedVal != A[i]){
                savedElementThatISeek.add(demandedVal - A[i]);
            }
        }

        return 0;
    }
}
