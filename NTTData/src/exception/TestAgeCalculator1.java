package exception;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TestAgeCalculator1 {

	public static void main(String[] args) {
		System.out.print("Enter date of birth in dd/mm/yyyy format: ");
		Scanner scanner = new Scanner(System.in);

		String input = scanner.nextLine();
		scanner.close();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dob = LocalDate.parse(input, formatter);
		
//		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//		LocalDate dob1 = LocalDate.parse(input, formatter1);
		// prints the age
		AgeCalculator1 ageCal = new AgeCalculator1();
		System.out.println("You are " + ageCal.calculateAge(dob) + " years old.");
//		AgeCalculator1 ageCal1 = new AgeCalculator1();
//		System.out.println("You are " + ageCal1.calculateAge1(dob1) + " years old.");
	}

}
