package chapter5;
class Fraction0{
	int numerator;
	int denominator;
	
	Fraction0(){
		numerator = 0;
		denominator = 1;
	}
	Fraction0(int num){
		numerator = num;
		denominator= 1;
	}
	Fraction0(int num, int denom){
		numerator = num;
		denominator = denom;
	}
	public String toString(){
		String form = numerator + "/"+ denominator;
		return form;
	}
}
public class z10_OverloadedConstructor {
	public static void main(String[] args) {
		Fraction0 f1 = new Fraction0();
		Fraction0 f2 = new Fraction0(2);
		Fraction0 f3 = new Fraction0(1, 2);
		System.out.println("f1 = "+f1+", f2 = "+f2+", f3 = "+f3);
	}
}
