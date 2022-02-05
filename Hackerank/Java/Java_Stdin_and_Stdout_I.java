import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Java_Stdin_and_Stdout_I {

    public static void main(String args[]) throws FileNotFoundException {
        
        File file=new File("E:\\SourceTree\\Algorithm-Samples\\Hackerank\\Java\\Input.txt");
        Scanner sc=new Scanner(file);        
                
        while(sc.hasNextLine()){
            System.out.println(sc.next());
        }

        sc.close();        
    }
}
