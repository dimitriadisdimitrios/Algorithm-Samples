import java.util.*;
// An array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.
// Your goal is to find that missing element.
// Write a function:
// class Solution { public int solution(int[] A); }
// that, given an array A, returns the value of the missing element.
// For example, given array A such that:
//   A[0] = 2
//   A[1] = 3
//   A[2] = 1
//   A[3] = 5
// the function should return 4, as it is the missing element.
// Write an efficient algorithm for the following assumptions:
// N is an integer within the range [0..100,000];
// the elements of A are all distinct;
// each element of array A is an integer within the range [1..(N + 1)].

public class PermMissingElem {
    public static void main(String[] argz) {
        int[] A = { 1 };
        System.out.println("Result is: " + solution(A));
        System.out.println("Result is: " + solution2(A));
        System.out.println("Result is: " + solution3(A));
    }

    // Task Score: 50% || Correctness: 100% || performance: 0%
    public static int solution(int[] A) {

        Integer[] tempArr = Arrays.stream(A).boxed().toArray(Integer[]::new);
        List<Integer> integerList = Arrays.asList(tempArr);

        for (int i = 1; i <= A.length + 1; i++) {
            if (!integerList.contains(i)) {
                return i;
            }
        }

        return A.length + 1;
    }

    // Task Score: 30% || Correctness: 60% || performance: 0%
    public static int solution2(int[] A) {

        if (A.length > 1) {
            ArrayList<Integer> tempMap = new ArrayList<Integer>();
            for (int mVal : A) {
                tempMap.add(mVal);
            }
            for (int i = 1; i <= A.length + 1; i++) {
                if (!tempMap.contains(i)) {
                    return i;
                }
            }
        }

        return A.length;
    }
    
    // Task Score: 100% || Correctness: 100% || performance: 100%
    public static int solution3(int[] A) {

        if (A.length == 0)
            return 1;
        
        int originalSum = 0;
        int arraySum = 0;

        for (int i=1; i<=A.length+1; i++){
            originalSum += i;
            if (i-1<A.length)
                arraySum += A[i-1];
        }

        return originalSum - arraySum;
    }
}
