package chapter2;
/**
 * *10������ 16������ ��ȯ�ϴ� �޼ҵ带 ���� Ŭ����.
 */
public class Commentes {
	/**
	 * 10������ 16������ ��ȯ�Ѵ�.
	 * @param args ������� �ʴ´�. 
	 * @throws java.io.IOExcetrion
	 */
	public static void main(String[] args) throws java.io.IOException {
		int value = 0;
		char ch;
		
		for(;;){
		System.out.print("Enter a super digit : ");//display prompt message
		ch =(char)System.in.read();
		switch (ch){
		case 'A':case 'B': case 'C': case 'D': case 'E': case 'F':
			value = ch - 'A' + 10; //code value =>binary value
			System.out.println(value);
			break;
		case 'a' : case 'b': case 'c': case 'd': case 'e': case 'f':
			value = ch - 'a' + 10;  //case value = >binary value
			System.out.println(value);
			break;
			default: System.out.println(ch+" is not a hexadigit");
			
		}}
	}
}
