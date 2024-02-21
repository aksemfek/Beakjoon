import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[26];
        String s = scanner.nextLine();
        for(int i=0; i<26; i++){
            arr[i]= -1;
        }

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(arr[ch -'a']==-1){
                arr[ch -'a']=i;
            }
        }

        for(int d: arr){
            System.out.print(d+ " ");
        }
    }
}