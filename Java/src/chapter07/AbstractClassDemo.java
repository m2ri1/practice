package chapter07;

class Circle extends Shape {
    int r;

    public Circle(int r) {
        this.r = r;
    }

    public Circle() {

    }

    @Override
    void draw() {
        System.out.println("원을 그리다");
    }

    @Override
    public double findArea() {
        return r*r*pi;
    }
}
public class AbstractClassDemo {
    public static void main(String[] args) {
        Shape s = new Circle(3);
        s.draw();
        System.out.println(s.findArea());

    }
}
