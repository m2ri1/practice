package chapter06;


public class ColorPointEx {
    public static void main(String[] args) {
        Point p = new Point();
        p.set(1,2);
        p.showPoint();
        System.out.println(p);
        ColorPoint cp = new ColorPoint();
        cp.set(3,4);
        cp.setColor("red");
        cp.showPoint();
        System.out.println(cp);
    }
}

class ColorPoint extends Point {
    private String color;

    public void setColor(String color) {
        this.color=color;
    }

    @Override
    public void showPoint() {
        System.out.println(color);
        super.showPoint(); // private로 설정되어있기때문에 직접 접근 불가, 따라서 부모의 클래스에서 접근
    }

    @Override
    public String toString() {
        return color + super.toString();

    }
}

class Point {
    private int x, y;

    @Override
    public String toString() {
        return ("(" + x + ","+ y+")");
    }

    public void set(int x, int y) {
        this.x=x;
        this.y=y;
    }

    public void showPoint() {
        System.out.println("(" + x + "," + y + ")");
    }
}