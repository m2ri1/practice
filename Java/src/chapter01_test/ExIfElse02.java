package chapter01_test;

import java.util.Scanner;

public class ExIfElse02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("점수를 입력하세요");
        int i = sc.nextInt();
        char c;
        if(i >= 90){
            c = 'A';
        }
        else {
            if(i >= 80){
                c = 'B';
            }
            else {
                if(i >= 70){
                    c = 'C';
                }
                else {
                    if (i>= 60) {
                        c = 'D';
                    }
                    c = 'E';
                }
            }
        }
        System.out.println("당신의 성적은 " + c);

    } // end main
} //end class