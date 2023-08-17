package chap2_sec03;

public class CharBoolDemo {
    public static void main(String[] args) {
        char ga1 = '가';
        char ga2 = '\uac00';

        boolean cham = true;
        boolean geocit = false;

        System.out.println(ga1);
        System.out.println((int) ga1);
        System.out.println(ga2);
        System.out.println(++ga2);
        System.out.println(cham + "가 아니면" + "geojit" + "입니다.");

    }
}