package chapter06.programing;


class Person {
    String name;
    int age;

    Person() {

    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}

class Student extends Person {
    int stuNo;

    public Student(String name, int age, int stuNo) {
        super(name, age);
        this.stuNo = stuNo;
    }

    public int getStuNo() {
        return stuNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuNo=" + stuNo +
                '}';
    }
}

class ForeignStudent extends Student {
    String nation;

    public ForeignStudent(String name, int age, int stuNo, String nation) {
        super(name, age, stuNo);
        this.nation = nation;
    }

    public String getNation() {
        return nation;
    }

    @Override
    public String toString() {
        return "ForeignStudent{" +
                "nation='" + nation + '\'' +
                ", stuNo=" + stuNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


public class PersonDemo extends Person {
    public static void main(String[] args) {

        Person[] pp = {new Person("길동이", 22), new Student("황진이", 23, 100), new ForeignStudent("Amy", 30, 200, "U.S.A")};
        for (Person p: pp
             ) {
            System.out.println(p);

        }
    }
}