import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        int k =0;
        for (int i=0; i<n; i++){
            array[i] = scanner.nextInt();
        }
        int n1 = scanner.nextInt();

        for (int a : array){
            if (a==n1){
                k++;
            }
        }
        System.out.println(k);
    }
}