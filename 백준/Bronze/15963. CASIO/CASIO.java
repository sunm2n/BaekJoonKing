
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        long N = sc.nextLong();
        long M = sc.nextLong();
        
        if(N-M == 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
