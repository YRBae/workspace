package chapter5;

import java.util.Scanner;

class Love { //이름 바꿔보기
	public String name1, name2;
	public void swap(Love name){
		String temp;
		temp = name1;
		name1 = name2;
		name2 = temp;
	}
	public void printLove(Love name){
		System.out.println(name.name1+"♥"+name.name2);
	}
}

public class ScannerTest {
	public static void main(String[] args) throws java.io.IOException{
		Scanner scan = new Scanner(System.in);
		Love name = new Love();
		System.out.print("자신의 성명 : ");
		name.name1 = scan.nextLine();
		System.out.print("상대방 성명 : ");
		name.name2 = scan.nextLine();
		
		name.printLove(name);
		
		name.swap(name);
		name.printLove(name);
		
	}
}
