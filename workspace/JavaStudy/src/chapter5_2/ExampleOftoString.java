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
		System.out.println("�� �� "+numerator+"�� "+denominator+"�� ���� ��� ���� "+resul+"�Դϴ�.");
	}
	public void stringPrintD(double resul) {
		System.out.println("�� �� "+numerator+"�� "+denominator+"�� ���� ��� ���� "+resul+"�Դϴ�.");
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
			System.out.print("ù ��° ���ڸ� �Է��Ͻʽÿ� : ");
			n = readInt();
			System.in.skip(2);
			System.out.print("�� ��° ���ڸ� �Է��Ͻʽÿ� : ");
			d = readInt();
			System.in.skip(2);
			System.out.println();
			
			Fraction f = new Fraction(n, d);
			System.out.println("| �� ���� ���� |");
			System.out.println("�� ���� ���� : "+f.stringPlu()+f.toPlu());
			System.out.println("�� ���� ���� : "+f.stringMin()+f.toMin());
			System.out.println("�� ���� ���� : "+f.stringMul()+f.toMul());
			System.out.println("�� ���� ������ : "+f.stringDiv()+f.toDiv());
			System.out.println("�� ���� ������ : "+f.stringRem()+f.toRem());
			System.out.println();
			
			System.out.println("| ������ �������� ��� |");
			System.out.print("���� : ");
			f.stringPrintI(f.toPlu());
			System.out.print("���� : ");
			f.stringPrintI(f.toMin());
			System.out.print("���� : ");
			f.stringPrintI(f.toMul());
			System.out.print("������ : ");
			f.stringPrintD(f.toDiv());
			System.out.print("������ : ");
			f.stringPrintI(f.toRem());
			System.out.println();
			
			
			System.out.print("�ٽ� �����Ͻðڽ��ϱ�?(y|n) : ");
			c = (char)System.in.read();
			System.in.skip(2);
			System.out.println();
			System.out.println();
			
			
			if(c!='Y' & c!='y' & c!='N' & c!='n'){
				for(;;){
					System.out.println("�� �� �Է��Ͽ����ϴ�. �ٽ� �Է��Ͻʽÿ�");
					System.out.print("�ٽ� �����Ͻðڽ��ϱ�?(y|n) : ");
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
		System.out.println("�����մϴ�.");
	}

}