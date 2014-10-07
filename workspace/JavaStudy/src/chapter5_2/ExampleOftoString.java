package chapter5_2;


class Fraction {
	int numerator ;
	int denominator;
	double dresult;
	int iresult;
	
	Fraction(int num, int denom) {
		numerator = num;
		denominator = denom;
	}
	
	
	public String stringPlu() {
		String form = numerator+"+"+denominator+" = ";
		return form;
	}
	public String stringMin() {
		String form = numerator+"-"+denominator+" = ";
		return form;
	}
	public String stringMul() {
		String form = numerator+"*"+denominator+" = ";
		return form;
	}
	public String stringDiv() {
		String form = numerator+"/"+denominator+" = ";
		return form;
	}
	public String stringRem() {
		String form = numerator+"%"+denominator+" = ";
		return form;
	}
	
	
	public void stringPrintI(int resul) {
		System.out.println("두 수 "+numerator+"와 "+denominator+"의 연산 결과 값은 "+resul+"입니다.");
	}
	public void stringPrintD(double resul) {
		System.out.println("두 수 "+numerator+"와 "+denominator+"의 연산 결과 값은 "+resul+"입니다.");
	}
	
	public int toPlu() {
		iresult = numerator + denominator;                     
		return iresult;
	}
	public int toMin() {
		iresult = numerator - denominator;
		return iresult;
	}
	public double toDiv() {
		dresult = (float)numerator / (float)denominator;
		return dresult;
	}
	public int toMul() {
		iresult = numerator * denominator;
		return iresult;
	}
	public int toRem() {
		iresult = numerator % denominator;
		return iresult;
	}
}



public class ExampleOftoString {
	static int readInt() throws java.io.IOException {
		int nu=0;
		char ch;
		
		ch=(char)System.in.read();
		do {
			nu = nu*10 + (ch-'0');
			ch = (char)System.in.read();
			} while((int)ch != 13);
		return nu;
	}
		
	public static void main(String[] args) throws java.io.IOException {
		int n, d;
		char c;
		do{
			System.out.print("첫 번째 숫자를 입력하십시오 : ");
			n = readInt();
			System.in.skip(2);
			System.out.print("두 번째 숫자를 입력하십시오 : ");
			d = readInt();
			System.in.skip(2);
			System.out.println();
			
			Fraction f = new Fraction(n, d);
			System.out.println("| 두 수의 연산 |");
			System.out.println("두 수의 덧셈 : "+f.stringPlu()+f.toPlu());
			System.out.println("두 수의 뺄셈 : "+f.stringMin()+f.toMin());
			System.out.println("두 수의 곱셈 : "+f.stringMul()+f.toMul());
			System.out.println("두 수의 나눗셈 : "+f.stringDiv()+f.toDiv());
			System.out.println("두 수의 나머지 : "+f.stringRem()+f.toRem());
			System.out.println();
			
			System.out.println("| 연산의 서술형태 출력 |");
			System.out.print("덧셈 : ");
			f.stringPrintI(f.toPlu());
			System.out.print("뺄셈 : ");
			f.stringPrintI(f.toMin());
			System.out.print("곱셈 : ");
			f.stringPrintI(f.toMul());
			System.out.print("나눗셈 : ");
			f.stringPrintD(f.toDiv());
			System.out.print("나머지 : ");
			f.stringPrintI(f.toRem());
			System.out.println();
			
			
			System.out.print("다시 실행하시겠습니까?(y|n) : ");
			c = (char)System.in.read();
			System.in.skip(2);
			System.out.println();
			System.out.println();
			
			
			if(c!='Y' & c!='y' & c!='N' & c!='n'){
				for(;;){
					System.out.println("잘 못 입력하였습니다. 다시 입력하십시오");
					System.out.print("다시 실행하시겠습니까?(y|n) : ");
					c = (char)System.in.read();
					System.in.skip(2);
					System.out.println();
					
					if(c=='Y' | c=='y' | c=='N' | c=='n'){
						System.out.println();
						System.out.println();
						break;
					}
				}
			}
		} while(c=='Y' | c=='y');
		System.out.println("종료합니다.");
	}

}