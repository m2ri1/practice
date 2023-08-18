package chapter01_test;

import java.util.Scanner;

public class ExScannar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

/*        System.out.println("input number >>");
        int x = sc.nextInt();

        System.out.println("input number >>");
        int y = sc.nextInt();

        System.out.println(" X + Y = ", x+y);*/

        System.out.println("숫자를 입력하세요");
        int i = sc.nextInt();

        if ( i%2 == 0 ) {
            System.out.println("짝수");
        }
        else {
            System.out.println("홀수");
        }

        System.out.println( i%2==0 ? "짝수" : "홀수" );



    }
}
