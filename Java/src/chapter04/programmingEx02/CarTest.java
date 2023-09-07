package chapter04.programmingEx02;

public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car("red");
        Car c2 = new Car("blue");
        Car c3 = new Car("RED");

        System.out.println("자동차 수는 : " + Car.getNum() + ", 빨간색 자동차 수는 : " + Car.getNumRed());
    }
}
