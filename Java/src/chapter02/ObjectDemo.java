package chapter02;

public class ObjectDemo {
    public static void main(String[] args) {
        Student student1 = new Student("박미리", 100);

    }
}

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
