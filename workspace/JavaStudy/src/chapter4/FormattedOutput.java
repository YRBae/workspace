package chapter4;

public class FormattedOutput {
   public static void main(String[] args) {
      System.out.printf("1, arg1) %3$2s %2$2s %1$2s\n", "a", "b", "c");
      
      boolean b = false;
      System.out.printf("2) %b %b %b\n", null, b, "a");
      System.out.printf("3) %h %h\n", null, b);
      System.out.printf("4) %s %s\n", null, b);
      System.out.printf("5) %1$d 0%1$o 0x%1$x\n", 3342);
      System.out.printf("6) %1$e %1$f %1$g %1$a\n", Math.PI);
      System.out.printf("7) %% %n");
   }
}