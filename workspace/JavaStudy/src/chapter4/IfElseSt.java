package chapter4;

public class IfElseSt {
	public static void main(String[] args) throws java.io.IOException {
		int n;
		System.out.print("Enter a number = ");
		n=System.in.read() - '0';
		if(n%2 == 0)
			System.out.println(n+" is an even number.");
		else
			System.out.println(n+" is an odd number.");
		
	}
}
