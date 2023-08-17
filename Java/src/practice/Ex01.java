package practice;

public class Ex01 {
    public static void main(String[] args) {
        int i=2, j=1;
        while ( i < 10){
            while ( j <10){
                System.out.println(i+" * " + j + " = " +i*j);
                j++;
            }
            System.out.println( );
            j=1;
            i++;

        }

    }
}

