package chapter01;

import java.util.Scanner;

public class ExIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("점수를 입력하세요");
        int i = sc.nextInt();
        if (i>=90) {
            System.out.println("A");
        }
        else if (i>=80) {
            System.out.println("B");
        }
        else if (i>=70) {
            System.out.println("C");
        }
        else if (i>=60) {
            System.out.println("D");
        }
        else System.out.println("E");
    }
}