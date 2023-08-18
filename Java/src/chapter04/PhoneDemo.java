package chapter04;

class Phone {
    String model;
    int value;

    void print() {
        System.out.println(value + " 만 원짜리 " + model + " 스마트폰");
    }
}

public class PhoneDemo {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        p1.model="갤럭시 플립5";
        p1.value=120;
        p1.print();

        Phone p2 = new Phone();
        p2.model = "아이폰 14pro";
        p2.value = 160;
        p2.print();
    }
}
