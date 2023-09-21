package chapter06.casting;

public class InstanceDemo {
    public static void main(String[] args) {
        Student s = new Student();
        Person p = new Person();
        System.out.println(s instanceof Person);
        System.out.println(s instanceof Student);
        System.out.println(p instanceof Person);
        System.out.println(p instanceof Student);
        downcast(s);

    }

    private static void downcast(Student s) {

    }

}
