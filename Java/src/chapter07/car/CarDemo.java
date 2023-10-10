package chapter07.car;

public class CarDemo {
    public static void main(String[] args) {
        AutoCar ac = new AutoCar();
        ac.start();
        ac.stop();
        ac.setSpeed(1000);
        ac.turn(45);
    }
}