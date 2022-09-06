package exception;

public class CustomExceptionMain {

	public static void main(String[] args) {
		Age age = new Age();
		try {
			age.validateAge(18);
		} catch (InvalidAgeException e) {

			e.printStackTrace();
		}

	}

}
