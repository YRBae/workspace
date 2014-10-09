package chapter6;
interface BaseColors {
	int RED = 1;
	int GREEN = 2;
	int BLUE = 4;
}
interface ExtendedColors extends BaseColors {
	int RED = 1;
	int BLUE = 3;
	int YELLOW = 5;
}
public class c6_9_InterfaceNameConflict implements ExtendedColors{
	public static void main(String[] args) {
		System.out.println("RED                 = "+RED);
		System.out.println("GREEN               = "+GREEN);
		System.out.println("BLUE                = "+BLUE);
		System.out.println("BaseColors.BLUE     = "+BaseColors.BLUE);
		System.out.println("ExtendedColors.BLUE = "+ExtendedColors.BLUE);
		System.out.println("YELLOW              = "+YELLOW);
	}
}
