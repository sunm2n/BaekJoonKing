import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();

        if(M-45 >= 0) {
            M -= 45;
        } else {
            M += 15;
            H -= 1;
        }

        if(H < 0) {
            H = 23;
        }

        System.out.println(H + " " + M);
    }
}