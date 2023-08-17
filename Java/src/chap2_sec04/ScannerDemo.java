package chap2_sec04;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner 객체 생성
        int x, y;
        x = sc.nextInt();
        y = sc.nextInt();
        System.out.println("입력한 두 수는 " + x + "," + y);
    }
}