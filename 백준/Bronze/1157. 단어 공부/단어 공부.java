import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine().toUpperCase();
        int[] wordCount = new int[26];

        for (int i = 0; i < word.length(); i++) {
            wordCount[word.charAt(i) - 'A']++;
        }

        int max = 0;
        char result = '?';

        for (int i = 0; i < wordCount.length; i++) {
            if (wordCount[i] > max) {
                max = wordCount[i];
                result = (char) ('A' + i);
            } else if (max == wordCount[i]) {
                result = '?';
            }
        }

        bw.write(result);
        bw.flush();
        bw.close();
    }
}
