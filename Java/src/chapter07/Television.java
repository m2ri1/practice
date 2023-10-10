package chapter07;

public class Television implements RemoteControl {

    @Override
    public void turnOn() {
        System.out.println("티비킨다");
    }

    @Override
    public void turnOff() {
        System.out.println("티비끈다");

    }
}
