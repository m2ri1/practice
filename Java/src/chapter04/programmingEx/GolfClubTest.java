package chapter04.programmingEx;

public class GolfClubTest {
    public static void main(String[] args) {
        GolfClub g1 = new GolfClub();
        g1.print();
        GolfClub g2 = new GolfClub(8);
        g2.print();
        GolfClub g3 = new GolfClub("퍼터");
        g3.print();
    }
}
