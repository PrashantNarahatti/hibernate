package exception;

import java.io.FileNotFoundException;

public class ExceptionTest {
	public static void main(String[] args) {
		ExceptionDemo ex=new ExceptionDemo();
		try {
			ex.readFile();
			
		} catch (FileNotFoundException | ArithmeticException e) {
			System.out.println("could not read file");
			e.printStackTrace();
		}
//		catch (ArithmeticException e) {
//			System.out.println("could dividded by zero");
//			e.printStackTrace();
//		}
//		catch (Exception e) {
//			
//			e.printStackTrace();
//		}
		finally{
			System.out.println("this is finally block");
		}
		
		
	}

}
