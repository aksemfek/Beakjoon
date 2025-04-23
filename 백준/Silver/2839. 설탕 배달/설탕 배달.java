import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int suc = -1;
        for (int i = N / 5; i >= 0; i--) {
            int remain = N - (i * 5);
            if (remain % 3 == 0) {
                suc = i + (remain / 3);
                break;
            }
        }

        bw.write(suc + "\n");


        bw.flush();
        bw.close();
    }
}
