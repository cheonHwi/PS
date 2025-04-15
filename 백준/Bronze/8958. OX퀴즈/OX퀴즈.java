import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCnt = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < testCnt; i++) {
            char[] qLine = sc.nextLine().toCharArray();
            int cnt = 0;
            int score = 1;
            for (int j = 0; j < qLine.length; j++) {
                if (qLine[j] == 'X') {
                    score = 1;
                }
                else if (qLine[j] == 'O') {
                    if(j > 0 && qLine[j-1] == 'O') score++;
                    cnt+=score;
                }
            }
            System.out.println(cnt);
        }
    }
}