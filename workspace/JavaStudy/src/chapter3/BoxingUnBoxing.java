package chapter3;

public class BoxingUnBoxing {
	public static void main(String[] args) {
		int foo = 526;
		Object bar = foo;
		System.out.println(bar);
		try {
			double d = (Double)bar;
			System.out.println(d);
		} catch(ClassCastException e) {
			System.err.println(e.toString());
		}
	}
}
