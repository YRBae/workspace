package chapter3;

public class DivisionOperator {
	public static void main(String[] args){
		int i;
		double x;
		
		i = 1/2;
		x = 1/2;
		
		System.out.print("i = "+i);
		System.out.println(", x = "+x);
		
		i = (int) (1/2.0);
		x=1/2.0;
		System.out.print("i = "+i);
		System.out.println(", x = "+x);
	}
}
