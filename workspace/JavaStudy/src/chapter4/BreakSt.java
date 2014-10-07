package chapter4;

public class BreakSt {
	public static void main(String[] args) throws java.io.IOException {
		int n, i;
	    double h = 0.0;
	      
	    System.out.print("Enter a number = ");
	    n = System.in.read() - '0';
	    i = 1;
	    while (true){
	       h = h + 1/ (double) i;
	       if (++i >n) break;
	    }
	    System.out.println("n = " + n + " , h = " + h);
	}
}
