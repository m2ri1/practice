package miratest.pack03;

public class BestGirl extends GoodGirl {
    void show() {
        System.out.println(name+"는 자바를 무지하게 잘 안다");
    }

    public BestGirl(String name) {
        super(name);
    }
}
