package chapter5;

public class z4_CallByValue {
	public static void swap(int x, int y){
		int temp;
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("  swap: x = "+x+", y = "+y);
	}
	public static void main(String[] args) throws java.io.IOException{
		System.out.println("두 가지 수입력!");
		int x, y;
		x = System.in.read()-48;
		System.in.skip(2);
		y = System.in.read()-48;
		System.in.skip(2);
		System.out.println("before: x = "+x+", y = "+y);
		swap(x, y);
		System.out.println(" after: x = "+x+", y = "+y);
	}
}
