package Test;

//�� ��ü�� �����ϸ鼭 ��ü�� ������ ������ ���� �Ѱ��ְ�, �ٸ� ��ü�� static�޼ҵ带 �̿��� ���.

class ObjX2{
	public int x;
	public static void printX(int prtN){
		System.out.println("1�� ��ü���� 2�� ��ü�� ������ �� ��� : "+prtN);
	}
}

class ObjY2{
	public int y;
	public static void printY(int prtN){
		System.out.println("2�� ��ü���� 1�� ��ü�� ������ �� ��� : "+prtN);
	}
}

public class Test_1_2 {
	public static void main(String[] args) throws java.io.IOException{
		ObjX2 a = new ObjX2();
		ObjY2 b = new ObjY2();
		
		System.out.print("1�� ��ü�� ������ 9������ �ڿ����� �Է��Ͻÿ� : ");
		a.x = System.in.read()-'0';
		System.in.skip(2);
		System.out.println("2�� ��ü�� ������ 9������ �ڿ����� �Է��Ͻÿ� : ");
		b.y = System.in.read()-'0';
		System.in.skip(2);
		
		b.printY(a.x);
		a.printX(b.y);
	}
}
