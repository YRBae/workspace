package chapter6;
interface BaseColors10 {
	int RED = 1,GREEN = 2, BLUE = 4;
	void setColor(int color);
	int getColor();
}
abstract class SetColor10 implements BaseColors10 {
	protected int color;
	public void setColor(int color) {
		this.color = color;
		System.out.println("in the setColor method ...");
	}
}
class Color10 extends SetColor10 {
	public int getColor(){
		System.out.println("in the get Color method ...");
		return color;
	}
}
public class c6_10_ImplementingInterface {
	public static void main(String[] args) {
		Color10 c = new Color10();
		int i;
		c.setColor(10);
		i = c.getColor();
		System.out.println("in the main method ...");
	}
}
