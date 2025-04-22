import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String N[] = br.readLine().split(" ");

        int A = Integer.parseInt(N[0]);
        int B = Integer.parseInt(N[1]);
        int V = Integer.parseInt(N[2]);
        
        int day = (V-B)/(A-B);

        if((V-B)%(A-B) != 0){
            day++;
        }
        
        bw.write(day + "\n");

        bw.flush();
        bw.close();
    }
}
