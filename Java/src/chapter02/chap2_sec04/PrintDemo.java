package chapter02.chap2_sec04;

public class PrintDemo {
    public static void main(String[] args) {
        int i = 97;
        String s = "Java"; // 대문자 S
        double f = 3.14f;
        System.out.printf("%d\n", i);
        System.out.printf("%o\n", i);
        System.out.printf("%x\n", i);
        System.out.printf("%c\n", i);
        System.out.printf("%5d\n", i);
        System.out.printf("%05d\n", i);
        System.out.printf("%s\n", s);
        System.out.printf("%5s\n", s);
        System.out.printf("%-5s\n", s);
        System.out.printf("%f\n", f);
        System.out.printf("%e\n", f);
        System.out.printf("%4.1f\n", f);
        System.out.printf("%04.1f\n", f);
        System.out.printf("%-4.1f\n", f);
    }
}