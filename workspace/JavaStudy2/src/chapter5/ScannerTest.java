package chapter5;

import java.util.Scanner;

class Love { //�̸� �ٲ㺸��
	public String name1, name2;
	public void swap(Love name){
		String temp;
		temp = name1;
		name1 = name2;
		name2 = temp;
	}
	public void printLove(Love name){
		System.out.println(name.name1+"��"+name.name2);
	}
}

public class ScannerTest {
	public static void main(String[] args) throws java.io.IOException{
		Scanner scan = new Scanner(System.in);
		Love name = new Love();
		System.out.print("�ڽ��� ���� : ");
		name.name1 = scan.nextLine();
		System.out.print("���� ���� : ");
		name.name2 = scan.nextLine();
		
		name.printLove(name);
		
		name.swap(name);
		name.printLove(name);
		
	}
}
