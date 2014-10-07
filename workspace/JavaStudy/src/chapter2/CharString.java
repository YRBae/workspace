package chapter2;

public class CharString {
	public static void main(String[] args){
		char c='A';   //'A'<=>65
		int i;
		int d = 0x43;
		
		i = c+1;
		System.out.println("c = "+c+"\ni = "+(char)i+"\nd = "+(char)d);
		System.out.println("\"I am a string.\"");
	}
}