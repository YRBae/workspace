package chapter4;

public class FormattedFlagOutput {
    public static void main(String[] args) {
       System.out.printf("1) %-10d\n", 2260);
       System.out.printf("2) %#o %#x\n", 2260, 3342);
       System.out.printf("3) %+d\n", 2260);
       System.out.printf("4) % 10d\n", 2260);
       System.out.printf("5) %010d\n", 2260);
       System.out.printf("6) %,d\n", 2260);
       System.out.printf("7) %(d\n", -2260);
    }

 }