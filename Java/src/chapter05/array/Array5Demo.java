package chapter05.array;

public class Array5Demo {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};


        int[] scores3 = new int[5];
        scores3 = new int[]{100, 95, 89, 69, 59};




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