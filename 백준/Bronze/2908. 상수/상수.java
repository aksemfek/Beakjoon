import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int a1 = (a/100)+((a%100)/10*10)+(a%10*100);

        int b1 = (b/100)+((b%100)/10*10)+(b%10*100);

        if(a1 > b1){
            System.out.println(a1);
        } else {
            System.out.println(b1);
        }
    }
}