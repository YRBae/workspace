package chapter1;

public class Primitives {
	public static void main(String[] args){
		boolean b;
		int i = Integer.MAX_VALUE;
		double d = Double.MIN_VALUE;
		
		b = (i!=0);		
		System.out.println("boolean b = "+b);
		System.out.println("max value of integer = "+i);
		System.out.println("min value of double = "+d);
	}
}