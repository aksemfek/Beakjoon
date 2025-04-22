import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        String[] numbers = br.readLine().split(" ");

        int count = 0;

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(numbers[i]);

            if (num == 1) continue;

            boolean isPrime = true;

            for (int j = 2; j <= Math.sqrt(num); j++) {

                if (num % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
            }
        }

        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }
}
