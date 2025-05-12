import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Set<String> set1 = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set1.add(br.readLine());
        }

        Set<String> set2 = new HashSet<>();
        for (int i = 0; i < m; i++) {
            String record = br.readLine();
            if (set1.contains(record)) {
                set2.add(record);
            }
        }
        
        List<String> result = new ArrayList<>(set2);
        Collections.sort(result);

        bw.write(result.size() + "\n");
        for (String s : result) {
            bw.write(s + "\n");
        }

        bw.flush();
        bw.close();
    }
}
