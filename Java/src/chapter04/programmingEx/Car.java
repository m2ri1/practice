package chapter04.programmingEx;

public class Car {
    String color;
    static int numofCar=0;
    static int  numofRedCar=0;

    public Car(String color) {
        this.color = color;
        numofCar++;
        if (color.compareToIgnoreCase("red") ==0) {
            numofRedCar++;
        }

    }

    public static int getNumofCar() {
        return numofCar;
    }

    public static int getnumofRedCar() {
        return numofRedCar;
    }


}
