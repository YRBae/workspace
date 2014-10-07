package chapter5;

public class z7_CommandLineArgs {
	public static void main(String[] args){
		for (int i=0; i<args.length; ++i)
			System.out.println("Argument[" +i+ "] = "+args[i]);
	}
}
