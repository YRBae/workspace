package chapter3;

public class LosePrecision {
	public static void main(String[] args) {
		int big = 1234567890;
		float approx;
		
		approx = (float)big;
		System.out.println("difference = " +(big-(int)approx));
	}
}
