package miratest.pack02;

public class GirlTest {
    public static void main(String[] args) {
        Girl g1 = new Girl();
        Girl g2 = new GoodGirl();
        GoodGirl gg = new BestGirl();

        g2.show(); // Girl의 show 메서드가 GoodGirl의 show에 오버라이드되어 GoodGirl의 show메소드가 실행된다
        gg.show();
    }
}