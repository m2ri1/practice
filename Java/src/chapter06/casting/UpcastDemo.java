package chapter06.casting;
public class UpcastDemo {
    public static void main(String[] args) {
//        Person p;
        Student p;
        Student s = new Student();
        p=s; //s가 가지고 있는 주소값(Student 객체의 주소)을 p에 할당. 따라서 p는 Student 객체를 참조함
        // 자식타입이 부모의 타입으로 갈때 자동 형변환 , 업캐스팅 (자식이 부모가 됨)
        p.number=1;
        p.work();
        p.whoami();

        Person pp = new Person();
        Student ss = (Student)pp; //볼 수 없는 범위를 가르키고 있기때문에, 다운캐스팅 명시적 형변환 오류 ( 부모가 자식이 됨)

        Student s1 = new Student();
        Person p1 = s1;
        Student s2 = (Student)p1; //명시적 형변환
    }
}

class Person {
    String name = "사람";

    void whoami() {
        System.out.println("나는 사람이다.");
    }
}

class Student extends Person {
    int number = 7;

    void work() {
        System.out.println("나는 공부한다");
    }
}