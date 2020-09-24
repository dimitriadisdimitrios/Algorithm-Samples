import java.util.*;

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