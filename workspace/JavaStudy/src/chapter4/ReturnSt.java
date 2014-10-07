package chapter4;

public class ReturnSt {
    public static void main (String [] args) throws java.io.IOException {
       int   n;   double h;
       System.out.print("Enter a number = ");
       n   =   System.in.read() - '0';
       System.out.println("n = " + n + " , h = " + h (n));
    }
    public static double h (int n)   {
       double hx = 0.0;
       if (n <= 0) return 0.0;
       while (true) {
          hx = hx + 1 /   (double) n;
          if (--n <= 0) break;
       }
       return hx;
    }
 }