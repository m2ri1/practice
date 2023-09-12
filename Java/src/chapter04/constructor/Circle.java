package chapter04.constructor;

public class Circle {
    String name;
    int r;

    public Circle(int r, String name) {
        this.r=r;
        this.name=name;

    }
    public Circle() {
        r = 1;
        name = "";
    }
    double getArea() {
        return r * r * 3.14;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(10, "자바피자");
        Circle c2 = new Circle();

        System.out.println(c2.name +" 의 면적은 " + c2.getArea());
    }
}