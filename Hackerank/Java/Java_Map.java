//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
	public static void Java_Map(String []argh)
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
        Map map = new HashMap<>();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
            map.put(name, phone);
			in.nextLine();
		}
		while(in.hasNext())
		{
			String s=in.nextLine();
            
            String result = "Not found";
            if (map.get(s) != null){
                result = s + "=" + map.get(s).toString();
            }
            System.out.println(result);
		}
	}
}



