import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();
        int count = 0;

        for (int i = 0; i < N; i++) {
            String record = br.readLine();

            if (record.equals("ENTER")) {
                set.clear();  // 새로운 세션 시작
            } else if (!set.contains(record)) {
                set.add(record);  // 처음 보는 유저면 곰곰티콘 사용
                count++;
            }
        }


        bw.write(count + "\n");

        bw.flush();
        bw.close();
    }
}
