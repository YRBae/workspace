package chapter4;

public class wwwww {
	public static void main(String[] args) throws java.io.IOException{
		int a;
		System.out.print("소문자를 입력하시오 = "); 
		a=System.in.read();
		a = a+('A'-'a');
		System.out.println((char)a);
	}
}
