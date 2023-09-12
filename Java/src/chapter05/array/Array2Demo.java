package chapter05.array;

import java.util.Scanner;

public class Array2Demo {
    public static void main(String[] args) {

        int[] number = new int[5];
        int max = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < number.length; i++) {
            number[i] = sc.nextInt();
            if (max < number[i]) max=number[i];

        }
        System.out.println(max);

    }
}
