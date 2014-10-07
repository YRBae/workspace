package chapter4;

public class CopyInputToOutput {
   public static void main(String[] args) throws java.io.IOException {
      int c;
      
      while((c = System.in.read()) != -1)
         System.out.write(c);
   }
}