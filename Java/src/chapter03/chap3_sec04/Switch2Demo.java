package chapter03.chap3_sec04;

public class Switch2Demo {

  public static void main(String[] args) {
    Who("호랑이");
    Who("참새");
    Who("고등어");
    Who("곰팡이");
  }

  static void Who(String bio) {
    String kind = "";
    switch (bio) {
      case "호랑이":
      case "사자":
        kind = "포유류";
        break;

      case "독수리":
      case "참새":
        kind = "조류";
        break;
      case "고등어":
      case "연어":
        kind = "어류";
        break;

      default:
        System.out.println("어이쿠!");
        kind = "...";
    }
    System.out.printf("%s는 %s이다.\n", bio, kind);
  }

}
