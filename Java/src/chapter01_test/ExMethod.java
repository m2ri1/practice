package chapter01_test;

public class ExMethod {
    public static void main(String[] args) {
        int sum=0;
        for (int i=1; i<11; i++) {
            sum+=i;
        }
        System.out.println("합 (1~10) : " +sum);

        sum=0;
        for (int i=10; i<101; i++) {
            sum+=i;
        }
        System.out.println("합 (10~100) : " +sum);

        sum=0;
        for (int i=100; i<1001; i++) {
            sum+=i;
        }
        System.out.println("합 (100~1000) : " +sum);

    }
}
