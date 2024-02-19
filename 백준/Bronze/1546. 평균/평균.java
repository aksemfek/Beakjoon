import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] arr = new int[number];
        int max = 0;
        double sum=0;
        for (int i=0; i< number; i++){
            arr[i] = scanner.nextInt();

        }
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        for(int i =0; i<arr.length;i++){
            sum = sum+ ((double)arr[i]/max*100);
        }
        System.out.println(sum/number);

    }
}