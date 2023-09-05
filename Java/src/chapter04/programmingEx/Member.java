package chapter04.programmingEx;

public class Member {
    private String name,id, passwd;
    private int age;
    public Member(String name, String id, String passwd, int age) {
        this.name = name;
        this.id = id;
        this.passwd = passwd;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

