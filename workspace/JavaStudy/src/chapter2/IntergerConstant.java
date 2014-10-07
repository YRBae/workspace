package chapter2;

public class IntergerConstant {
	public static void main(String[] args){
		
		int i = 255, o = 0377, h = 0Xff;
		long l = 0XffL;
		System.out.println("i = "+i+", o = "+o+", h = "+h);
		if (h==l) System.out.println("Yes");
		else System.out.println("No");
	}
}
