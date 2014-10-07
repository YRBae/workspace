package chapter5;

class OuterClass{
	class InnerClass{
		private int value;
		InnerClass(int i) {
			value = i;
		}
		void print() {
			System.out.println("value of INner class = "+value);
		}
	}
	public void link(int i) {
		InnerClass inObj = new InnerClass(i);
		inObj.print();
	}
}
public class z15_NestedClass {
	public static void main(String[] args) {
		OuterClass outObj = new OuterClass();
		outObj.link(1);
		OuterClass.InnerClass inObj = outObj.new InnerClass(2);
		inObj.print();
	}
}
