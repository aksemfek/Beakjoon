import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());


        StringTokenizer st = new StringTokenizer(br.readLine());
        double[] arr = new double[N];

        for(int i = 0; i < N; i++) {
            arr[i] = Double.parseDouble(st.nextToken());
        }

        Arrays.sort(arr);

        for(int i = 0; i < N; i++) {
            arr[i] = (arr[i] / arr[N-1]) * 100.0;
        }

        double sum =0;

        for(int i = 0; i < N; i++) {
            sum += arr[i];
        }

        bw.write(sum/N + "\n");

        bw.flush();
        bw.close();


    }
}
