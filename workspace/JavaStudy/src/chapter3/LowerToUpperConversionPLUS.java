package chapter3;

public class LowerToUpperConversionPLUS {
	public static void main(String[] args) throws java.io.IOException {
		char c;
		int x, z;
		
		for(;;) {
			System.out.print("Enter a lower char = ");
			c=(char)System.in.read();
			System.in.skip(2);
			if(c>='a' && c<='z')
				x=c+('A' - 'a');
			else if(c>='A' && c<='Z')
				x = c;
			else {
				System.out.println("Error! Try again!");
				continue;
			}
			System.out.println("Upper char of "+c+" = "+(char)x);
			System.out.println();
			//종료할 것인지 물어보는 if문
			System.out.print("You want Exit?(Y|N) ");
			z = System.in.read();
			System.in.skip(2);
			System.out.println();
			
			for(;;){
				if (z == 'y' || z=='Y'){
					System.out.println("See you again!");
					System.exit(0);
				}
				else if(z =='n' || z=='N'){
					System.out.println("Input!");
					break;
				}
				else {
					System.out.println("Error! Try again!");
					continue;
				}
			}
		}
	}
}
