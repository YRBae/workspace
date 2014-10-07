package chapter5;

public class ExecConstructor {
	int a = 1;
	ExecConstructor(){
		System.out.println("a = "+a);
		a=0;
	}
	public static void main(String[] args) {
		ExecConstructor obj = new ExecConstructor();
		System.out.println("a = "+obj.a);
	}
}