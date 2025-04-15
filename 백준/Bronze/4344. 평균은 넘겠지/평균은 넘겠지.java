import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();


        for(int i = 0; i < testCase; i++) {
            int studentCnt = sc.nextInt();
            int[] scoreArray = new int[studentCnt];

            int studentCount = 0;
            int avgScore = 0;

            for(int j = 0; j < studentCnt; j++) {
                scoreArray[j] = sc.nextInt();
                avgScore += scoreArray[j];
            }
            avgScore = avgScore/studentCnt;


            for(int score : scoreArray) {
                if(score > avgScore) studentCount++;
            }
            System.out.printf("%.3f%s\n", ((double)studentCount / studentCnt * 100), "%");

        }
    }
}