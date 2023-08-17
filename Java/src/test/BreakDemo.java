package test;

public class BreakDemo {
    public static void main(String[] args) {
        int i = 1, j = 5;
        while (true) {
            System.out.println(i++);
            if (i>=j)
                break;
        }
    }
}
