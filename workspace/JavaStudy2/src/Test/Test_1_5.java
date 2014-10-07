package Test;


//정수를 입력받고 그 값을 생성자를 생성할 때의 파라미터 값으로 넘겨주어 객체에 데이터를 저장 후, 다를 객체에서 데이터 출력


class ObjX5{
	public int x4;
	ObjX5(int x){
		x4 = x;
	}
	public static void printX(int intx){
		System.out.println("2번 객체의 값을 1번객체에서 출력 : "+intx);
	}
}

class ObjY5{
	public int y4;
	ObjY5(int y) {
		y4 = y;
	}
	public static void printY(int inty){
		System.out.println("1번 객체의 값을 2번 객체에서 출력 : "+inty);
	}
}

public class Test_1_5 {
	public static void main(String[] args) throws java.io.IOException{
		int a, b;
		System.out.print("1번 객체에 저장할 9이하의 자연수를 입력하시오 : ");
		a = System.in.read()-'0';
		System.in.skip(2);
		System.out.print("2번 객체에 저장할 9이하의 자연수를 입력하시오 : ");
		b = System.in.read()-'0';
		System.in.skip(2);
		
		ObjX5 x = new ObjX5(a);
		ObjY5 y = new ObjY5(b);
		
		x.printX(y.y4);
		y.printY(x.x4);
	}
}
