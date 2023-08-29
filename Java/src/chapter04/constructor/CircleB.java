package chapter04.constructor;

public class CircleB {

    private double radius;

    public double getRadius(){ //접근자
        return radius;
    }

    public void setRadius(double radius) {
        this.radius=radius;
    }


    public static void main(String[] args) {
        CircleB b = new CircleB();
        b.radius=6;
        System.out.println(b.radius);

    }
}
