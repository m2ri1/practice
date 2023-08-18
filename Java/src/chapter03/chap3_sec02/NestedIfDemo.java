package chapter03.chap3_sec02;

import java.util.Scanner;

public class NestedIfDemo {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int score = sc.nextInt();
    String grade;

    if (score >= 90) {
      grade = "A";
    } else {
      if (score >= 80)
        grade = "B";
        else {
        if (score >= 70)
          grade = "C";
        else {
          if (score >= 60)
            grade = "D";
           else {
            if (score >= 50)
              grade = "E";
            else {
              grade = "F";
            }
          }
        }

        System.out.println("당신의 학점 : " + grade);
      }
    }

  }

}
