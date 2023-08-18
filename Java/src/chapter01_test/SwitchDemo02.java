package chapter01_test;

public class SwitchDemo02 {
    public static void main(String[] args) {
        whoIsIt("호랑이");
        whoIsIt("참새");
        whoIsIt("고등어");
        whoIsIt("곰팡이");
    }

    static void whoIsIt(String bio) {
        String kind = "";
        switch (bio) {
            case "호랑이":
            case "사자":
                kind = "포유류";
                break;
            case "독수리":
            case "참새":
                kind = "조류";
            case "고등어":
            case "연어":
                kind = "어류";
                break;

            default:
                System.out.println("어이쿠!");
                kind = " ... ";
        }
        System.out.printf("%s는 %s 이다\n", bio, kind);
    }
}
