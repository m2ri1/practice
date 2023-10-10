package chapter07;

// 추상클래스
public abstract class Shape {
    double pi = 3.14;

    // 추상메서드
    abstract void draw();

    // 구현메서드
    public double findArea() {
        return 0.0;
    }

}
