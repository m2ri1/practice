package test.GSM;

public class Student {
    String  name;
    int StudentNumber;

    void study () {
        System.out.println( StudentNumber + name + "가 공부를 합니다");

    }

    void gohome() {
        System.out.println( StudentNumber + name + "가 집에 갑니다");

    }

    public static void main(String[] args) {

        Student st1 = new Student();
        st1.name = "박미리";
        st1.StudentNumber = 1309;
        st1.study();
        st1.gohome();
    }
}
