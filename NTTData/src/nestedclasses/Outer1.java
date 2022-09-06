package nestedclasses;

public class Outer1 {

    int i = 5;
	int j = 7;

	public void show() {
		int x=3;
		// local inner class
		class Inner {
			public void show() {
				System.out.println("this is local class"+i+j+x);
			}

		}
		Inner inner=new Inner();
		inner.show();
	}

}
