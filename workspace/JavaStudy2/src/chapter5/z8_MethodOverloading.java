package chapter5;


public class z8_MethodOverloading {
	void someThing(){
		System.out.println("someThing() is called.");
	}
	void someThing(int i){
		System.out.println("someThing(int) is called.");
	}
	void someThing(int i, int j){
		System.out.println("someThing(int, int) is called.");
	}
	public static void main(String[] args){
		z8_MethodOverloading m = new z8_MethodOverloading();
		m.someThing();
		m.someThing(526);
		m.someThing(54, 526);
	}
}