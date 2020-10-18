//It gives you an array. Any integer P, such that 0 < P < N, splits this tape into two non-empty parts: A[0], A[1], ..., A[P − 1] and A[P], A[P + 1], ..., A[N − 1].
//You must find the min abs... diff with seperated P Arrays
public class TapeEquilibrium{
    public static void main(String[] argz){
        int[] A = {-10, -20, -30, -40, 100};
        System.out.println("Result is: " + solution(A));
    }

    public static int solution(int[] A){
        int sum = 0;
        
        //Caluclate the sum of all elements
        for(int mElement : A){
            sum += mElement;            
        }

        int firstNum = 0;
        Integer mResult = null;        
        for (int i=0; i<A.length-1; i++){
            firstNum += A[i];
            sum -= A[i];
            int tempReult = Math.abs(firstNum - sum);
            if(mResult == null || tempReult < mResult){
                mResult = tempReult;
            }
        }
        return mResult;        
    }
}