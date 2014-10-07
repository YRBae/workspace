package Test;

//생성자를 이용하여 객체를 생성하면서 데이터를 넘겨주고, 다를 객체에서 데이터 출력

class ObjX4{
	public int x4;
	ObjX4(int x){
		x4 = x;
	}
	public static void printX(int intx){
		System.out.println("2번 객체의 값을 1번객체에서 출력 : "+intx);
	}
}

class ObjY4{
	public int y4;
	ObjY4(int y) {
		y4 = y;
	}
	public static void printY(int inty){
		System.out.println("1번 객체의 값을 2번 객체에서 출력 : "+inty);
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
