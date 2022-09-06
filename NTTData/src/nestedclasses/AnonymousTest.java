package nestedclasses;

public class AnonymousTest {
	public static void main(String[] args) {
		AnonymousDemo ad = new AnonymousDemo() {
			int i=0;
			public void show() {
				super.show();

				System.out.println("I am the sub class :"+super.i+i);
			}
		};

		ad.show();
	}

}
