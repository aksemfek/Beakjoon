import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < N; i++) {
            int k = Integer.parseInt(br.readLine());
            if (k == 0) {
                stack.pop();
            } else {
                stack.push(k);
            }
        }
        if (stack.empty()) {
            bw.write("0\n");
        } else {
            int sum = 0;
            while (!stack.isEmpty()) {
                sum += stack.pop();
            }
            bw.write(sum+"");
        }
        bw.flush();
        bw.close();
    }
}
