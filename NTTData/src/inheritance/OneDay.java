package inheritance;

public class OneDay extends Cricket implements CurrentRunRate,RequiredRunRate {

	public OneDay(int maxOvers, int runRate, int day) {
		super(maxOvers, runRate, day);
		
	}

	@Override
	public void requiredRunRate() {
		System.out.println("required run rate");
		
	}

	@Override
	public void currentRunRate() {
		System.out.println("current run rate");
		
	}

}
