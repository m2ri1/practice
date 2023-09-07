package chapter04.programmingEx02;

public class Dice {
    int number;

    int roll() {
        return (int) (Math.random() * 6) + 1;

    }

}
