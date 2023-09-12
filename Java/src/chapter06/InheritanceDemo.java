package chapter06;

public class InheritanceDemo {
    public static void main(String[] args) {
        Circle c = new Circle();
        Ball b = new Ball("빨간색");
        System.out.println("원");
        c.findRadius();
        c.findArea();
        System.out.println("구");
        b.findRadius();
        b.findColor();
        b.findArea();
        b.findVolume();
    }
}

class Circle {
    private void secret() {
        System.out.println("secret");
    }

    protected void findRadius() {
        System.out.println("radius:10");

    }

    public void findArea() {
        System.out.println("π*r*r");
    }

}

class Ball extends Circle {
    private String color;

    Ball(String color) {
        this.color = color;
    }

    Ball() {

    }

    public void findColor() {
        System.out.println(color + " 공이다.");
    }

    public void findVolume() {
        System.out.println("4/3*π*r*r*r");
    }

    @Override
    public void findArea() {
        System.out.println("4πr*r");
    }
}