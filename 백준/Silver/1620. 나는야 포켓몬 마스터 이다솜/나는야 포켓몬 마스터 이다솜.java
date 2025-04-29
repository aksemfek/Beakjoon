import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<Integer, String> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            String poketmon = br.readLine();
            map1.put(i, poketmon);
            map2.put(poketmon, i);
        }
        
        for (int i = 1; i <= M; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            boolean isNumeric = s.matches("[+-]?\\d*(\\.\\d+)?");
            if (isNumeric) {
                bw.write(map1.get(Integer.parseInt(s)) + " \n");
            } else {
                bw.write(map2.get(s) + " \n");
            }
        }

        bw.flush();
        
    }
}
