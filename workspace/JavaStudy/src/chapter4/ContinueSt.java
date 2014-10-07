package chapter4;

public class ContinueSt {
    public static void main (String [] args) throws java.io.IOException{
       int n, s, i;
       
       System.out.print("Enter a number = ");
       for (;;) {
          n = System.in.read () - '0' ;
          if (n == 0) break;
          else if (n<0) continue;
          for (s=0, i=1; i<=n; ++i)
             s += i;
          System.out.println("n = " + n + " , sum = " + s);
          
       }
       System.out.println ("End of Main");
    }
 }