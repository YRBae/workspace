package chapter4;

public class LocalVariable {
	static int x;
	public static void main(String[] args) {
		int x = (x=2)*2;
		System.out.println("x = "+x);
	}
}
