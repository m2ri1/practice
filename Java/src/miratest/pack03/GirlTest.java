package miratest.pack03;


public class GirlTest {
    public static void main(String[] args) {
        Girl[] girls = {new Girl("갑순이"), new GoodGirl("콩쥐"), new BestGirl("황진이")};

        for (Girl g: girls) {
            g.show();
        }

    }
}