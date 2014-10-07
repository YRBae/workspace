package chapter2;
/**
 * *10진수를 16진수로 변환하는 메소드를 가진 클래스.
 */
public class Commentes {
	/**
	 * 10진수를 16진수로 변환한다.
	 * @param args 사용하지 않는다. 
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
