package chapter4;

public class SimplelO {
    public static void main (String [] args)   throws java.io.IOException   {
       int   i;   char c;
       System.out.print ("Enter a digit and a character = ");
       i = System.in.read()-48;
       c = (char) System.in.read();
       System.out.print("i = " + i);
       System.out.println(", c = " + c);
   }
}