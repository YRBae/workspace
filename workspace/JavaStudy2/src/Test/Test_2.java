package Test;

import java.util.Scanner;

class PrintString{
	
}

class Calculator{
	int i;
	float f;
	double d;
	String c;
	void resultPrint(int a, char c, int b){
		switch (c) {
		case '+':
			i = a+b;
			System.out.println(a+"+"+b+"의 결과는 "+i+"입니다.");
			break;
		case '-':
			i = a-b;
			System.out.println(a+"-"+b+"의 결과는 "+i+"입니다.");
			break;
		case '/':
			i = a/b;
			System.out.println(a+"/"+b+"의 결과는 "+i+"입니다.");
			break;
		case '*':
			i = a*b;
			System.out.println(a+"*"+b+"의 결과는 "+i+"입니다.");
			break;
		case '%':
			i = a%b;
			System.out.println(a+"%"+b+"의 결과는 "+i+"입니다.");
			break;
		default:
			System.out.println("연산자 값이 잘못되었습니다.");
			break;
		}
	}
	void resultPrint(char a, char c, char b){
		switch (c) {
		case '+':
			i = (int)a+(int)b;
			System.out.println(a+"+"+b+"의 결과는 "+(char)i+"입니다");
			break;
		case '-':
			i = a-b;
			System.out.println(a+"-"+b+"의 결과는 "+(char)i+"입니다");
			break;
		case '/':
			i = a/b;
			System.out.println(a+"/"+b+"의 결과는 "+(char)i+"입니다");
			break;
		case '*':
			i = a*b;
			System.out.println(a+"*"+b+"의 결과는 "+(char)i+"입니다");
			break;
		case '%':
			d = a%b;
			System.out.println(a+"%"+b+"의 결과는 "+d+"입니다.");
			break;
		default:
			System.out.println("연산자 값이 잘못되었습니다.");
			break;
		}
	}
	void resultPrint(float a, char c, float b){
		switch (c) {
		case '+':
			f = a+b;
			System.out.println(a+"+"+b+"의 결과는 "+f+"입니다.");
			break;
		case '-':
			f = a-b;
			System.out.println(a+"-"+b+"의 결과는 "+f+"입니다.");
			break;
		case '/':
			f = a/b;
			System.out.println(a+"/"+b+"의 결과는 "+f+"입니다.");
			break;
		case '*':
			f = a*b;
			System.out.println(a+"*"+b+"의 결과는 "+f+"입니다.");
			break;
		case '%':
			d = a%b;
			System.out.println(a+"%"+b+"의 결과는 "+d+"입니다.");
			break;
		default:
			System.out.println("연산자 값이 잘못되었습니다.");
			System.out.println("다시 입력하십시오.");
			break;
		}
	}
	void resultPrint(double a, char c, double b){
		switch (c) {
		case '+':
			d = a+b;
			System.out.println(a+"+"+b+"의 결과는 "+d+"입니다.");
			break;
		case '-':
			d = a-b;
			System.out.println(a+"-"+b+"의 결과는 "+d+"입니다.");
			break;
		case '/':
			d = a/b;
			System.out.println(a+"/"+b+"의 결과는 "+d+"입니다.");
			break;
		case '*':
			d = a*b;
			System.out.println(a+"*"+b+"의 결과는 "+d+"입니다.");
			break;
		case '%':
			d = a%b;
			System.out.println(a+"%"+b+"의 결과는 "+d+"입니다.");
			break;
		default:
			System.out.println("연산자 값이 잘못되었습니다.");
			System.out.println("다시 입력하십시오.");
			break;
		}
	}
	void resultPrint(String a, String b){
		c = a+b;
		System.out.println("a+b의 결과는 "+c+"입니다.");
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
		System.out.println("1. 정수형");
		System.out.println("2. 문자형");
		System.out.println("3. 실수형(소수점 이하 7자리)");
		System.out.println("4. 실수형(소수점 이하 14자리)");
		System.out.println("5. 영문자열(+만 가능)");
		System.out.print("수행할 계산의 형태를 입력하십시오 : ");
		iii = System.in.read()-'0';
		System.in.skip(2);
		switch (iii) {
		case 1:
			System.out.println("정수형 계산입니다.");
			System.out.print("첫 번째 값 : ");
			i = scan.nextInt();
			System.out.print("연산자 : ");
			ccc = (char)System.in.read();
			System.out.print("두 번째 값 : ");
			ii = scan.nextInt();
			break;
		case 2:
			System.out.println("문자형 계산입니다.");
			System.out.print("첫 번째 값 : ");
			c = (char)System.in.read();
			System.in.skip(2);
			System.out.print("연산자 : ");
			ccc = (char)System.in.read();
			System.in.skip(2);
			System.out.print("두 번째 값 : ");
			cc = (char)System.in.read();
			System.in.skip(2);
			break;
		case 3:
			System.out.println("실수형(f) 계산입니다.");
			System.out.print("첫 번째 값 : ");
			f = scan.nextFloat();
			System.out.print("연산자 : ");
			ccc = (char)System.in.read();
			System.out.print("두 번재 값 : ");
			ff = scan.nextFloat();
			break;
		case 4:
			System.out.println("실수형(d) 계산입니다.");
			System.out.print("첫 번째 값 : ");
			d = scan.nextDouble();
			System.out.print("연산자 : ");
			ccc = (char)System.in.read();
			System.out.print("두 번재 값 : ");
			dd = scan.nextDouble();
			break;
		case 5:
			System.out.println("영문자열 + 계산입니다.");
			System.out.print("첫 번째 값 : ");
			s = scan.nextLine();
			System.out.print("두 번째 값 : ");
			ss = scan.nextLine();
			break;
		default:
			System.out.println("잘못된 선택입니다.");
			System.out.println("다시 입력하십시오.");
			System.out.println("");
			break;
		}
	}
}
class AddSelect extends Select{
	void addInput(int i, float f, double d, String s, int iii) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		switch (iii) {
		case 1:
			this.i = i;
			System.out.print("연산자 or 종료(n|N) : ");
			ccc = (char)System.in.read();
			if (ccc == 'n' || ccc =='N')
				break;
			System.out.print("두 번째 값 : ");
			ii = scan.nextInt();
			break;
		case 2:
			this.c = (char)i;
			System.out.print("연산자 or 종료(n|N) : ");
			ccc = (char)System.in.read();
			System.in.skip(2);
			if (ccc == 'n' || ccc =='N')
				break;
			System.out.print("두 번째 값 : ");
			cc = (char)System.in.read();
			System.in.skip(2);
			break;
		case 3:
			this.f = f;
			System.out.print("연산자 or 종료(n|N) : ");
			ccc = (char)System.in.read();
			if (ccc == 'n' || ccc =='N')
				break;
			System.out.print("두 번재 값 : ");
			ff = scan.nextFloat();
			break;
		case 4:
			this.d = d;
			System.out.print("연산자 or 종료(n|N) : ");
			ccc = (char)System.in.read();
			if (ccc == 'n' || ccc =='N')
				break;
			System.out.print("두 번재 값 : ");
			dd = scan.nextDouble();
			break;
		case 5:
			this.s = s;
			System.out.print("계속(아무키나 입력) or 종료(n|N : ");
			ccc = (char)System.in.read();
			System.in.skip(2);
			if (ccc == 'n' || ccc =='N')
				break;
			System.out.print("두 번째 값 : ");
			ss = scan.nextLine();
			break;
		case 6:
			System.out.println("계산 완료!");
			break;
		default:
			System.out.println("잘못된 선택입니다.");
			System.out.println("다시 입력하십시오.");
			System.out.println("");
			break;
		}
	}
}

