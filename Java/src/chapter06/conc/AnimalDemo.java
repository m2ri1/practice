package chapter06.conc;

public class AnimalDemo {
    public static void main(String[] args) {
        Mammal ape = new Mammal();
        Mammal lion = new Mammal("lion");

    }
}

class Animal {
    public Animal(String s) {
        System.out.println("동물 : " + s);
    }
}

class Mammal extends Animal {
    public Mammal() {
        super("원숭이");
        System.out.println("포유류 : 원숭이");
    }

    Mammal(String s) {
        super(s);
        System.out.println("포유류 : "+s);

    }
}
