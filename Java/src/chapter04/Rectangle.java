package chapter04;

import java.util.Scanner;

public class Rectangle {
    int width, height;

    int getArea(){
        return width*height;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Rectangle re = new Rectangle();

        re.width = sc.nextInt();
        re.height = sc.nextInt();
        System.out.println("사각형의 면적은 " + re.getArea());

    }
}