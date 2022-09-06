package exception;

import java.util.Scanner;

public class Solution {
	
	public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		while (sc.hasNextInt()) {
			int n = sc.nextInt();
			int p = sc.nextInt();
			
			try {
				System.out.println(my_calculator.power(n,p));
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}

}
