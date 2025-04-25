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

        int[] compression = Arrays.copyOf(C, N);
        Arrays.sort(compression);

        Map<Integer, Integer> map = new HashMap<>();
        int rank = 0;
        for (int i = 0; i < N; i++) {
            if (!map.containsKey(compression[i])) {
                map.put(compression[i], rank++);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(map.get(C[i])).append(" ");
        }

        System.out.println(sb);
    }

}
