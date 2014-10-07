package test11;

public class Test {
	public static void totalPlus(String str, int... num){
		int sum = 0;
		for (int i:num)
			sum += i;
		System.out.println(str+sum);
	}
	
	public static void main(String[] args) {
		totalPlus("10, 20, 30, 40, 50을 모두 더한 값 = ", 10, 20, 30, 40, 50);
	}
}
