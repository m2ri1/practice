package chap3_sec03;

public class While2Demo {

  public static void main(String[] args) {
    int row = 2;
    while (row < 10) {
      int column = 1;
      while (column < 10) {
        System.out.printf("%4d", column*row );
        column++;
      }
      System.out.println();
      row++;
    }
  }

}
