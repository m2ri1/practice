package chapter04;

public class Circle {
    int r;

    double findArea() {
        return r*r*3.14;
    }
    public static void main(String[] args) {

        Circle c1 = new Circle();
        c1.r = 10;
       System.out.println(c1.findArea());

    }

}