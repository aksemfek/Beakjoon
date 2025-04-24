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
        int[][] xy = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            xy[i][0] = Integer.parseInt(st.nextToken()); 
            xy[i][1] = Integer.parseInt(st.nextToken()); 
        }
        
        Arrays.sort(xy, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                if (a[0] != b[0]) {
                    return a[0] - b[0]; 
                } else {
                    return a[1] - b[1];
                }
            }
        });

        for (int i = 0; i < N; i++) {
            bw.write(xy[i][0] + " " + xy[i][1] + "\n");
        }
        
        bw.flush();
        bw.close();
    }
}
