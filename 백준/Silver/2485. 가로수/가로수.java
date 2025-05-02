import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] tree = new int[n];
        for (int i = 0; i < n; i++) {
            tree[i] = Integer.parseInt(br.readLine());
        }

        int[] interval = new int[n-1];
        for (int i = 0; i < n - 1; i++) {
            interval[i] = tree[i + 1] - tree[i];
        }
        int result = interval[0];
        for (int i = 1; i < interval.length; i++) {
            result = result(result, interval[i]);

        }
        int count = 0;
        for (int i = 0; i < interval.length; i++) {
            count += interval[i]/result-1;
        }

        bw.write(count + "");
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
