import java.io.*;
import java.util.*;

public class Main {
    static  int n =0;
    static int m =0;
    static boolean[] visited = new boolean[n + 1]; // 사용한 숫자인지 체크
    static int[] result = new int[m];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        visited = new boolean[n + 1];
        result = new int[m];

        backtrack(0);
    }

    static void backtrack(int depth) {
        if (depth == m) {
            for (int i = 0; i < m; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                result[depth] = i;
                backtrack(depth + 1);
                visited[i] = false;
            }
        }
    }
}
