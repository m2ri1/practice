package chapter04.constructor2;

public class Student {
    private int stuNo;
    private String name;
    private int age;
    private String adr;
    private double grade;

    public Student(int stuNo, String name, int age, String adr, double grade) {
        this.stuNo = stuNo;
        this.name = name;
        this.age = age;
        this.adr = adr;
        this.grade = grade;
    }

    public int getStuNo() {
        return stuNo;
    }

    public void setStuNo(int stuNo) {
        this.stuNo = stuNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdr() {
        return adr;
    }

    public void setAdr(String adr) {
        this.adr = adr;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
