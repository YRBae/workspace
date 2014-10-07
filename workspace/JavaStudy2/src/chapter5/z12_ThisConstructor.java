package chapter5;

public class z12_ThisConstructor {
	z12_ThisConstructor() {
		System.out.println("Default Constructor");
	}
	z12_ThisConstructor(int a){
		this();
		System.out.println("Constructorwith one parameter");
	}
	public static void main(String[] args){
		z12_ThisConstructor obj = new z12_ThisConstructor(10);
		System.out.println("End of main");
	}
}
