package chapter5;

public class z11_ExeConstructor {
	int a = 1;
	public z11_ExeConstructor() {
		System.out.println("a = "+a);
		a = 0;
	}
	public static void main(String[] args) {
		z11_ExeConstructor obj = new z11_ExeConstructor();
		System.out.println("a = "+obj.a);
	}
}
