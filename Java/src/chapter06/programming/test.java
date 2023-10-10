package chapter06.programming;

public class test {
    public static void main(String[] args) {
        Ps p = new Ps();
        St s = new St();
        p.a();
        s.a();

    }
}

class St extends Ps {
    void aa() {
        System.out.println("st");
    }

}

class Ps {
    void a() {
        System.out.println("ps");
    }

}