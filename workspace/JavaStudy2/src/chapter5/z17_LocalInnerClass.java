package chapter5;

public class z17_LocalInnerClass {
	public static void main(String[] args){
		class InnerClass {
			String str;
			InnerClass(String s){
				str = s;
			}
			void print(){
				System.out.println(str);
			}
		}
		
		String s = "Creating the local inner class object";
		InnerClass p = new InnerClass(s);
		p.print();
	}
}
