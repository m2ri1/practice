package chap3_sec02;

import java.util.Scanner;

public class MultiFIDemo {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String grade;

    System.out.print("점수를 입력하세요 : ");
    int score = sc.nextInt();

    if (score >= 90) {
      grade = "A";
    } else if (score >= 80) {
      grade = "B";
    } else if (score >= 70) {
      grade = "C";
    } else if (score >= 60) {
      grade = "D";
    } else if (score >= 50) {
      grade = "E";
    } else {
      grade = "F";
    }
    System.out.println("당신의 학점 : "
        + grade);

  }

}
