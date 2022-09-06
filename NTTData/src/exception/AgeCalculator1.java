package exception;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class AgeCalculator1 {

	public int calculateAge(LocalDate dob) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String date = "15/02/2017";
		LocalDate curDate = LocalDate.parse(date, formatter);

		if ((dob != null) && (curDate != null)) {
			return Period.between(dob, curDate).getYears();
		} else {
			return 0;
		}
	}
//	public int calculateAge1(LocalDate dob1) {
//		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//		String date = "15/02/2017";
//		LocalDate curDate = LocalDate.parse(date, formatter1);
//
//		if ((dob1 != null) && (curDate != null)) {
//			return Period.between(dob1, curDate).getYears();
//		} else {
//			return 0;
//		}
}
