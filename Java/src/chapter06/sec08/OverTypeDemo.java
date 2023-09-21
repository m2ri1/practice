package chapter06.sec08;

class Vehicle {
    String name = "탈것";
    void whoami() {
        System.out.println("나는 탈것이다");
    }

    static void move() {
        System.out.println("이동하다");
    }

}

class Car extends Vehicle {
    String name = "자동차";
    void whoami() {
        System.out.println("나는 자돋차이다");
    }

    static void move() {
        System.out.println("달리다");
    }

}

class SportsCar extends Car {
    void whoami() {
        System.out.println("나는 스포츠카이다");
    }
}



public class OverTypeDemo {
    public static void main(String[] args) {
/*        Vehicle v = new Car(); // 자동형변환 업캐스팅
        System.out.println(v.name);
        v.whoami();
        v.move();*/
        Vehicle[] vs = new Vehicle[2];// 객체배열의 참조변수 2개 생성
        vs[0] = new Car(); //다형성, 업캐스팅 됨
        vs[1] = new SportsCar();

        for (Vehicle v:vs) {
            v.whoami();
            v.move();
        }

    }
}
