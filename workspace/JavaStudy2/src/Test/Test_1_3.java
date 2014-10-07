package Test;

import java.util.Scanner;

//두 객체를 생성하고 영문자열을 저장 후 다른 객체의 매소드를 이용해 출력

class ObjX3{
	public String x;
	public static void printX(String stry){
		System.out.println("2번 객체의 값을 1번객체에서 출력 : "+stry);
	}
}

class ObjY3{
	public String y;
	public static void printY(String strx){
		System.out.println("1번 객체의 값을 2번 객체에서 출력 : "+strx);
	}
}

public class Test_1_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ObjX3 x = new ObjX3();
		ObjY3 y = new ObjY3();
		
		System.out.print("1번 객체에 저장할 영문자열 : ");
		x.x = scan.nextLine();
		System.out.print("2번 객체에 저장할 영문자열 : ");
		y.y = scan.nextLine();
		x.printX(y.y);
		y.printY(x.x);
		
	}
}