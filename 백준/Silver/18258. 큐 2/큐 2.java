import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        LinkedList<Integer> queue = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            String command = input[0];
            switch (command) {
                case "push":
                    int x = Integer.parseInt(input[1]);
                    queue.add(x);
                    break;
                case "pop":
                    if (!queue.isEmpty()) {
                        bw.write(queue.remove() + "\n");
                    } else {
                        bw.write("-1\n");
                    }
                    break;
                case "size":
                    bw.write(queue.size() + "\n");
                    break;
                case "empty":
                    if (queue.isEmpty()) {
                        bw.write("1\n");
                    } else {
                        bw.write("0\n");
                    }
                    break;
                case "front":
                    if (!queue.isEmpty()) {
                        bw.write(queue.getFirst() + "\n");
                    } else {
                        bw.write("-1\n");
                    }
                    break;
                case "back":
                    if (!queue.isEmpty()) {
                        bw.write(queue.getLast() + "\n");
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
