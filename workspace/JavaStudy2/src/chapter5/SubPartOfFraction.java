package chapter5;

class Fraction {
	int numerator;
	int denominator;
	Fraction(int num, int denom) {
		numerator = num;
		denominator = denom;
	}
	public void printFraction() {
		System.out.println(numerator + "/" + denominator);
	}
}
class Error {
	static void printError() {
		System.out.println();
		System.out.println("ERROR!! Try again.");
	}
}

public class SubPartOfFraction {
	public static void main(String[] args) throws java.io.IOException {
		int a, b;
		for(;;){
			System.out.print("Input a numerator : ");
			a = System.in.read()-48;
			System.in.skip(2);
			if (a == -35){
				Error.printError();
				continue;
			}
			else 
				break;
		}
		
		for(;;){
			System.out.print("Input a denominator : ");
			b = System.in.read()-48;
			System.in.skip(2);
			if (b == -35){
				Error.printError();
				continue;
			}
			else
				break;
			};
				
		Fraction f = new Fraction(a, b);
		
		System.out.println();
		System.out.print("Result : ");
		f.printFraction();
	}
}