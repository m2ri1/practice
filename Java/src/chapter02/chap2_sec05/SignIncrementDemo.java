package chapter02.chap2_sec05;

public class SignIncrementDemo {

  public static void main(String[] args) {
    int plusone = 1;
    int minusone = -plusone;
    System.out.println("plusnoe은 " + plusone + "입니다");
    System.out.println("minusnoe은 " + minusone + "입니다");

    int x=1, y=1;
    System.out.println("x = "+ x +", ++x = "+ ++x);
    System.out.println("y = "+ y +", y++ = "+ y++);
    System.out.println("x = "+ x +", y = "+ y);
  }

}
