package chapter04.programmingEx02;

public class GolfClub {
    public static void main(String[] args) {
        Golf g1 = new Golf();
        g1.print();

        Golf g2 = new Golf(8);
        g2.print();

        Golf g3 = new Golf("퍼터");
        g3.print();

    }
}
