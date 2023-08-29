package exStatic;

public class OneToTenDemo {
    static int sumOfToTen;
    static {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum+=i;
        }
        sumOfToTen=sum;

    }

    public static void main(String[] args) {
        System.out.println(OneToTenDemo.sumOfToTen);
    }
}
