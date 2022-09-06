package test;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		HashMap<String, Integer> hash = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++)
        {
            String name=sc.nextLine();
            int phone=sc.nextInt();
            sc.nextLine();
            hash.put(name,phone);
        }
        while(sc.hasNext())
        {
            String st=sc.nextLine();
            try
            {
                int out=hash.get(st);
                System.out.println(st+"="+out);
            }
            catch(Exception e)
            {
                System.out.println("Not found");
            }
        }
    }
}