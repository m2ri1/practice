package chapter05.arrary;

public class Foreach {
    public static void main(String[] args) {
        int[] n = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i: n) {
            sum += i;
            System.out.print(i+ " ");
        }
        System.out.println("합은 " +sum);

        String f[] = {"사과", "배", "바나나", "체리", "딸기", "포도"};
        for (String i : f) {
            System.out.print(i + " ");


        }

    }
}
