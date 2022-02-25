import java.io.*;
import java.util.*;

public class Java_List {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();
        List<Integer> mList = new ArrayList<>();
        for (int i=0; i<numberOfElements; i++){
            mList.add(scanner.nextInt());
        }
        int numberOfActions = scanner.nextInt();
        for(int j=1; j<=numberOfActions; j++){
            scanner.nextLine();
            String mAction = scanner.nextLine();
            if (mAction.equals("Insert")){
                int indexToAdd = scanner.nextInt();
                int numberToAdd = scanner.nextInt();
                
                mList.add(indexToAdd, numberToAdd);
            } else {
                int indexToDelete = scanner.nextInt();
                mList.remove(indexToDelete);
            }
        }
        String answer = "";
        for (Integer mElement: mList){
            answer += mElement + " ";
        }
        System.out.println(answer);
    }
}