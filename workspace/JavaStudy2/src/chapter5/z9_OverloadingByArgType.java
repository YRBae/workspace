package chapter5;
class MethodOverloading {
	void someThing(int i){
		System.out.println("someThing(int) is called.");
	}
	void someThing(char c){
		System.out.println("someThing(char) is called.");
	}
	void someThing(float f){
		System.out.println("someThing(float) is called.");
	}
	void someThing(double d){
		System.out.println("someThing(double) is called.");
	}
	void someThing(String s){
		System.out.println("someThing(String) is called");
	}
}
public class z9_OverloadingByArgType {
	public static void main(String[] args){
		MethodOverloading m = new MethodOverloading();
		m.someThing(526);
		m.someThing('c');
		m.someThing(5.26f);
		m.someThing(5.26);
		m.someThing("I am String!");
	}
}
