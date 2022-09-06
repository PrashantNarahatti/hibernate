package exception;

public class Age {
	public void validateAge(int age) throws InvalidAgeException {
		if(age<18) {
			throw new InvalidAgeException("You cannot vote");
		}
		else {
			System.out.println("yes you can vote");
		}
		
	}

}

