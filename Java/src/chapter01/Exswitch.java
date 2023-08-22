package chapter01;

import java.util.Scanner;

public class Exswitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kind = sc.next();
        switch (kind) {
            case "호랑이":
                System.out.println("호랑이입니다");
                break;

            case "사자":
                System.out.println("사자입니다");
                break;

            case "독수리":
                System.out.println("독수리입니다");
                break;

            default:
                System.out.println("이게모지...");


        }

      /*  System.out.print("input number >>");
        int num = sc.nextInt();

        switch (num) {
            case 3:
                System.out.print("*");

            case 2:
                System.out.print("*");

            case 1:
                System.out.print("*");

        }*/
    }
}
