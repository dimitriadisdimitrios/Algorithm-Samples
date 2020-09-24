import java.util.*;
// The rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7] (elements are shifted right by one index and 6 is moved to the first place).
// The goal is to rotate array A K times; that is, each element of A will be shifted to the right K times.

public class CyclicRotation {

    public static void main(String[] argz) {

        int[] A1 = { 3, 8, 9, 7, 6 };

        System.out.println("Result of CyclicRotation: " + solution(A1, 3));
    }

    public static int[] solution(int[] A, int K) {

        if (K == 0 || A.length == 0 || A.length == 1 || K == A.length) {
            return A;
        }

        ArrayList<Integer> tempArr = new ArrayList<>();

        if (K > A.length) {
            K = K % A.length;
        }

        for (int i = A.length - 1; i >= 0; i--) {

            tempArr.add(0, A[i]);
            if (i - K >= 0) {
                A[i] = A[i - K];
            } else {
                int mIndex = tempArr.size();
                A[i] = tempArr.get(mIndex - 1);
                tempArr.remove(mIndex - 1);
            }
        }
        return A;
    }
}