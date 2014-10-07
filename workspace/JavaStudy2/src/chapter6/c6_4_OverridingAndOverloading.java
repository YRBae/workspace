package chapter6;
class SuperClass4{
	void methodA(){
		System.out.println("In SuperClass ...");
	}
}
class SubClass4 extends SuperClass4{
	void methodA(){
		System.out.println("In SubClass ... Overriding !!!");
	}
	void methodA (int i) {
		System.out.println("In Subclass ... Overloading !!!");
	}
}
public class c6_4_OverridingAndOverloading {
	public static void main(String[] args) {
		SuperClass4 obj1 = new SuperClass4();
		SubClass4 obj2 = new SubClass4();
		obj1.methodA();
		obj2.methodA();
		obj2.methodA(1);
	}
}
