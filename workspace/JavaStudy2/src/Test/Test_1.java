package Test;

//두 객체를 만들고 한 객체에 데이터를 저장 후 다른 객체에서 출력, 반대로 한 번더 출력.

//두 객체를 생성하고, 객체의 변수에 데이터를 저장 후 다른 객체의 static 메소드를 이용해 출력.
class ObjX{
	public int x;
	public static void printX(int prtN){
		System.out.println("1번 객체에서 2번 객체에 저장한 값 출력 : "+prtN);
	}
}

class ObjY{
	public int y;
	public static void printY(int prtN){
		System.out.println("2번 객체에서 1번 객체에 저장한 값 출력 : "+prtN);
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
