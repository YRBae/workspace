package chapter5;

class Fraction1{
	int numerator;
	int denominator;
	
	Fraction1(int num, int denom) {
		numerator = num;
		denominator = denom;
	}
	public String toString(){
		String form = numerator + "/" + denominator;
		return form;
	}
}

public class ExampleOftoString {
	public static void main(String[] args) throws java.io.IOException {
		int a, b;
		a = System.in.read()-48;
		System.in.skip(2);
		b = System.in.read()-48;
		System.in.skip(2);
		Fraction1 f = new Fraction1(a,b);
		System.out.println("Implicit call = "+f);
		System.out.println("Explict call = "+f.toString());
	}
}
