import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] fraction = br.readLine().split(" ");
        int n1 = Integer.parseInt(fraction[0]);
        int m1 = Integer.parseInt(fraction[1]);
        String[] fraction2 = br.readLine().split(" ");
        int n2 = Integer.parseInt(fraction2[0]);
        int m2 = Integer.parseInt(fraction2[1]);

        int x = n1 * m2 + n2 * m1;
        int y = m1 * m2;

        int divisor = result(x, y);

        bw.write(x / divisor + " " + y / divisor + "\n");


        bw.flush();
    }

    static int result(int x, int y) {
        int max = Math.max(x, y);
        int min = Math.min(x, y);

        if (min == 0) {
            return max;
        } else {
            return result(min, max % min);
        }
    }
}
