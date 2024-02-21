import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String[] str1 = str.trim().split("\\s+");
        int count = 0;
        for (String str2 : str1) {
            if (!str2.isEmpty()) {
                count++;
            }
        }
        System.out.println(count);
    }
}