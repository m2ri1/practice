package chapter06.programming;

class Phone {
    protected String owner;
    public Phone(String owner) {
        this.owner = owner;
    }

    void talk() {
        System.out.println(owner+" 가 통화중이다");

    }

}

class TelePhone extends Phone {
    private String when;

    public TelePhone(String owner, String when) {
        super(owner);
        this.when = when;
    }
    TelePhone(String owner) {
        super(owner);
    }
    void autoAnswering() {
        System.out.println(owner+" 가 없다. 내일 전화줘");

    }

    public String getWhen() {
        return when;
    }
}

class SmartPhone extends TelePhone {
    private String game;

    public SmartPhone(String owner, String game) {
        super(owner);
        this.game = game;
    }

    public String getGame() {
        return game;
    }

    void playGame() {
        System.out.println(owner+ " 가 동물의숲 게임을 하는중이다");

    }
}

public class PhoneTest {
    public static void main(String[] args) {
        Phone[] phones = {new Phone("황진이"), new TelePhone("길동이", "내일"), new SmartPhone("민국이", "동물의 숲")};
        for (Phone pp:phones) {
            if (pp instanceof SmartPhone) {
                ((SmartPhone) pp).playGame();
            }
            else if (pp instanceof TelePhone) {
                ((TelePhone) pp).autoAnswering();

            }
            else if (pp instanceof Phone) {
                pp.talk();

            }
        }

    }

}
