import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count =0;
        int n= scanner.nextInt();

        for(int i = 0; i < n ; i++){
            for(int j = 0; j < n; j++){
                if(i==j){
                    continue;
                }else{
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}