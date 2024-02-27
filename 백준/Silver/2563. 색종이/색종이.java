import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean[][] paper = new boolean[100][100];

        int num = scanner.nextInt();
        int count = 0;

        for (int i = 0; i < num; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    if (!paper[j][k]) {
                        paper[j][k] = true;
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}