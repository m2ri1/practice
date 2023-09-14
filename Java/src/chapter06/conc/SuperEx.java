package chapter06.conc;

class Point {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Point() {
        this.x = this.y = 0;

    }

    @Override
    public String toString() {
        return x+", "+y;
    }
}

class ColorPoint extends Point {
    private String color;

    public ColorPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }


    @Override
    public String toString() {
        return color+super.toString();
    }

    public ColorPoint(String color) {
        this.color = color;
    }
}

public class SuperEx {
    public static void main(String[] args) {
        ColorPoint cp = new ColorPoint(5, 6,"blue ");
        ColorPoint cp2 = new ColorPoint("blue ");
        System.out.println(cp);
        System.out.println(cp2);

    }
}
