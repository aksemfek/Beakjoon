import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        String[] arr = br.readLine().split(" ");
        int[] C = new int[N];
        for (int i = 0; i < arr.length; i++) {
            C[i] = Integer.parseInt(arr[i]);
        }

        int M = Integer.parseInt(br.readLine());

        String[] arr2 = br.readLine().split(" ");
        int check[] = new int[M];
        for (int i = 0; i < arr2.length; i++) {
            check[i] = Integer.parseInt(arr2[i]);
        }
        int[] answer = new int[M];

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(C[i]);
        }

        for (int j = 0; j < M; j++) {
            if (set.contains(check[j])) {
                answer[j] = 1;
            } else {
                answer[j] = 0;
            }
        }
        
        for (int i = 0; i < M; i++) {
            bw.write(answer[i] + " ");
        }
        
        bw.flush();
        bw.close();
    }
}
