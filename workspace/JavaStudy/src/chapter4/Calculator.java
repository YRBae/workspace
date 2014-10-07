package chapter4;

public class Calculator {
	public static void main(String[] args) throws java.io.IOException{
		int x, y, p=0;
		char c;
		System.out.print("Enter an operator & two numbers = ");
		c=(char) System.in.read();
		x=System.in.read()-'0';
		y=System.in.read()-'0';
		switch (c) {
		case '+':
			p=x+y;
			System.out.println(x+" + "+y+" = "+p);
			break;
		case '-':
			p=x-y;
			System.out.println(x+" - "+y+" = "+p);
			break;
		case '*':
			p=x*y;
			System.out.println(x+" * "+y+" = "+p);
			break;
		case '/':
			p=x/y;
			System.out.println(y+" / "+y+" = "+p);
			break;
			default :
				System.out.println("Illegal operator");
		}
	}
}
