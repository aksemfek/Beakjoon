import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] st = br.readLine().split(" ");

        int N = Integer.parseInt(st[0]);
        int K = Integer.parseInt(st[1]);
        LinkedList<Integer> queue = new LinkedList();

        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }
        bw.write( "<");

        while (queue.size() != 1) {
            for(int i =0; i < K-1; i++) {
                queue.add(queue.removeFirst());
            }
            bw.write(queue.removeFirst() + ", ");
        }
        bw.write(queue.removeFirst() + ">");

        bw.flush();
        bw.close();
    }
}
