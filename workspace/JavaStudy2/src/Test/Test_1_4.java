package Test;

//�����ڸ� �̿��Ͽ� ��ü�� �����ϸ鼭 �����͸� �Ѱ��ְ�, �ٸ� ��ü���� ������ ���

class ObjX4{
	public int x4;
	ObjX4(int x){
		x4 = x;
	}
	public static void printX(int intx){
		System.out.println("2�� ��ü�� ���� 1����ü���� ��� : "+intx);
	}
}

class ObjY4{
	public int y4;
	ObjY4(int y) {
		y4 = y;
	}
	public static void printY(int inty){
		System.out.println("1�� ��ü�� ���� 2�� ��ü���� ��� : "+inty);
	}
}

public class Test_1_4 {
	public static void main(String[] args) {
		ObjX4 x = new ObjX4(1);
		ObjY4 y = new ObjY4(2);
		
		x.printX(y.y4);
		y.printY(x.x4);
	}
}
