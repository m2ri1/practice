package chapter01.test;

public class test {
    public static void print(int[] n) {
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i] + " ");
        }
    }

    public static void main(String[] args) {
        print(new int[] {1, 2, 3, 4});

    }
}
