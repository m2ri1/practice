package chapter04;

public class Triangle {
    int base, height;
    double getArea() {
        return base * height * 0.5;
    }

    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.base = 10;
        t1.height = 5;

        System.out.println(t1.getArea());
    }
}