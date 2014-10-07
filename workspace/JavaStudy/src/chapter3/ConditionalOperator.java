package chapter3;

public class ConditionalOperator {
	public static void main(String[] args) throws java.io.IOException {
		int a, b, c;
		int m=0;
		
		System.out.print("Enter Three numbers : ");
		a = System.in.read() - 48;
		b = System.in.read() - '0';
		c = System.in.read() - '0';
		m = (a>b) ? a:b;
		m = (m>c) ? m:c;
		System.out.println("The largest number = "+m);
		
	}
}