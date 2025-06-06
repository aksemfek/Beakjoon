import java.io.*;
import java.util.*;

public class Main {
    static int n = 0;
    static int m = 0;
    static int[] result;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        result = new int[m];

        backtrack(0);
        System.out.println(sb);
    }

    static void backtrack(int depth) {
        if (depth == m) {
            for (int i = 0; i < m; i++) {
                sb.append(result[i] + " ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 1; i <= n; i++) {
            result[depth] = i;
            backtrack(depth + 1);
        }
    }
}

