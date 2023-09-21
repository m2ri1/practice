package chapter06.casting;

class A {

}

class B extends A {

}

class C extends A {

}

class D extends C {
}

public class InstanceOfTest {
    public static void main(String[] args) {
        A a;
        B b = new B();
        a = new D(); //업캐스팅 (다형성)

        // 인스턴스를 구별하는 연산자 instanceof

    }
}