import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for (int n = 0; n < T; n++) {
            String[] input = br.readLine().split(" ");
            int number = Integer.parseInt(input[0]);
            String word = input[1];
            String result = "";
            for (int i = 0; i < word.length(); i++) {
                for (int j = 0; j < number; j++) {
                    result = result + word.charAt(i);
                }
            }
            bw.write(result +"\n");
            bw.flush();
        }




        bw.flush();
        bw.close();
    }
}
