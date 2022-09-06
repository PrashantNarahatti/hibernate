package nestedclasses;

public class Main {

	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.show();
		System.out.println(Outer.i);
		System.out.println(Outer.Inner.i);

		Outer.Inner inner = new Outer.Inner();
		// Outer.Inner inner = outer.new Inner();
		inner.show();

		// Inside inside=inner.new Inside();
		// inside.show();
	}

}
