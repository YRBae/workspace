package chapter6;
class SuperClass6 {
	static String greeting(){
		return "Good Bye";
		}
	String name() {
		return "Oak";
	}
}
class SubClass6 extends SuperClass6 {
	static String greeting(){
		return "Hello";
	}
	String name(){
		return "Java";
	}
}
public class c6_5_HiddenMethod {
	public static void main(String[] args){
		SuperClass6 s = new SubClass6();
		System.out.println(s.greeting() +", "+s.name());
	}
}
