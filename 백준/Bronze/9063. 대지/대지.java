import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int x_max = -10000;
        int y_min = 10000;
        int y_max = -10000;
        int x_min = 10000;

        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            int[] a = {scanner.nextInt(), scanner.nextInt()};

            if (a[0] > x_max) { x_max = a[0]; }
            if (a[0] < x_min) { x_min = a[0]; }
            if (a[1] > y_max) { y_max = a[1]; }
            if (a[1] < y_min) { y_min = a[1]; }
        }
        System.out.println((x_max-x_min)*(y_max-y_min));
    }
}

