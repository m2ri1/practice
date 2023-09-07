package chapter04.programmingEx02;

public class Car {
    String color;
    static int num=0;
    static int red=0;

    public Car(String color) {
        this.color = color;
        num ++;
        if (color.compareToIgnoreCase("red") ==0) {
            red++;
        }

    }

    static int getNum() {
        return num;
    }

    static int getNumRed() {
        return red;
    }
}
