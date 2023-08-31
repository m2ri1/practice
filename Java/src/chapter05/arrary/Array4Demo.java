package chapter05.arrary;

public class Array4Demo {
    public static void main(String[] args) {
        double[][] interest = {{3.2, 3.1, 3.2, 3.0}, {2.9, 2.8, 2.7, 2.6}, {2.7, 2.6, 2.5, 2.7}};
        double sum = 0;
        double total = 0;
        for (int i = 0; i < interest.length; i++) {
            for (int j = 0; j < interest[i].length; j++) {
                sum += interest[i][j];

            }
            System.out.printf(i+1 + "차년도 평균 이자율 %.2f %%\n", sum/interest[i].length);
            total += sum/interest[i].length;
            sum = 0;

        }
        System.out.println("3년간 평균 이자율 " + total/3);
    }
}