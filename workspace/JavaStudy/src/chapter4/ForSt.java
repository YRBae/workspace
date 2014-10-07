package chapter4;

public class ForSt {
	public static void main(String[] args) throws java.io.IOException{
		int i, n;
		double h=0.0;
		
		System.out.print("Enter a number = ");
		n=System.in.read()-'0';
		for(i=1;i<=n;i++)
			h=h+1/(double)i;
		System.out.println("n = "+n+", h = "+h);
	}
}
