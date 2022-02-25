import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Java_2D_Array {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        int maxSum = findTheMaxSum(arr);
        System.out.println(maxSum);

        bufferedReader.close();
    }
    
    private static int findTheMaxSum(List<List<Integer>> mList){
        Integer maxNumber = null;
        for (int i = 0; i < 4; i++ ){
            for(int j = 0; j< 4; j++){
                int tempValue = (mList.get(i)).get(j) + (mList.get(i)).get(j+1) + (mList.get(i)).get(j+2) + (mList.get(i+1)).get(j+1) + (mList.get(i+2)).get(j) + (mList.get(i+2)).get(j+1) + (mList.get(i+2)).get(j+2);
                if (maxNumber == null){
                    maxNumber = tempValue;
                } else {
                    maxNumber = maxNumber>tempValue ? maxNumber : tempValue;                    
                }
            }
        }
        return maxNumber;
    }
}
