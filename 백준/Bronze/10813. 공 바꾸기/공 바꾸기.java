import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int[] array = new int[num1];

        for(int i=0; i<array.length;i++){
            array[i]=i+1;
        }
        for(int t=0; t<num2; t++){
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            int k ;
            k = array[i-1];
            array[i-1]=array[j-1];
            array[j-1] = k;
        }
        for(int a: array){
            System.out.print(a + " ");
        }
    }
}