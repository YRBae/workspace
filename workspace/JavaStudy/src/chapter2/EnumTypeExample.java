package chapter2;
enum Color{Red, Green, Blue}

public class EnumTypeExample {
		public static void main(String[] args){
			for (Color col : Color.values()){
				System.out.println(col);
			}
			Color c = Color.Red;
			System.out.println(c+"'s value is "+ c.ordinal());
			
			c=Color.valueOf("Blue");
			System.out.println(c + "'s value is " + c.ordinal());
			
			c=Color.valueOf("Yellow");
			System.out.println(c + "'s vale is "+c.ordinal());			
		}
}
