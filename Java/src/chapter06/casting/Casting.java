package chapter06.casting;

public class Casting {
    public static void main(String[] args) {

        // 01 Upcasting
        Student1 s1 = new Student1();
        System.out.println(s1.toString());
        Person1 p1;
        p1 = s1;
        // == p1 = (Person) s1;
        System.out.println(p1.toString());
        System.out.println(s1.toString());

        // 02 DownCasting
        Student1 s2 = (Student1) p1;
        System.out.println(s2.toString());

    }
}

class Student1 extends Person1{

    public String toString() {
        return "Student1";
    }
}

class Person1 {

    public String toString() {
        return "Person2";
    }
}