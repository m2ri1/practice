package chapter03.chap3_sec02;

import java.util.Scanner;

public class IfElseDemo {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("숫자를 입력하세요! : ");
    int number = sc.nextInt();

    if (number % 2 == 0) {
      System.out.println("짝수!");
    } else {
      System.out.println("홀수!");

    }
    System.out.println("종료!");
  }

}
