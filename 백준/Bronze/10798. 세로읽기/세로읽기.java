import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] str = new String[5];
        String str1 = "";
        int max = 0;

        for (int i = 0; i < 5; i++) {
            str[i] = scanner.nextLine();
        }

        for (String s : str) {
            if (max < s.length()) {
                max = s.length();
            }
        }

        for (int i = 0; i < max; i++) {
            for(String s : str){
                if(i<s.length()){
                    str1 += s.charAt(i);
                }
            }
        }
        System.out.println(str1);
    }
}