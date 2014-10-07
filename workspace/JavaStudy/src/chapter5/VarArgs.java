package chapter5;

public class VarArgs {
	public static void methodWithVarArgs(Object... args) {
		System.out.println("Variable Argument Example");
		for(Object x: args)
			System.out.println(x);
	}
	
	public static void methodWithIntVarArgs(String s, int... args) {
		System.out.println("Integer Variable Argument Example");
		
		int sum = 0;
		for (int i: args)
			sum+=i;
		System.out.println(s+sum);
	}
	
	public static void main(String[] args) {
		methodWithVarArgs(10.0, 20.0, 30.0, 40, 50);
		methodWithIntVarArgs("Total is ", 10, 20, 30, 40, 50);
	}
}
