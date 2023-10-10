package chapter07.car;

public class AutoCar implements OperateCar{
    int speed;
    int degree;
    @Override
    public void start() {
        System.out.println("출발");
    }

    @Override
    public void stop() {
        System.out.println("바로 정지");
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
        System.out.println("속도 " + speed + "으로 달린다");
    }

    @Override
    public void turn(int degree) {
        this.degree = degree;
        System.out.println(degree+ "도로 회전");
    }
}
