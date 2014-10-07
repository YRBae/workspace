package chapter5;

public class z18_Outer {
	void print(){
		System.out.println("main() in Outer$Inner.class");
	}
	public static class Inner {
		public static void main(String[] args){
			z18_Outer p = new z18_Outer();
			p.print();
		}
	}
}
