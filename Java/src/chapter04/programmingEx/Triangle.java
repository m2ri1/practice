package chapter04.programmingEx;

public class Triangle {
    double base, height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;

    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public double findArea() {
        return base*height;

    }

    public boolean isSameArea(Triangle triangle) {
        return this.findArea() == triangle.findArea();
    }

}

