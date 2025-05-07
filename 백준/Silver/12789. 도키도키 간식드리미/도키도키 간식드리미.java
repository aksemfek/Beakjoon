import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> jul = new Stack<>();

        String[] st = br.readLine().split(" ");
        
        for (int i = st.length - 1; i >= 0; i--) {
            stack.push(Integer.parseInt(st[i]));
        }

        boolean t = true;
        int i = 1;
        
        while (i <= N) {
            if (!stack.empty() && stack.peek() == i) {
                stack.pop();
                i++;
            } else if (!jul.isEmpty() && jul.peek() == i) {
                jul.pop();
                i++;
            } else if (!stack.empty()) {
                jul.push(stack.pop());
            } else {
                t = false;
                break;
            }
        }

        if (t) {
            bw.write("Nice\n");
        } else {
            bw.write("Sad" + "\n");
        }
        
        bw.flush();
        bw.close();
    }
}
