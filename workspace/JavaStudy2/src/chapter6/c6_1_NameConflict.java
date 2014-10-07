package chapter6;
class SuperClass{
	int a = 1, b = 1;
}
class SubClass extends SuperClass{
	int a = 2;
	double b = 2.0;
	void output() {
		System.out.println("Base class: a = "+super.a+", Extended class: a = "+a);
		System.out.println("Base calss: b = "+super.b+", Extended class: b = "+b);
	}
}
public class c6_1_NameConflict {
	public static void main(String[] args){
		SubClass obj = new SubClass();
		obj.output();
	}
}
