package chapter3;

public class Forbidden {
	public static void main(String[] args) {
		boolean f = false, b;
		int i;
		
		b = f;
		System.out.println("f = "+f+", b = "+b);
		//i = f;  //���� : ������, ����ȭ ����ȯ ����
		//i = (short)f; //���� : ����� ����ȯ ����
	}
}
