package Test;

import java.util.Scanner;

//�� ��ü�� �����ϰ� �����ڿ��� ���� �� �ٸ� ��ü�� �żҵ带 �̿��� ���

class ObjX3{
	public String x;
	public static void printX(String stry){
		System.out.println("2�� ��ü�� ���� 1����ü���� ��� : "+stry);
	}
}

class ObjY3{
	public String y;
	public static void printY(String strx){
		System.out.println("1�� ��ü�� ���� 2�� ��ü���� ��� : "+strx);
	}
}

public class Test_1_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ObjX3 x = new ObjX3();
		ObjY3 y = new ObjY3();
		
		System.out.print("1�� ��ü�� ������ �����ڿ� : ");
		x.x = scan.nextLine();
		System.out.print("2�� ��ü�� ������ �����ڿ� : ");
		y.y = scan.nextLine();
		x.printX(y.y);
		y.printY(x.x);
		
	}
}