package chapter03.chap3_sec03;

public class For2Demo {

  public static void main(String[] args) {
    for (int i = 2; i < 10; i++) {
      for (int j = 1; j < 10; j++) {
        System.out.printf("%4d", i * j);

      }
      System.out.println();
    }
  }

}
