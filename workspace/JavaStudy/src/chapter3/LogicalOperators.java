package chapter3;

public class LogicalOperators {
	public static void main(String[] args) {
	int x=3, y=5, z=7;
	boolean b;
	
	b = x<y && y<z;
	System.out.println("Result = "+b);
	
	b = x == y || x<y && y>z;
	System.out.println("Result = "+b);
	}
}
