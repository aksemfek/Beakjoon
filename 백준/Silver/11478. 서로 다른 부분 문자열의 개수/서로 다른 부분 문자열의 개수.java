import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String st = br.readLine();
        Set<String> set = new HashSet<>();

        for (int i = 0; i < st.length(); i++) {
            for (int j = i + 1; j <= st.length(); j++) {
                if (!set.contains(st.substring(i, j))) {
                    set.add(st.substring(i, j));
                }
            }

        }
        bw.write(set.size() + "");

        bw.flush();
        bw.close();
    }
}
