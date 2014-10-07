package chapter5;

public class ThisConstructor {
	ThisConstructor(){
		System.out.println("Default Constructor");
	}
	ThisConstructor(int a){
		this();
		System.out.println("Constructor with one parameter");
	}
	public static void main(String[] args) {
		ThisConstructor obj = new ThisConstructor(10);
		System.out.println("End of main");
	}
}
