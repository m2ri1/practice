package chapter04.programmingEx;

public class Dice {
    int face;

    int roll() {
        return (int) (Math.random() * 6) + 1;
    }

}
