package chapter3;

public class PrintTenItem {
	public static void main(String[] args) {
		int i, n=25;
		for (i=1; i<=n; ++i)
			System.out.print(i+((i%10 == 0 || i==n) ? "\n" : " "));
	}
}