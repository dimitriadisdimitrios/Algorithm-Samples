import java.util.*;

// A non-empty array A consisting of N integers is given. The array contains an odd number of elements, and each element of the array can be paired 
//  with another element that has the same value, except for one element that is left unpaired.

// For example, in array A such that:
//   A[0] = 9  A[1] = 3  A[2] = 9
//   A[3] = 3  A[4] = 9  A[5] = 7
//   A[6] = 9
// the elements at indexes 0 and 2 have value 9,
// the elements at indexes 1 and 3 have value 3,
// the elements at indexes 4 and 6 have value 9,
// the element at index 5 has value 7 and is unpaired.

public class OddOccurrencesInArray{
    public static void main(String[] argz) {
        int[] tempArr = {9, 3, 9, 3, 9, 7, 9 };
        System.out.println("Result: " + solution1(tempArr));
        System.out.println("Result: " + solution2(tempArr));
    }

    // Task Score: 55% || Correctness: 100% || Performance: 0%
    public static int solution1(int[] A){
        ArrayList<Integer> storeNums = new ArrayList<>();
        for (int tempVal : A){
            if (storeNums.contains(tempVal)){
                storeNums.removeIf( mVal -> mVal.equals(tempVal));
            } else {
                storeNums.add(tempVal);
            }
        }
        return storeNums.get(0);
    }

    // Task Score: 100% || Correctness: 100% || Performance: 100%
    public static int solution2(int[] A){
        HashMap<Integer, Integer> storeNums = new HashMap();
        for (int tempVal : A){
            if (storeNums.containsKey(tempVal)) {
                int mCount = storeNums.get(tempVal) + 1;
                storeNums.put(tempVal, mCount);
            } else{
                storeNums.put(tempVal, 1);
            }
        }
        for (Map.Entry<Integer, Integer> mSet : storeNums.entrySet()){
            if (mSet.getValue() % 2 != 0){
                return mSet.getKey();
            }
        }
        return -1;
    }
}