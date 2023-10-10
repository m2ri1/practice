package chapter06.programming;

public class Circle {
    int radius;
    public Circle(int radius) {
        this.radius = radius;
    }

    void show() {
        System.out.println("반지름이 "+ radius+" 인 원이다");
    }

}

class ColorClass extends Circle {

    String color;
    public ColorClass(int radius) {
        super(radius);
    }

    public ColorClass(int radius, String color) {
        super(radius);
        this.color = color;
    }

    @Override
    void show() {
        System.out.println("반지름이 "+ radius+" 인 "+color+" 원이다");


    }

}

class Test {
    public static void main(String[] args) {
        Circle[] cc = {new Circle(5), new ColorClass(10, "빨간색")};
        for (Circle s: cc) {
            s.show();
        }

        ColorClass c1 = new ColorClass(3);
        Circle c2 = new Circle(3);
        c1.show();
        c2.show();


    }


}

