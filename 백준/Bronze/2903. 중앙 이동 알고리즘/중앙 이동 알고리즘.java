import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = 2;
        int dot =2;
        for(int i = 0; i < n; i++){
            dot = dot*k-1;
        }
        System.out.println(dot*dot);
    }
}