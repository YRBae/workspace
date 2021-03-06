package chapter5;
class Fraction19{
	private int numerator;
	private int denominator;
	
	Fraction19(int num, int denom){
		numerator = num;
		denominator = denom;
	}
	private int gcd(int x, int y){
		return (y!=0) ? gcd(y, x%y) : x;
	}
	private Fraction19 reduce(Fraction19 f){
		int divisor;
		divisor = gcd(f.numerator, f.denominator);
		f.numerator = f.numerator/ divisor;
		f.denominator= f.denominator/divisor;
		return f;
	}
	public Fraction19 add(Fraction19 f){
		numerator = numerator * f.denominator +f.numerator*denominator;
		denominator = denominator*f.denominator;
		return reduce(this);
	}
	public Fraction19 mul(Fraction19 f){
		numerator= numerator *f.numerator;
		denominator = denominator *f.denominator;
		return reduce(this);
	}
	public String toString(){
		String form = numerator +"/"+ denominator;
		return form;
	}
}
public class z19_FractionTest {
	public static void main(String[] args){
		Fraction19 f1 = new Fraction19(1,2);
		Fraction19 f2 = new Fraction19(3,4);
		
		f1 = f1.add(f2);
		f2 = f2.mul(f1);
		System.out.println("f1 = "+f1+", f2 = "+f2);
	}
}
