package inheritance;

public class Cricket {
	int maxOvers=50;
	int runRate=250;
	
	public Cricket(int maxOvers, int runRate, int day) {
		super();
		this.maxOvers = maxOvers;
		this.runRate = runRate;
		
	}
	public int getMaxOvers() {
		return maxOvers;
	}
	public void setMaxOvers(int maxOvers) {
		this.maxOvers = maxOvers;
	}
	public int getRunRate() {
		return runRate;
	}
	public void setRunRate(int runRate) {
		this.runRate = runRate;
	}
	@Override
	public String toString() {
		return "Cricket [maxOvers=" + maxOvers + ", runRate=" + runRate + "]";
	}
	
	
	

}
