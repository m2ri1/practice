package chapter05;
import java.util.*;

public class ArrayListDemo02 {
    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int data;
        int sum=0;

        while ((data = sc.nextInt()) >= 0) {
            scores.add(data);

        }
        for (int i = 0; i < scores.size(); i++) {
            sum += scores.get(i);

        }
        System.out.println("평균 : " + sum / scores.size());

    }
}