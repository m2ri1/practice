package miratest;

class Car {
    String color;
    static int red = 0, num = 0;

    public Car(String color) {
        this.color = color;
        num++;
        if (color == "red" | color == "RED" ) red++;
    }

    static int getNumCar() {
        return num;
    }
    static int getRedCar() {
        return red;
    }

}



public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car("red");
        Car c2 = new Car("blue");
        Car c3 = new Car("RED");

        System.out.printf("자동차 수 : %d, 빨간색 자동차 수 : %d", Car.getNumCar(), Car.getRedCar());

    }
}
