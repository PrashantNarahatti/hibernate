package exception;

public class ExceptionTest1 {

	public static void main(String[] args) {
		try {
			
		    int num1 = Integer.parseInt(args[0]);
		    int num2 = Integer.parseInt(args[1]);
		    
		    System.out.print(num1/num2);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("No input received");
		}	catch (NumberFormatException e) {
			System.out.println("Only integers are allowed");
		} catch (ArithmeticException e) {
			System.out.println("Division with zero is not possible");
		} finally {
			System.out.println("this is final input received");
		}

	}

}
