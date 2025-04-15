import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        int textLen = 0;
        if(!text.equals(" ")) textLen = text.strip().trim().split(" ").length; 
        System.out.println(textLen);
    }
}
