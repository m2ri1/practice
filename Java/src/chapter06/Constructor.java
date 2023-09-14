package chapter06;

public class Constructor {
    public static void main(String[] args) {
/*//      C c = new C();
        C c;
        c = new C();*/

        B b = new B();
        B b2 = new B(100);
    }
}

class A {
    int x;

    public A(int x) {
        System.out.println("생성자A"+x);

    }
    public A() {
        System.out.println("생성자A");

    }
}

class B extends A {
    public B() {
        System.out.println("생성자B");
    }

    public B(int x) {
        super(x);
        System.out.println("생성자B"+x);

    }

}

/*
class C extends B {
    public C() {
//      super(); 생략되어있다
        System.out.println("생성자C");
    }
}*/
