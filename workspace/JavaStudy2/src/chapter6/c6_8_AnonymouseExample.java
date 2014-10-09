package chapter6;
class AnonymouseClass {
	public void print() {
		System.out.println("This is AnonymTest Class.");
	}
}
public class c6_8_AnonymouseExample {
	public static void methodA(AnonymouseClass obj){
		obj.print();
	}
	public static void main(String[] args) {
		methodA(new AnonymouseClass() {
			public void print(){
				System.out.println("This is redefined by Anonymouse Example.");
			}
		});
	}
}
