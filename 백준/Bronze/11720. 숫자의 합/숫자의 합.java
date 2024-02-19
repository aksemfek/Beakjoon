import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum =0;
        int number = scanner.nextInt();
        scanner.nextLine();
        String str = scanner.nextLine();
        String [] arr = str.split("");
        for(int i=0;i< arr.length;i++){
            sum += Integer.parseInt(arr[i]);
        }
        System.out.println(sum);
    }
}