package chapter05.arrary;

public class Array5Demo {
    public static void main(String[] args) {
        int a[] = { 1,2,3,4,5};

        increase(a);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    static void increase (int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] ++;
        }
    }
}
