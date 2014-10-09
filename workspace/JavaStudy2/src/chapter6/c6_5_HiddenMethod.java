package chapter6;
class SuperClass5 {
	static String greeting(){
		return "Good Bye";
		}
	String name() {
		return "Oak";
	}
}
class SubClass5 extends SuperClass5 {
	static String greeting(){
		return "Hello";
	}
	String name(){
		return "Java";
	}
}
public class c6_5_HiddenMethod {
	public static void main(String[] args){
		SuperClass5 s = new SubClass5();
		System.out.println(s.greeting() +", "+s.name());
	}
}
