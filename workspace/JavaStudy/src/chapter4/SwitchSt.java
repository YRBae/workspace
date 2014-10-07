package chapter4;

public class SwitchSt {
	public static void main(String[] args) throws java.io.IOException{
		int day;
		
		System.out.print("Enter the day number 1~7: ");
		day = System.in.read() - '0';
		switch(day) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
			default:
				System.out.println("Illegal day");

		}
	}
}
