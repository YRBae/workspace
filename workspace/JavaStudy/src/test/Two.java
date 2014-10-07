package test;

class Plus{
	int a, b;
	float af, bf;
	double ad, bd;
	int[] num;
	
	Plus() {
		a = 1;
		b = 2;
	}
	Plus(int num, int num2){
		a = num;
		b = num2;
	}
	Plus(float num, float num2){
		af = num;
		bf = num2;
	}
	Plus(double num, double num2){
		ad = num;
		bd = num2;
	}
	Plus(int... args){
		num = args;
	}
	public static void result(String str,int... plu){
		int sum = 0;
		for(int i:plu)
			sum += i;
		System.out.println(str+sum);
	}
	public int resultInt(){
		int sum = 0;
		for(int i:num)
			sum += i;
		return sum;
	}
	public int result(){
		int result = a+b;
		return result;
	}
	public float resultf(){
		float resultf = af+bf;
		return resultf;
	}
	public double resultd(){
		double resultd = ad+bd;
		return resultd;
	}
	public void resultPrint(String str, int result){
		System.out.println(str+result);
	}
	public void resultPrint(String str, float result){
		System.out.println(str+result);
	}
	public void resultPrint(String str, double result){
		System.out.println(str+result);
	}
}

public class Two {
	public static void main(String[] args) {
		Plus a = new Plus();
		Plus c = new Plus(1, 2);
		Plus d = new Plus(1.0f, 2.0f);
		Plus e = new Plus(1.0d, 2.0d);	
		Plus f = new Plus(10, 20, 30, 40, 50);
		a.resultPrint("1+2=", a.result());
		c.resultPrint("1+2=", c.result());		
		d.resultPrint("1.0f+2.0f=", d.resultf());		
		e.resultPrint("1.0d+2.0d=", e.resultd());
		f.resultPrint("10+20+30+40+50=", f.resultInt());
		Plus.result("10+20+30+40+50=", 10, 20, 30, 40, 50);
	}
}
