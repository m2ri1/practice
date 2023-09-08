package chapter04.test;

public class Circle {
    double r;

/*    void findArea() {
        System.out.println(r * r * 3.14);
    }*/

    double findArea() {
        return r*r*3.14;
    }

    public Circle(double r) {
        this.r = r;
    }

    Circle() {

    }

    public static void main(String[] args) {
        Circle c = new Circle();
        c.r = 10;
        c.findArea();

        Circle[] cc = new Circle[10]; // 참조변수 생성
        for (int i = 0; i < cc.length; i++) {
            cc[i] = new Circle(); // 참조변수에 객체 생성
            cc[i].r=i+1;
            System.out.println(cc[i].findArea());
        }

        Circle[] circles = new Circle[5];
        for (int i = 0; i < circles.length; i++) {
            circles[i] = new Circle(i+1.0);
            System.out.printf("원의 넓이 (반지름 : %.1f) = %.2f\n", circles[i].r, circles[i].findArea());
        }

    }
}
