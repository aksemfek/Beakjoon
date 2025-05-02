import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Integer.parseInt(st.nextToken());
        long b = Integer.parseInt(st.nextToken());
        bw.write(a * b / result(a, b) + "");


        bw.flush();
    }

    static long result(long a, long b) {
        long max = Math.max(a, b);
        long min = Math.min(a, b);

        if (min == 0) {
            return max;
        } else {
            return result(min, max % min);
        }
    }
}
