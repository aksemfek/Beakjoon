import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int[] array = new int[num1];

        for(int t=0; t<num2; t++){
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            int k = scanner.nextInt();

            for(int i1=i-1;i1<=j-1;i1++){
                array[i1]=k;
            }
        }
        for(int a: array){
            System.out.print(a + " ");
        }
    }
}