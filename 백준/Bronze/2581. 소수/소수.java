import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int sum = 0;
        int min = M;
        for (int i = N; i <= M; i++) {

            if (i == 1) continue;

            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {

                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                sum += i;
                if (min > i) {
                    min = i;
                }
            }
        }
        if (sum != 0) {
            bw.write(sum + "\n" + min + "\n");
        } else {
            bw.write("-1\n");
        }
        bw.flush();
        bw.close();
    }
}
