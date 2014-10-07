package chapter3;

public class Forbidden {
	public static void main(String[] args) {
		boolean f = false, b;
		int i;
		
		b = f;
		System.out.println("f = "+f+", b = "+b);
		//i = f;  //에러 : 묵시적, 광역화 형병환 금지
		//i = (short)f; //에러 : 명시적 형변환 금지
	}
}
