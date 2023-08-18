package chapter03.chap3_sec03;

public class DoWhile3Demo {

  public static void main(String[] args) {
    int row = 2;
    do {
      int column = 1;
      do {
        System.out.printf("%4d", row*column);
        column++;
      } while (column<10);
      System.out.println();
      row++;
    } while (row<10);

  }

}
