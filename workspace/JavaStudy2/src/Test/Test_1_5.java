package Test;


//������ �Է¹ް� �� ���� �����ڸ� ������ ���� �Ķ���� ������ �Ѱ��־� ��ü�� �����͸� ���� ��, �ٸ� ��ü���� ������ ���


class ObjX5{
	public int x4;
	ObjX5(int x){
		x4 = x;
	}
	public static void printX(int intx){
		System.out.println("2�� ��ü�� ���� 1����ü���� ��� : "+intx);
	}
}

class ObjY5{
	public int y4;
	ObjY5(int y) {
		y4 = y;
	}
	public static void printY(int inty){
		System.out.println("1�� ��ü�� ���� 2�� ��ü���� ��� : "+inty);
	}
}

public class Test_1_5 {
	public static void main(String[] args) throws java.io.IOException{
		int a, b;
		System.out.print("1�� ��ü�� ������ 9������ �ڿ����� �Է��Ͻÿ� : ");
		a = System.in.read()-'0';
		System.in.skip(2);
		System.out.print("2�� ��ü�� ������ 9������ �ڿ����� �Է��Ͻÿ� : ");
		b = System.in.read()-'0';
		System.in.skip(2);
		
		ObjX5 x = new ObjX5(a);
		ObjY5 y = new ObjY5(b);
		
		x.printX(y.y4);
		y.printY(x.x4);
	}
}
