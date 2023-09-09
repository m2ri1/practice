package chapter04.challnge2;
public class Printer {

    int numOfPapers;
    private boolean duplex;

    public Printer(int numOfPapers, boolean duplex) {
        this.numOfPapers = numOfPapers;
        this.duplex = duplex;
    }

    public boolean isDuplex() {
        return duplex;
    }

    public void setDuplex(boolean duplex) {
        this.duplex = duplex;
    }

    void print(int amount) {

        if (isDuplex()) {
            if (numOfPapers == 0)
                System.out.println("용지가 없습니다.");
            else if (numOfPapers < amount * 0.5) {
                if (amount % 2 == 0) {
                    System.out.println("양면으로 모두 출력하려면 용지가 " + ((int)(amount * 0.5) - numOfPapers) + " 매  부족합니다.");
                    System.out.println(numOfPapers + " 장만 출력합니다.");
                    numOfPapers = 0;
                } else {
                    amount++;
                    System.out.println("양면으로 모두 출력하려면 용지가 " + ((int)(amount * 0.5) - numOfPapers) + " 매  부족합니다.");
                    System.out.println(numOfPapers + " 장만 출력합니다.");
                    numOfPapers = 0;
                }

            } else {
                if (amount % 2 == 0) {
                    System.out.println("양면으로 " + (int)(amount * 0.5) + " 장을 출력했습니다. 현재 남은 용지 수 : " + (numOfPapers - (int)(amount * 0.5)));
                    numOfPapers -= amount * 0.5;
                } else {
                    amount++;
                    System.out.println("양면으로 " + (int)(amount * 0.5) + " 장을 출력했습니다. 현재 남은 용지 수 : " + (numOfPapers - (int)(amount * 0.5)));
                    numOfPapers -= amount * 0.5;
                }

            }

        }
        else {
            if (numOfPapers == 0)
                System.out.println("용지가 없습니다.");
            else if (numOfPapers < amount) {
                System.out.print("단면으로 모두 출력하려면 용지가 " + (amount - numOfPapers) + "매 부족합니다. ");
                System.out.println(numOfPapers + " 장만 출력합니다.");
                numOfPapers = 0;
            } else {
                System.out.println(amount*0.5 + " 장을 출력했습니다. 현재 남은 용지 수 : " + (numOfPapers - amount*0.5));
                numOfPapers -= amount;

            }
        }


    }
}

class PrinterTest {
    public static void main(String[] args) {
        Printer p = new Printer(20, true);
        p.print(25);
        p.setDuplex(false);
        p.print(10);
    }
}
