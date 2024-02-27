import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int sum = 2;
        int count = 1;
        if( n==1){
            System.out.println(n);
        }else{
            while(sum <= n){
                sum = sum + (6 * count);
                count++;
            }
            System.out.println(count);
        }
    }
}