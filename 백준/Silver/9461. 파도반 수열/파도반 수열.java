import java.io.*;
import java.util.*;

public class Main {

    static long[] p = new long[101];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        p[1] = 1;
        p[2] = 1;
        p[3] = 1;

        for (int i = 4; i <= 100; i++) {
            p[i] = p[i - 2] + p[i - 3];
        }

        for (int i = 0; i < n; i++) {
            int N = Integer.parseInt(br.readLine());
            bw.write(p[N] + "\n");
        }
        
        bw.flush();
        bw.close();
    }
}
