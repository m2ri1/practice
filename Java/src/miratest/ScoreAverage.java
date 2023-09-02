package miratest;

public class ScoreAverage {
    public static void main(String[] args) {
        int[][] score = {{10, 5}, {5, 7}, {3, 8}, {2,9}};
        int sum=0, count=0;
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                sum += score[i][j];
                count++;

            }
        }
        System.out.println(sum);
        System.out.println("전체 평균은" + sum/count);

    }
}
