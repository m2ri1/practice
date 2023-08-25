package chapter04.constructor;

import java.util.Scanner;

public class Phone {
    String name, tel;

    Phone(String name, String tel) {
        this.name = name;
        this.tel = tel;

    }

    String getName() {
        return name;
    }

    String getTel() {
        return tel;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name,tel;
        System.out.print("이름과 전화번호 입력 >>");
        Phone p1 = new Phone(name=sc.next(), tel=sc.next());
        System.out.print("이름과 전화번호 입력 >>");
        Phone p2 = new Phone(name=sc.next(), tel=sc.next());


        System.out.println(p1.getName() + "의 번호는 " + p1.getTel());
        System.out.println(p2.getName() + "의 번호는 " + p2.getTel());

    }
}
