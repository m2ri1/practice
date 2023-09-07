package chapter04.programmingEx02;

public class Complex {
    double real, imag;

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public Complex(double real) {
        this(real, 0.0);
    }

    public String print() {
        return real + " + " + imag + "i";
    }

}
