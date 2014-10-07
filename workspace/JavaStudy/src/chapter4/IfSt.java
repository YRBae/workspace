package chapter4;

public class IfSt {
	public static void main(String[] args) throws java.io.IOException {
		int n;
		
		System.out.print("Enter a bumber = ");
		n=System.in.read() - '0';
		if(n%2 == 0)
			System.out.println(n+" is an even number.");
		if(n%2 !=0)
			System.out.println(n+" is an odd number.");
		
	}
}
