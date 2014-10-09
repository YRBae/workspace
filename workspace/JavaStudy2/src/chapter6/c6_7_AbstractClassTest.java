package chapter6;

abstract class AbstractClass {
	public abstract void methodA();
	void methodB() {
		System.out.println("Implementation of methodB()");
	}
}
class ImpClass extends AbstractClass {
	public void methodA(){
		System.out.println("Implementation of methodA()");
	}
}
public class c6_7_AbstractClassTest {
	public static void main(String[] args) {
		ImpClass obj = new ImpClass();
		obj.methodA();
		obj.methodB();
	}
}
