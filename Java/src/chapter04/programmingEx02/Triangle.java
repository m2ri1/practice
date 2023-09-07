package chapter04.programmingEx02;

public class Triangle {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    double findArea() {
        return base*height/2;
    }

    boolean isSameArea(Triangle triangle) {
         return this.findArea() == triangle.findArea();

    }
}
