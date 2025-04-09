import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] arr = new int[input.length];
        for(int i = 0; i < T; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        int N = Integer.parseInt(br.readLine());

        int count = 0;

        for(int i = 0; i < T; i++) {
            if(arr[i] == N) {
                count++;
            }
        }
        System.out.println(count);



        bw.flush();
        bw.close();


    }
}
