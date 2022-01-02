import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Java_Output_Formatting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();

            // Complete this line
            mainProcedure(x, s1);
        }
        System.out.println("================================");
        sc.close();
    }

    private static void mainProcedure(int x, String s) {
        String xResult = appendZeros(x);
        String sResult = addSpaces(s);
        System.out.println(sResult + xResult);
    }

    private static String addSpaces(String s) {
        List<String> ch = new ArrayList<>();
        ch = stringtoCharList(s);
        for (int i = ch.size(); i <= 15; i++) {
            ch.add(" ");
        }
        return String.join("", ch);
    }

    private static String appendZeros(int x) {
        String s = String.valueOf(x);
        List<String> ch = new ArrayList<>();
        ch = stringtoCharList(s);
        for (int i = ch.size(); i < 3; i++) {
            ch.add(0, "0");
        }
        return String.join("", ch);
    }

    private static List<String> stringtoCharList(String s){
        List<String> ch = new ArrayList<>();
        for(char c : s.toCharArray()){
            ch.add(String.valueOf(c));
        }
        return ch;
    }
}