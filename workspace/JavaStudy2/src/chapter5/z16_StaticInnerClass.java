package chapter5;

class OuterClass2{
	static class InnerClass {
		static String str;
		InnerClass(String s){
			str = s;
		}
		void print(){
			staticPrint(str);
		}
		static void staticPrint(String s){
			str = s;
			System.out.println(s);
		}
	}
}

public class z16_StaticInnerClass {
	public static void main(String[] args) {
		String s = "...without createing Outer-class object";
		OuterClass2.InnerClass p = new OuterClass2.InnerClass(s);
		p.print();
		OuterClass2.InnerClass.staticPrint("call static method");
		p.print();
	}
}
