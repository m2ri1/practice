package test;

public class ExMethod03 {
    public static void main(String[] args) {
        printScore(0);
        printScore(101);

    }
    private static void printScore(int i) {
        if (i>=0 && i<=100)
            System.out.println(i+" 점은 올바른 점수입니다");
        else
            System.out.println(i+" 점은 올바르지 않은 점수입니다");
    }
}
