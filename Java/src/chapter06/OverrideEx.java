package chapter06;

public class OverrideEx {
    public static void main(String[] args) {
        Line l = new Line();
        l.print();
        paint(new Shape());
        paint(new Line());
        paint(new Rect());
        paint(new Circle2());

    }
    static void paint(Shape shape){
        shape.print();
    }
}

class Shape {
    public void print() {
        System.out.println("shape");
    }
}

class Line extends Shape {
    @Override
    public void print() {
        System.out.println("line");
    }
}

class Rect extends Shape {
    @Override
    public void print() {
        System.out.println("rect");
    }
}

class Circle2 extends Shape {
    @Override
    public void print() {
        System.out.println("circle");
    }
}