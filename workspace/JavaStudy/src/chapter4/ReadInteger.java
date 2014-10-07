package chapter4;

public class ReadInteger {
    static   int   readInt() throws java.io.IOException   {
        char ch;
        int n = 0;
        
        while   (!Character.isDigit(ch= (char)System.in.read()))
              ;
        do   {
           n = n*10 + (ch - '0');
           ch = (char)System.in.read();
        }
        while (Character.isDigit(ch));
        return n;
    }
    public static void main   (String [] args) throws java.io.IOException   {
       System.out.print("*** input data : ");
       System.out.println("*** read data :" +readInt() + " " + readInt());        
    }
}
