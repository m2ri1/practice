package chapter01_test;

import java.util.Scanner;

public class ExFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("두 수를 입력하세요");
        int i = sc.nextInt();
        int j = sc.nextInt();
        int a =0, b= 0;
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        for (; i <= j; i++) {
            for (int x = 1; x < 10; x++) {
                System.out.println(i + " * " + x + " = " + i * x);
            }
            System.out.println( );
        }


    }
}
