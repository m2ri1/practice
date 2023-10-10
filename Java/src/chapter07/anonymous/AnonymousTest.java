package chapter07.anonymous;

public class AnonymousTest {
    public static void main(String[] args) {
        RemoteControl rc = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("turn on");
            }

            @Override
            public void turnOff() {
                System.out.println("turn off");
            }
        }; // 일회용 클래스
        rc.turnOff();
        rc.turnOn();
    } // main end
}
