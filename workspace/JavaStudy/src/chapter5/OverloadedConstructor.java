package chapter5;

class Fraction2 {
	int numerator;
	int denominator;
	
	Fraction2() {
		numerator = 0;
		denominator = 1;
	}
	Fraction2(int num) {
		numerator = num;
		denominator = 1;
	}
	Fraction2(int num, int denom) {
		numerator = num;
		denominator = denom;
	}
	public String toString(){
		String form = numerator+"/"+denominator;
		return form;
	}
}

public class OverloadedConstructor {
	public static void main(String[] args) {
		Fraction2 f1 = new Fraction2();
		Fraction2 f2 = new Fraction2(2);
		Fraction2 f3 = new Fraction2(1, 2);
		System.out.println("f1 = "+f1+", f2 = "+f2+", f3 = "+f3);
	}
}
