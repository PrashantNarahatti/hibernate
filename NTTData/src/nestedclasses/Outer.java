package nestedclasses;

public class Outer {
	static int i = 5;
	int j = 9;

	public void show() {
		System.out.println("this is outer");

	}
     //static inner class
	static class Inner {

		static int i = 3;

		public static void show() {
			System.out.println("this is inner" + Outer.i);
		}
	}
}
// class Inside{
// public void show() {
// System.out.println("this is inside class");
// }
// }
