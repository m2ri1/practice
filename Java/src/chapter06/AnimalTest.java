package chapter06;

public class AnimalTest {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();
        a.sleep();
        Tiger t = new Tiger();
        t.eat();
        t.sleep();
        t.run();}
}

class Tiger extends Animal{
    String leg;

    void run() {
        System.out.println("tiger run");
    }

    @Override
    void eat() {
        System.out.println("tiger eat");
    }

    @Override
    void sleep() {
        System.out.println("tiger sleep");
    }
}

class Animal {
    private String eyes, mouth;

    void eat() {
        System.out.println("animal eat");
    }

    void sleep() {
        System.out.println("animal sleep");
    }

}
