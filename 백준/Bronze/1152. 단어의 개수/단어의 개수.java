import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String S = br.readLine();

        if (S.trim().equals("")) {
            bw.write("0");
        } else {
            String[] arr = S.trim().split("\\s+");
            bw.write(arr.length + "");
        }

        bw.flush();
        bw.close();
    }
}
