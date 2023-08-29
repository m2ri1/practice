package exStatic;

class Circle1{
    double radius;
    static int numOfcircle=0;
    int numCircle=0;

    Circle1(double radius) {
        this.radius = radius;
        numOfcircle++;
        numCircle++;
    }
}

public class CircleDemo {
    public static void main(String[] args) {
        Circle1 c = new Circle1(10.0);
        Circle1 cc = new Circle1(5.0);
        print();
        System.out.println("원의 개수 : " + Circle1.numOfcircle);
        System.out.println("원의 개수 : " + c.numCircle);
        System.out.println("원의 개수 : " + cc.numCircle);

    }


    static void print() {
        System.out.println("인스턴트 메서드");
    }

}

