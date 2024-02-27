import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        int q = 0;
        int d = 0;
        int n = 0;
        int p = 0;
        int k = 0;

        for(int i =0; i < t; i++){
            int c = scanner.nextInt();
            q = c / 25;
            k = c % 25;
            d = k / 10;
            k = k % 10;
            n = k / 5;
            k = k % 5;
            p = k / 1;

            System.out.println(q + " " + d + " " + n + " " + p);
        }
    }
}