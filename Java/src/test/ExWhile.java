package test;

public class ExWhile {
    public static void main(String[] args) {
        int i= 1;
        while ( i <= 10 ) {
            System.out.print(i++);

        }
        System.out.println( );
        int a= 2;
        while ( a < 10 ) {
            int b = 1;
            while ( b < 10 ) {
                System.out.print(a+"*" +b +"=" + (a*b) +" ");
                b++;
            }
            System.out.println( );
            a++;
        }
    }
}
