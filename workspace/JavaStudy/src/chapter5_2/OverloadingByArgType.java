package chapter5_2;

class MethodOverloading {
	void someThing(int i) {
		System.out.println("someThing(int) is called.");
	}
	void someThing(double d) {
		System.out.println("someThing(double) is called");
	}
}

public class OverloadingByArgType {
	public static void main(String[] args) {
		MethodOverloading m = new MethodOverloading();
		m.someThing(526);
		m.someThing('c');
		m.someThing(5.26f);
		m.someThing(5.26);
	}
}
