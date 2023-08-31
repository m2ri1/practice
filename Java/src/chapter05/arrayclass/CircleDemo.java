package chapter05.arrayclass;

class Circle {
    double r;

    Circle(double r) {
        this.r = r;
    }

    double findArea() {
        return r*r*3.14;
    }
}

public class CircleDemo {
    public static void main(String[] args) {
        Circle[] c = new Circle[5];
        for (int i = 0; i < c.length; i++) {
            c[i] = new Circle(i+1);

        }
        for (int i = 0; i < c.length; i++) {
            System.out.println("반지름 : " + c[i].r + " 일때 원의 넓이 : " + c[i].findArea());
        }
    }
}