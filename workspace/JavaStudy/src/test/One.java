package test;


class Name{
	String name;
	Name(){
		name = "¹è¿ë·Ä";
	}
	public String toString(){
		return name;
	}
	
}
class Printn{
	public static void printName(Name str){
		System.out.println(str);
	}
}

public class One {
	public static void main(String[] args) {
		Name b = new Name();
		Printn.printName(b);
	}
}
