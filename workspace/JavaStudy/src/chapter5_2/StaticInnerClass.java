package chapter5_2;

class OuterClass{
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

public class StaticInnerClass {
	public static void main(String[] args) {
		String s = "...without createing Outer-class object";
		OuterClass.InnerClass p = new OuterClass.InnerClass(s);
		p.print();
		OuterClass.InnerClass.staticPrint("call static method");
		p.print();
	}
}
