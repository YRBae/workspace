package Test;

//두 객체를 생성하면서 객체의 변수에 저장할 수를 넘겨주고, 다른 객체의 static메소드를 이용해 출력.

class ObjX2{
	public int x;
	public static void printX(int prtN){
		System.out.println("1번 객체에서 2번 객체에 저장한 값 출력 : "+prtN);
	}
}

class ObjY2{
	public int y;
	public static void printY(int prtN){
		System.out.println("2번 객체에서 1번 객체에 저장한 값 출력 : "+prtN);
	}
}

public class Test_1_2 {
	public static void main(String[] args) throws java.io.IOException{
		ObjX2 a = new ObjX2();
		ObjY2 b = new ObjY2();
		
		System.out.print("1번 객체에 저장할 9이하의 자연수를 입력하시오 : ");
		a.x = System.in.read()-'0';
		System.in.skip(2);
		System.out.println("2번 객체에 저장할 9이하의 자연수를 입력하시오 : ");
		b.y = System.in.read()-'0';
		System.in.skip(2);
		
		b.printY(a.x);
		a.printX(b.y);
	}
}
