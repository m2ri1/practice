package chapter04.challnge2;
public class Printer {

    int numOfPapers;

    public Printer(int numOfPapers) {
        this.numOfPapers = numOfPapers;
    }

    void print(int amount) {
        if ( numOfPapers ==0 )
            System.out.println("용지가 없습니다.");
        else if (numOfPapers < amount) {
            System.out.println("모두 출력하려면 용지가 " + (amount-numOfPapers) + " 매  부족합니다.");
            System.out.println(numOfPapers + " 장만 출력합니다.");
            numOfPapers = 0;
        } else {
            System.out.println(amount + " 장을 출력했습니다. 현재 남은 용지 수 : " + (numOfPapers-amount));
        }
    }
}

class PrinterTest {
    public static void main(String[] args) {
        Printer p = new Printer(10);
        p.print(2);
        p.print(20);
        p.print(10);
    }
}
