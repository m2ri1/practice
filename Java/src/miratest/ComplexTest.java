package miratest;


class Complex {
    double a, b;

    public Complex(double a) {
        this.a = a;
        b = 0.0;
    }

    public Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }

    double print() {
        return a * b;
    }
}


public class ComplexTest {
    public static void main(String[] args) {
        Complex c = new Complex(2.0);
        System.out.println(c.print());
        Complex c1 = new Complex(1.5, 2.5);
        System.out.println(c1.print());

    }

}
