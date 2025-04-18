import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String palworld = br.readLine();
        String reverse = "";

        for (int i = palworld.length() - 1; i >= 0; i--) {
            reverse += palworld.charAt(i);
        }

        if (palworld.equals(reverse)) {
            bw.write("1");
        } else {
            bw.write("0");
        }
        
        bw.flush();
        bw.close();
    }
}
