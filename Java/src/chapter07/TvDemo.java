package chapter07;

public class TvDemo {
    public static void main(String[] args) {
        Television t = new Television();
        t.turnOn();
        t.turnOff();

        RemoteControl[] r = new RemoteControl[2];
        r[0] = new Television();
        r[1] = new Radio();
        for (RemoteControl rr:r) {
            rr.turnOn();
            rr.turnOff();
        }
    }
}
