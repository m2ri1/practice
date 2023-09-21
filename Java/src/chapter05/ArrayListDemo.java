package chapter05;
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<Integer>();
        scores.add(10);
        scores.add(11);
        scores.add(12);
        scores.add(1, 13);
        scores.remove(1);
        System.out.println(scores.get(1));


        for (int s:scores) {
            System.out.println(s);

        }
    }
}
