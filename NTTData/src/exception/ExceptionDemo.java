package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo {

	public void readFile() throws FileNotFoundException,ArithmeticException {
		File file = new File("data.txt");
		FileInputStream fs = new FileInputStream(file);

		System.out.println("start");
		System.out.println(2 / 0);
		System.out.println("end");

	}

}
