import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            int command = Integer.parseInt(input[0]);

            switch (command) {
                case 1:
                    int k = Integer.parseInt(input[1]);
                    deque.addFirst(k);
                    break;
                case 2:
                    int x = Integer.parseInt(input[1]);
                    deque.addLast(x);
                    break;
                case 3:
                    if (!deque.isEmpty()) {
                        bw.write(deque.removeFirst() + "\n");
                    } else {
                        bw.write("-1\n");
                    }
                    break;
                case 4:
                    if (!deque.isEmpty()) {
                        bw.write(deque.removeLast() + "\n");
                    } else {
                        bw.write("-1\n");
                    }
                    break;
                case 5:
                    bw.write(deque.size() + "\n");
                    break;
                case 6:
                    if (!deque.isEmpty()) {
                        bw.write("0\n");
                    } else {
                        bw.write("1\n");
                    }
                    break;
                case 7:
                    if (!deque.isEmpty()) {
                        bw.write(deque.getFirst() + "\n");
                    } else {
                        bw.write("-1\n");
                    }
                    break;
                case 8:
                    if (!deque.isEmpty()) {
                        bw.write(deque.getLast() + "\n");
                    } else {
                        bw.write("-1\n");
                    }
                    break;
            }
        }

        bw.flush();
        bw.close();
    }
}
