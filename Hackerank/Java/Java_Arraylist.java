import java.io.*;
import java.util.*;

public class Java_Arraylist {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int numberOfLists = scanner.nextInt();
        List<List<Integer>> mList = new ArrayList<>();
        for (int i=0; i<numberOfLists; i++){
            int numberOfElements = scanner.nextInt();
            List<Integer> tempList = new ArrayList<>();
            for (int j=0; j<numberOfElements; j++){
                tempList.add(scanner.nextInt());
            }
            mList.add(tempList);
        }
        
        int numberOfTests = scanner.nextInt();
        for (int i=0; i<numberOfTests; i++){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            try{
                System.out.println(mList.get(x-1).get(y-1));                
            } catch (IndexOutOfBoundsException e){
                System.out.println("ERROR!");
            }
        }
    }
}