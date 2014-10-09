package chapter6;

class SuperClass6 {
	void methodA() {
		System.out.println("do SuperClass Task.");
	}
}

class SubClass6 extends SuperClass6 {
	void methodA() {
		super.methodA();
		System.out.println("do Subclass Task.");
	}
}

public class c6_6_Addendum {
	public static void main(String[] args) {
		SubClass6 obj = new SubClass6();
		obj.methodA();
	}
}
