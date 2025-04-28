import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String el = st.nextToken();

            if(el.equals("enter")){
                set.add(name);
            } else if (el.equals("leave")) {
                set.remove(name);

            }
        }

        List<String> list = new ArrayList<>(set);
        list.sort(Collections.reverseOrder());

        for (String name : list) {
            bw.write(name + "\n");
        }

        bw.flush();


    }
}
