package chapter05.arrary;

import java.util.Scanner;

public class Array3Demo {
    public static void main(String[] args) {
        System.out.println("5개의 정수를 입력하세요");
        int[] number = new int[5];
        double total = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < number.length; i++) {
            number[i] = sc.nextInt();
            total += number[i];
        }
        System.out.println("평균은 " + total/number.length);
    }
}
