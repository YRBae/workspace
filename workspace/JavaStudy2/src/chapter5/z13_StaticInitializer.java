package chapter5;

public class z13_StaticInitializer {
	public z13_StaticInitializer() {
		System.out.println("in Constructor");
	}
	static{
		System.out.println("in static initializer");
	}
	public static void main(String[] args) {
		System.out.println("Star of main");
		z13_StaticInitializer s = new z13_StaticInitializer();
		System.out.println("End of main");
	}
}
