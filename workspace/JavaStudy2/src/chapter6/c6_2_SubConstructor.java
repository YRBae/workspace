package chapter6;
class SuperClass2{
	SuperClass2() {
		System.out.println("SuperClass Constructor ...");
	}
}
class SubClass2 extends SuperClass2{
	SubClass2(){
		System.out.println("SubClass Constructor ...");
	}
}
public class c6_2_SubConstructor {
	public static void main(String[] args) {
		SubClass2 obj = new SubClass2();
		System.out.println("in main ...");
	}
}
