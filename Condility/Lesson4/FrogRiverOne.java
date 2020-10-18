import java.util.*;
public class FrogRiverOne{
    public static void main(String[] args) {
        int[] A = {1,3};
        System.out.print("The result is: " +solution(1, A));        
    }

    public static int solution(int X, int[] A){
        List<Integer> mList = new ArrayList<>();
        for(int i=1; i<=X; i++){
            mList.add(i);            
        }
        int mCounter = 0;
        for(int mElement : A){
            if(mList.contains(mElement)){
                mList.removeIf(s -> s == mElement);
                if(mList.size() == 0){
                    return mCounter;
                }
            }
            mCounter++;
        }

        return -1;
    }
}