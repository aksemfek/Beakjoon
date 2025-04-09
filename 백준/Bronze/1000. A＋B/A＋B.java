import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int n1 = Integer.parseInt(input[0]);
        int n2 = Integer.parseInt(input[1]);

        bw.write(String.valueOf(n1+n2));
        bw.flush();
        bw.close();


    }
}
