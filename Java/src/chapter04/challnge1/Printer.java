package chapter04.challnge1;
public class Printer {

    int numOfPapers;

    void print(int amount) {
        numOfPapers -= amount;
    }
}


class PrinterTest {
    public static void main(String[] args) {
        Printer p = new Printer();
        p.numOfPapers=100;
        p.print(70);
        System.out.println(p.numOfPapers);
    }

}