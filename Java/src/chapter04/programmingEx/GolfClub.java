package chapter04.programmingEx;

public class GolfClub {
    String kind;
    int number;

    public GolfClub(int number) {
        kind = "아이언";
        this.number = number;
    }

    public GolfClub(String kind) {
        this.kind = kind;
        number = 0;
    }

    public GolfClub() {
        this.kind = "아이언";
        this.number = 7;
    }

    void print() {
        if (number == 0) {
            System.out.printf("%s 입니다 \n", kind);

        } else {
            System.out.printf("%d 번 아이언입니다.\n", number);
        }
    }
}
