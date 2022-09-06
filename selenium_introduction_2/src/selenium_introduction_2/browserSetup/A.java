package selenium_introduction_2.browserSetup;

public class A {

	public static void main(int i) {
		System.out.println("Main method 2 :" + i);
	}

	public static void main(String[] args) {
		System.out.println("Main method 1 :");
		A.main(12);
	}
}


