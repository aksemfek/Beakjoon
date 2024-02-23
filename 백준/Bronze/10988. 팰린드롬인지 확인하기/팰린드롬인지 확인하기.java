import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String palindrome = scanner.nextLine();
        String reverse = "";

        for(int i=palindrome.length()-1 ;i>=0; i--){
            reverse += palindrome.charAt(i);
        }

        if(palindrome.equals(reverse)){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }
}