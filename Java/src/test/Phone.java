package test;

import java.util.Scanner;

public class Phone {
    String name, tel;

    public Phone(String name, String tel) {
        this.name = name;
        this.tel = tel;
    }

    public String getName() {
        return name;
    }

    public String getTel() {
        return tel;
    }

    public static void main(String[] args) {
        String name, tel;
        Scanner sc = new Scanner(System.in);
        System.out.print("이름과 전화번호 입력 >> ");
        Phone p1 = new Phone(name = sc.next(), tel = sc.next());
        System.out.print("이름과 전화번호 입력 >> ");
        Phone p2 = new Phone(name = sc.next(), tel = sc.next());

        System.out.println(p1.getName() + "의 번호는 " + p1.getTel());
        System.out.println(p2.getName() + "의 번호는 " + p2.getTel());
    }
}
