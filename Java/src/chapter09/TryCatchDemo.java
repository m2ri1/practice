package chapter09;

public class TryCatchDemo {
    public static void main(String[] args) {
        int[] aa = {0, 1, 2};
        try {
            System.out.println("마지막 원소 : " + aa[4]);

        } catch (Exception e) {
            System.out.println("원소가 존재하지 않습니다");
        }
        System.out.println("the End");

    }
}
