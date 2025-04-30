import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write(a * b / result(a, b) + "\n");
        }

        bw.flush();
    }

    static int result(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);

        if (min == 0) {
            return max;
        } else {
            return result(min, max % min);
        }
    }
}
