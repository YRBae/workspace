package Test;

import java.util.Scanner;

class PrintString{
	
}

class Calculator{
	int i;
	float f;
	double d;
	void resultPrint(int a, char c, int b){
		switch (c) {
		case '+':
			i = a+b;
			System.out.println(a+"+"+b+"�� ����� "+i+"�Դϴ�.");
			break;
		case '-':
			i = a-b;
			System.out.println(a+"-"+b+"�� ����� "+i+"�Դϴ�.");
			break;
		case '/':
			i = a/b;
			System.out.println(a+"/"+b+"�� ����� "+i+"�Դϴ�.");
			break;
		case '*':
			i = a*b;
			System.out.println(a+"*"+b+"�� ����� "+i+"�Դϴ�.");
			break;
		case '%':
			i = a%b;
			System.out.println(a+"%"+b+"�� ����� "+i+"�Դϴ�.");
			break;
		default:
			System.out.println("������ ���� �߸��Ǿ����ϴ�.");
			break;
		}
	}
	void resultPrint(char a, char c, char b){
		switch (c) {
		case '+':
			i = (int)a+(int)b;
			System.out.println(a+"+"+b+"�� ����� "+(char)i+"�Դϴ�");
			break;
		case '-':
			i = a-b;
			System.out.println(a+"-"+b+"�� ����� "+(char)i+"�Դϴ�");
			break;
		case '/':
			i = a/b;
			System.out.println(a+"/"+b+"�� ����� "+(char)i+"�Դϴ�");
			break;
		case '*':
			i = a*b;
			System.out.println(a+"*"+b+"�� ����� "+(char)i+"�Դϴ�");
			break;
		case '%':
			d = a%b;
			System.out.println(a+"%"+b+"�� ����� "+d+"�Դϴ�.");
			break;
		default:
			System.out.println("������ ���� �߸��Ǿ����ϴ�.");
			break;
		}
	}
	void resultPrint(float a, char c, float b){
		switch (c) {
		case '+':
			f = a+b;
			System.out.println(a+"+"+b+"�� ����� "+f+"�Դϴ�.");
			break;
		case '-':
			f = a-b;
			System.out.println(a+"-"+b+"�� ����� "+f+"�Դϴ�.");
			break;
		case '/':
			f = a/b;
			System.out.println(a+"/"+b+"�� ����� "+f+"�Դϴ�.");
			break;
		case '*':
			f = a*b;
			System.out.println(a+"*"+b+"�� ����� "+f+"�Դϴ�.");
			break;
		case '%':
			d = a%b;
			System.out.println(a+"%"+b+"�� ����� "+d+"�Դϴ�.");
			break;
		default:
			System.out.println("������ ���� �߸��Ǿ����ϴ�.");
			System.out.println("�ٽ� �Է��Ͻʽÿ�.");
			break;
		}
	}
	void resultPrint(double a, char c, double b){
		switch (c) {
		case '+':
			d = a+b;
			System.out.println(a+"+"+b+"�� ����� "+d+"�Դϴ�.");
			break;
		case '-':
			d = a-b;
			System.out.println(a+"-"+b+"�� ����� "+d+"�Դϴ�.");
			break;
		case '/':
			d = a/b;
			System.out.println(a+"/"+b+"�� ����� "+d+"�Դϴ�.");
			break;
		case '*':
			d = a*b;
			System.out.println(a+"*"+b+"�� ����� "+d+"�Դϴ�.");
			break;
		case '%':
			d = a%b;
			System.out.println(a+"%"+b+"�� ����� "+d+"�Դϴ�.");
			break;
		default:
			System.out.println("������ ���� �߸��Ǿ����ϴ�.");
			System.out.println("�ٽ� �Է��Ͻʽÿ�.");
			break;
		}
	}
	void resultPrint(String a, String b){
		String c = a+b;
		System.out.println("a+b�� ����� "+c+"�Դϴ�.");
	}
}

class Select{
	int i, ii, iii;
	char c, cc, ccc;
	float f, ff;
	double d, dd;
	String s, ss;
	void inPut() throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("1. ������");
		System.out.println("2. ������");
		System.out.println("3. �Ǽ���(�Ҽ��� ���� 7�ڸ�)");
		System.out.println("4. �Ǽ���(�Ҽ��� ���� 14�ڸ�)");
		System.out.println("5. �����ڿ�(+�� ����)");
		System.out.print("������ ����� ���¸� �Է��Ͻʽÿ� : ");
		iii = System.in.read()-'0';
		System.in.skip(2);
		switch (iii) {
		case 1:
			System.out.println("������ ����Դϴ�.");
			System.out.print("ù ��° �� : ");
			i = scan.nextInt();
			System.out.print("������ : ");
			ccc = (char)System.in.read();
			System.out.print("�� ��° �� : ");
			ii = scan.nextInt();
			break;
		case 2:
			System.out.println("������ ����Դϴ�.");
			System.out.print("ù ��° �� : ");
			c = (char)System.in.read();
			System.in.skip(2);
			System.out.print("������ : ");
			ccc = (char)System.in.read();
			System.in.skip(2);
			System.out.print("�� ��° �� : ");
			cc = (char)System.in.read();
			System.in.skip(2);
			break;
		case 3:
			System.out.println("�Ǽ���(f) ����Դϴ�.");
			System.out.print("ù ��° �� : ");
			f = scan.nextFloat();
			System.out.print("������ : ");
			ccc = (char)System.in.read();
			System.out.print("�� ���� �� : ");
			ff = scan.nextFloat();
			break;
		case 4:
			System.out.println("�Ǽ���(d) ����Դϴ�.");
			System.out.print("ù ��° �� : ");
			d = scan.nextDouble();
			System.out.print("������ : ");
			ccc = (char)System.in.read();
			System.out.print("�� ���� �� : ");
			dd = scan.nextDouble();
			break;
		case 5:
			System.out.println("�����ڿ� + ����Դϴ�.");
			System.out.print("ù ��° �� : ");
			s = scan.nextLine();
			System.out.print("�� ��° �� : ");
			ss = scan.nextLine();
			break;
		default:
			System.out.println("�߸��� �����Դϴ�.");
			System.out.println("�ٽ� �Է��Ͻʽÿ�.");
			System.out.println("");
			break;
		}
	}
}

public class Test_2 {
	public static void main(String[] args) throws java.io.IOException{
		Select sel = new Select();
		Calculator cal = new Calculator();

		for(;;){
			sel.inPut();
			if(sel.iii == 1){
				cal.resultPrint(sel.i, sel.ccc, sel.ii);
				System.out.println();
			}
			else if(sel.iii == 2){
				cal.resultPrint(sel.c, sel.ccc, sel.cc);
				System.out.println();
			}
			else if(sel.iii == 3){
				cal.resultPrint(sel.f, sel.ccc, sel.ff);
				System.out.println();
			}
			else if(sel.iii == 4){
				cal.resultPrint(sel.d, sel.ccc, sel.dd);
				System.out.println();
			}
			else if(sel.iii == 5){
				cal.resultPrint(sel.s,  sel.ss);
				System.out.println();
			}
		}
	}
}