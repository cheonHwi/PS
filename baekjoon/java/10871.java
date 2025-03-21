package baekjoon.java;
import java.io.IOException;
import java.util.Scanner;

class boj10871 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int baseNum = sc.nextInt();

        int[] numArray = new int[size];
        for(int i = 0; i < size; i++) {
            numArray[i] = sc.nextInt();
        }

        for(int i = 0; i < size; i++) {
            if(numArray[i] < baseNum) System.out.print(numArray[i] + " ");
        }

        sc.close();
    }
}