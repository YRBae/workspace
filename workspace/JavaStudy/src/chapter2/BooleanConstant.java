package chapter2;

public class BooleanConstant {
	public static void main(String[] args){
		System.out.println("AND Type");
		System.out.println("TRUE AND TRUE = "+(true && true));
		System.out.println("TRUE AND FALSE = "+(true && false));
		System.out.println("FALSE AND TRUE = "+(false && true));
		System.out.println("FALSE AND FLASE = "+(false && false));
		
		System.out.println("\n\nOR Type");
		System.out.println("TRUE AND TRUE = "+(true || true));
		System.out.println("TRUE AND FALSE = "+(true || false));
		System.out.println("FALSE AND TRUE = "+(false || true));
		System.out.println("FALSE AND FLASE = "+(false || false));
		
	}
}