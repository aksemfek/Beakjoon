import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().toUpperCase();

        int[] arr = new int[26];

        for(int i = 0; i < str.length(); i++){
            if('A' <=str.charAt(i) && str.charAt(i)<='Z'){
                arr[str.charAt(i)-'A']++;
            }
        }
        int max =-1;
        char ch= '?';

        for(int i = 0; i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
                ch = (char)(i+65);
            }else if(max == arr[i]){
                ch='?';
            }
        }
        System.out.println(ch);
    }
}
