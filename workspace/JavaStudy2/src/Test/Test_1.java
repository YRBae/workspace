package Test;

//�� ��ü�� ����� �� ��ü�� �����͸� ���� �� �ٸ� ��ü���� ���, �ݴ�� �� ���� ���.

//�� ��ü�� �����ϰ�, ��ü�� ������ �����͸� ���� �� �ٸ� ��ü�� static �޼ҵ带 �̿��� ���.
class ObjX{
	public int x;
	public static void printX(int prtN){
		System.out.println("1�� ��ü���� 2�� ��ü�� ������ �� ��� : "+prtN);
	}
}

class ObjY{
	public int y;
	public static void printY(int prtN){
		System.out.println("2�� ��ü���� 1�� ��ü�� ������ �� ��� : "+prtN);
	}
}

public class Test_1 { 
	public static void main(String[] args) {
		ObjX a = new ObjX();
		ObjY b = new ObjY();
		
		a.x = 1;
		b.y = 2;
		
		b.printY(a.x);
		a.printX(b.y);
	}
}
