package chapter04.constructor;

public class CircleA {
    double radius;
    String color;

    CircleA(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    CircleA(double radius) {
        this(radius, "black");
    }

    CircleA(String color) {
        this(1,color);
    }

    CircleA() {
        this(10,"yello");
    }

    public static void main(String[] args) {
        CircleA c1 = new CircleA(10, "pink");
        CircleA c2 = new CircleA(10.0);
        CircleA c3 = new CircleA("blue");
        CircleA c4 = new CircleA();
    }
}