public class Test_2 {
	public static void main(String[] args) throws java.io.IOException{
		Select sel = new Select();
		AddSelect addsel = new AddSelect();
		Calculator cal = new Calculator();

		for(;;){
			sel.inPut();
			if(sel.iii == 1){
				cal.resultPrint(sel.i, sel.ccc, sel.ii);
				for(;;){
					addsel.addInput(cal.i, cal.f, cal.d, cal.c, sel.iii);
					if (addsel.ccc == 'n' || addsel.ccc =='N')
						break;
					cal.resultPrint(addsel.i, addsel.ccc, addsel.ii);
				}
				System.out.println();
			}
			else if(sel.iii == 2){
				cal.resultPrint(sel.c, sel.ccc, sel.cc);
				for(;;){
					addsel.addInput(cal.i, cal.f, cal.d, cal.c, sel.iii);
					if (addsel.ccc == 'n' || addsel.ccc =='N')
						break;
					cal.resultPrint(addsel.c, addsel.ccc, addsel.cc);
				}
				System.out.println();
			}
			else if(sel.iii == 3){
				cal.resultPrint(sel.f, sel.ccc, sel.ff);
				for(;;){
					addsel.addInput(cal.i, cal.f, cal.d, cal.c, sel.iii);
					if (addsel.ccc == 'n' || addsel.ccc =='N')
						break;
					cal.resultPrint(addsel.f, addsel.ccc, addsel.ff);
				}
				System.out.println();
			}
			else if(sel.iii == 4){
				cal.resultPrint(sel.d, sel.ccc, sel.dd);
				for(;;){
					addsel.addInput(cal.i, cal.f, cal.d, cal.c, sel.iii);
					if (addsel.ccc == 'n' || addsel.ccc =='N')
						break;
					cal.resultPrint(addsel.d, addsel.ccc, addsel.dd);
				}
				System.out.println();
			}
			else if(sel.iii == 5){
				cal.resultPrint(sel.s,  sel.ss);
				for(;;){
					addsel.addInput(cal.i, cal.f, cal.d, cal.c, sel.iii);
					if (addsel.ccc == 'n' || addsel.ccc =='N')
						break;
					cal.resultPrint(addsel.s, addsel.ss);
				}
				System.out.println();
			}
		}
	}
}