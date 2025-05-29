import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); 
        StringTokenizer st = new StringTokenizer(br.readLine());

        Deque<int[]> deque = new ArrayDeque<>();

        
        for (int i = 1; i <= n; i++) {
            int move = Integer.parseInt(st.nextToken());
            deque.add(new int[] {i, move});
        }

        StringBuilder sb = new StringBuilder();

        while (!deque.isEmpty()) {
            int[] current = deque.pollFirst();  
            int idx = current[0];
            int move = current[1];
            sb.append(idx).append(" ");

            if (deque.isEmpty()) break;

            if (move > 0) {
                for (int i = 0; i < move - 1; i++) {
                    deque.addLast(deque.pollFirst());
                }
            } else {
                for (int i = 0; i < Math.abs(move); i++) {
                    deque.addFirst(deque.pollLast());
                }
            }
        }
        System.out.println(sb.toString().trim());
    }
}
