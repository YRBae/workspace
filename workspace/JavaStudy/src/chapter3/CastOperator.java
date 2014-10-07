package chapter3;

public class CastOperator {
	public static void main(String[] args) {
		int i = 0Xffff;
		short s;
		
		s = (short) i;
		System.out.println("i = "+i);
		System.out.println("s = "+s);
	}
}
