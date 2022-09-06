package inheritance;

import java.util.Scanner;

public class CricketTest {
	public static void main(String[] args) {
		OneDay od=new OneDay(50,250,1);
		Scanner sc = new Scanner(System.in);
		int overs, runs, overs_bowled, run_scored;

		double current_runrate, next_runrate;

		System.out.print("Enter total number of overs: ");

		overs = sc.nextInt();

		System.out.print("Enter target runs: ");

		runs = sc.nextInt();

		System.out.print("Enter overs bowled: ");

		overs_bowled = sc.nextInt();

		System.out.print("Enter runs scored: ");

		run_scored = sc.nextInt();

		sc.close();

		current_runrate = run_scored / (double) overs_bowled;

		System.out.println("Current run rate: " + current_runrate);

		overs -= overs_bowled;

		runs -= run_scored;

		next_runrate = runs / (double) overs;

		System.out.println("Run rate required after " + overs_bowled + " overs: " + next_runrate);

	}

}
