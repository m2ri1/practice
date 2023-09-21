package chapter06.programing;

class Parent {
    String name = "영조";

    void print() {
        System.out.println("나는 "+ name + " 이다");

    }

}

class Child extends Parent {
    String name = "사도세자";

    void print() {
        System.out.println("나는 "+ name + " 이다");

    }
}
public class OvershadowTest {
    // 자식으로 선언된 child가 부모로 업캐스팅 되어 부모타입이 됨. 이때 부모의 필드는 오버라이딩이 되지 않기때문에 부모의 name 필드를 출력하고, show 메소드는 오버라이딩 되어 자식의 show 출력
    public static void main(String[] args) {
        Parent p = new Child();
        System.out.println(p.name);
        p.print();

    }
}
