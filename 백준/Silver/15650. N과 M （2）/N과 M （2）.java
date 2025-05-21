import java.io.*;
import java.util.*;

public class Main {
    static  int n =0;
    static int m =0;
    static int[] result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        result = new int[m];

        backtrack(1,0);
    }

    static void backtrack(int start, int depth) {
        if (depth == m) {
            for (int i = 0; i < m; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = start; i <= n; i++) {
            result[depth] = i;
            backtrack(i + 1, depth + 1);
        }
    }
}
