import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int n1 = Integer.parseInt(input[0]);
        int n2 = Integer.parseInt(input[1]);
        int n3 = Integer.parseInt(br.readLine());

        int seconds = (n2+n3)/60;
        int minutes = (n2+n3)%60;
        int hours = n1+ seconds;

        if(hours>23){
            hours= hours-24;
        }
        bw.write(hours + " " + minutes);

        bw.flush();
        bw.close();


    }
}
