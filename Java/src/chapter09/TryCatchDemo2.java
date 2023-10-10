package chapter09;

public class TryCatchDemo2{
    public static void main(String[] args){
        int a = 3;



        try {
            System.out.println(a / 0);
        } catch (Exception e) {
            System.out.println("Exception 발생");
        } finally {
            System.out.println("TryCatch문 통과");
        }
        try {
            System.out.println(a / 3);
        } catch (Exception e) {
            System.out.println("Exception 발생");
        } finally {
            System.out.println("TryCatch 통과");
        }

        System.out.println("끝");
    }
}
