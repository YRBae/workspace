package test1;

class Num{
	int a, b;
	Num(){
		a = 1;
		b = 2;
	}
	public int num1(){
		return a;
	}
	public int num2(){
		return b;
	}
}

class Plus{
	public static int plus(int a, int b){
		int result;
		result = a+b;
		return result;
	}
}

class Min{
	public static int min(int a, int b){
		int result;
		result = a - b;
		return result;
		
	}
}

class Print{
	public static void print(String select, int result){
		if(select == "plus")
			System.out.println("a+b="+result);
		else if(select == "min")
			System.out.println("a-b="+result);
	}
}
public class Three {
	public static void main(String[] args) {
		Num a = new Num();
		Print.print("plus", Plus.plus(a.num1(), a.num2()));
		Print.print("min", Min.min(a.num1(), a.num2()));
	}
}
