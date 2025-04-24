import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[][] xy = new String[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            xy[i][0] = st.nextToken();
            xy[i][1] = st.nextToken();
        }

        Arrays.sort(xy, new Comparator<String[]>() {
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0]) -Integer.parseInt(o2[0]);
            }
        });

        for (int i = 0; i < N; i++) {
            bw.write(xy[i][0] + " " + xy[i][1] + "\n");
        }

        bw.flush();
        bw.close();
    }
}
