package chapter3;

public class IncDecOperators {
	public static void main(String[] args) {
		int x=3, y=5;
		int a, b;
		
		++x;
		--y;
		System.out.println("x = "+x+", y = "+y);
		
		a = (++x)+1;
		System.out.println("x = "+x+", a = "+a);
		
		b = (y++)+1;
		System.out.println("y = "+y+", a = "+b);
	}
}