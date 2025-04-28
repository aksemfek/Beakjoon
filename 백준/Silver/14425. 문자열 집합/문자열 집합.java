import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[] A = new String[N];
        for (int i = 0; i < N; i++) {
            A[i] = br.readLine();
        }

        String[] B = new String[M];
        for (int i = 0; i < M; i++) {
            B[i] = br.readLine();
        }

        int count = 0;

        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(A[i]);
        }

        for (int i = 0; i < M; i++) {
            if (set.contains(B[i])) {
                count++;
            }
        }
        bw.write( count + "\n");
        bw.flush();

    }
}
