package chapter06.programing;

class Vehicle {
    String color;
    int speed;

    public Vehicle(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "color='" + color + '\'' +
                ", speed=" + speed +
                '}';
    }
}

class Car extends Vehicle {
    int displacement;
    int gears;

    public Car(String color, int speed, int displacement, int gears) {
        super(color, speed);
        this.displacement = displacement;
        this.gears = gears;
    }


    @Override
    public String toString() {
        return "Car{" +
                "displacement=" + displacement +
                ", gears=" + gears +
                ", color='" + color + '\'' +
                ", speed=" + speed +
                '}';
    }
}

public class OverrideTest {
    public static void main(String[] args) {
        Car c = new Car("파랑", 200, 1000, 5);
        System.out.println(c);

      Vehicle v = c;
        System.out.println(v); 

    }
}
