package chapter6;
class SuperClass3{
	int a, b;
	SuperClass3(){
		a=1;
		b=1;
	}
	SuperClass3(int a, int b){
		this.a = a;
		this.b = b;
	}
}
class SubClass3 extends SuperClass3{
	int c;
	SubClass3(){
		c = 1;
	}
	SubClass3(int a, int b, int c){
		super(a, b);
		this.c = c;
	}
}
public class c6_3_SuperCallTest {
	public static void main(String[] args) {
		SubClass3 obj1 = new SubClass3();
		SubClass3 obj2 = new SubClass3(1,2,3);
		System.out.println("a = "+obj1.a+", b = "+obj1.b+", c = "+obj1.c);
		System.out.println("a = "+obj2.a+", b = "+obj2.b+", c = "+obj2.c);
	}
}
