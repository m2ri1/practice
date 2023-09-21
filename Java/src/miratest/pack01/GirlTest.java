package miratest.pack01;

public class GirlTest {
    public static void main(String[] args) {
        Girl g1 = new Girl();
        Girl g2 = new GoodGirl();
        GoodGirl gg = new BestGirl();

       // g2.show(); //오류 발생의 원인 -> Goodgirl의 show 메서드가 Girl에서 오버라이드된 메소드가 아니기 때문
        gg.show();
    }
}