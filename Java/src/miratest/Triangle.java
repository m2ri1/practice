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

}

class TriangleTest {
    public static void main(String[] args) {
        Triangle t = new Triangle(10.0, 5.0);
        System.out.println(t.findArea());
    }
}
