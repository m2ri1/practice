package miratest;

public class Triangle {

    double under, high;

    public Triangle(double under, double high) {
        this.under = under;
        this.high = high;
    }

    double findArea() {
        return under * high / 2;
    }

    Boolean isSameArea(Triangle t) {
        return findArea() == t.findArea();

    }
}

class TriangleTest {
    public static void main(String[] args) {
        Triangle t = new Triangle(10.0, 5.0);
        System.out.println(t.findArea());

        Triangle t1 = new Triangle(10.0, 5.0);
        Triangle t2 = new Triangle(10.0, 10.0);
        Triangle t3 = new Triangle(10.0, 15.0);
        System.out.println(t1.isSameArea(t2));
        System.out.println(t1.isSameArea(t3));
   }
}

