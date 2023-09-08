package chapter05.arrary;

import java.util.Scanner;

public class Array1Demo {
    public static void main(String[] args) {
        int[] scores = {100, 88, 99, 97, 100};
        for (int i = 0; i<scores.length; i++) {
            System.out.print(scores[i] + " ");
        }

        for (int i : scores) {
            System.out.println(i);

        }

        Scanner sc = new Scanner(System.in);

        double[] grade = new double[5];
        for (int i = 0; i < grade.length; i++) {
            grade[i] = sc.nextDouble();
        }

        for (int i = 0; i < grade.length; i++) {
            System.out.println(grade[i]);

        }
    }
}
