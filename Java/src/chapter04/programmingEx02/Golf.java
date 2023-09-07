package chapter04.programmingEx02;

public class Golf {
    String name;
    int number;

    public Golf(String name) {
        this.name = name;
        number = 0;
    }

    public Golf(int number) {
        this.number = number;
        name = "아이언";
    }

    Golf() {
        number = 0;
        name = "아이언";
    }

    void print() {
        System.out.println(number + "번 " + name + " 입니다.");
    }
}
