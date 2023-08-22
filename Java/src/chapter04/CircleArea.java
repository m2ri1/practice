package chapter04;

public class CircleArea {
    String name;
    int r;

    double getArea() {
        return r*r*3.14;
    }

    public static void main(String[] args) {
        CircleArea c1 = new CircleArea();
        CircleArea c2 = new CircleArea();

        c1.name = "자바피자";
        c1.r = 10;
        c2.name = "자바도넛";
        c2.r = 2;

        System.out.println( c1.name+"의 면적은 " +c1.getArea());
        System.out.println( c2.name+"의 면적은 " +c2.getArea());

    }
}
