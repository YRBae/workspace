package chapter4;

public class WhileSt { //h(n) = 1+1/2+1/3+...+1/n
    public static void main (String [] args) throws java.io.IOException   {
       int n, i;
       double h = 0.0;
       
       System.out.print("Enter a number = ");
       n = System.in.read() - '0';
       i = 1;
       while (i <= n) {
          h = h + 1/(double)i;
          ++i;
       }
       System.out.println ("n = "+n+", h = "+h);
    }
 }