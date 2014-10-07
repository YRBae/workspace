package chapter5;

import com.sun.org.apache.bcel.internal.generic.SIPUSH;

class Fraction {
	int numerator;
	int denominator;
	Fraction(int num, int denom) {
		numerator = num;
		denominator = denom;
	}
	public void printFraction() {
		System.out.println(numerator+"/"+denominator);
	}
}
public class SubPartOfFraction {
	public static void main(String[] args) throws java.io.IOException {
		int a, b;
 		System.out.print("분자를 입력하십시오 : ");
 		System.in.skip(2);
		a = System.in.read() - '0';
		System.out.print("분모를 입력하십시오 : ");
		System.in.skip(2);
		b = System.in.read() - '0';
		Fraction f = new Fraction(a, b);
		f.printFraction();
	}
}
