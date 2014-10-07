package chapter3;

public class AssignmentOperators {
	public static void main(String[] args) {
		int x, y=2;
		
		x=10;
		x+=y;
		System.out.print("\t1. x = "+x+", ");
		x=10;
		x-=y;
		System.out.print("\t2. x = "+x+", ");
		x=10;
		x*=y;
		System.out.print("\t3. x = "+x+", ");
		x=10;
		x/=y;
		System.out.print("\t4. x = "+x+", ");
		x=10;
		x%=y;
		System.out.println("\t5. x = "+x);
		
		x=10;
		x&=y;
		System.out.print("\t6. x = "+x+", ");
		x=10;
		x|=y;
		System.out.print("\t7. x = "+x+", ");
		x=10;
		x^=y;
		System.out.print("\t8. x = "+x+", ");
		x=10;
		x<<=y;
		System.out.print("\t9. x = "+x+", ");
		x=10;
		x>>=y;
		System.out.print("\t10. x = "+x+", ");
		x=10;
		x>>>=y;
		System.out.println("\t11. x = "+x);
		}
}
