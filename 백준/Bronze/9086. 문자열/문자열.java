import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        scanner.nextLine();
        for(int i=0; i < number ;i++){
            String str = scanner.nextLine();
            System.out.println(str.charAt(0)+""+ str.charAt(str.length() - 1));
        }
    }
}