package test;

public class ExMethod02 {
    public static void main(String[] args) {
/*        System.out.println("합 (1~10) : " + sum(1, 10));
        System.out.println("합 (10~100) : " + sum(10, 100));
        System.out.println("합 (100~1000) : " + sum(100, 1000));*/
        sum(1,10);
    }

    private static void sum(int x, int y) {
        {
            int sum = 0;
            for (int i = x; i <= y; i++) {
                sum += i;
            }
            System.out.println(sum);
        }
    }


}