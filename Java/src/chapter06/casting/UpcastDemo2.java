package chapter06.casting;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class UpcastDemo2 {

    public static void main(String[] args) {
/*
        Student1 s;
        Person1 p = new Person1();
        s = (Student1)p; //다운캐스팅 안됨
*/
        Student1 s = new Student1();
        Person1 p = s; // 업캐스팅 (자동 형변환)
        Student1 s2 = (Student1) p; // 다운캐스팅 (명시적 형변환 필요)



    }
}
