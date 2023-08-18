package chapter03.chap3_sec03;

public class DoWhile2Demo {

  public static void main(String[] args) {
    int i=10;
    do {
      i++;
    } while (i < 5);
    System.out.println("Do While 문 실행 : " + i);
    i = 10;
    while (i < 5) {
      i++;
    }
    System.out.println("While 문 실행 : " + i);
  }
}
