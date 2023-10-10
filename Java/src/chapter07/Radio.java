package chapter07;

public class Radio implements RemoteControl {


    @Override
    public void turnOn() {
        System.out.println("라디오킴");

    }

    @Override
    public void turnOff() {
        System.out.println("라디오끔");

    }
}
