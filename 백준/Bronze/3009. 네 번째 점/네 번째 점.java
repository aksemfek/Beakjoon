import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);

        int[] a = {scanner.nextInt(), scanner.nextInt()};
        int[] b = {scanner.nextInt(), scanner.nextInt()};
        int[] c = {scanner.nextInt(), scanner.nextInt()};
        int[] d = new int[2];

        if(a[0]==b[0]){
            d[0] =c[0];
        } else if (a[0]==c[0]) {
            d[0] = b[0];
        }else{
            d[0] = a[0];
        }

        if(a[1]==b[1]){
            d[1] =c[1];
        } else if (a[1]==c[1]) {
            d[1] = b[1];
        }else{
            d[1] = a[1];
        }

        System.out.println(d[0] + " " + d[1]);
    }
}
