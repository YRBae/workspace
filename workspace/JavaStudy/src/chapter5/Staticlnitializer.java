package chapter5;

public class Staticlnitializer {
	Staticlnitializer(){
		System.out.println("in Constructor");
	}
	static {
		System.out.println("in static initializer");
	}
	public static void main(String[] args) {
		System.out.println("Start of main");
		Staticlnitializer s = new Staticlnitializer();
		System.out.println("End of main");
	}
}
