package chapter04.GSM;

public class Circle {
    String name;
    int r;

    void getArea() {
        System.out.println(name +"의 면적은 " + r*r*3.14);

    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        c1.name = "자바피자";
        c2.name = "자바도넛";
        c1.r = 10;
        c2.r = 2;
        c1.getArea();
        c2.getArea();
    }
}
