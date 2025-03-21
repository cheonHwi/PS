package baekjoon.java;
import java.io.IOException;
import java.util.Scanner;

class boj2753 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int baseYear = sc.nextInt();

        if((baseYear % 4 == 0 && !(baseYear % 100 == 0))|| baseYear % 400 == 0) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }

        sc.close();
    }
}