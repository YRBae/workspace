package chapter6;

class SuperClass13 {
	int value;

	SuperClass13() {
		value = 0;
	}

	SuperClass13(int i) {
		value = i;
	}

	void output() {
		System.out.println("SuperClass : " + value);
	}
}

class SubClass13 extends SuperClass13 {
	int value;

	SubClass13(int i) {
		value = i;
	}

	void output() {
		System.out.println("SubClass : " + value);
	}
}

public class c6_13_Polymorphism {
	static void print(SuperClass13 obj) {
		obj.output();
	}

	public static void main(String[] args) {
		SuperClass13 obj1 = new SuperClass13(1);
		SubClass13 obj2 = new SubClass13(1);
		print(obj1);
		print(obj2);
	}
}