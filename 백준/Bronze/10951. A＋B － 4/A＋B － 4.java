import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        String st;
        while((st=br.readLine()) != null){
            int a = Integer.parseInt(st.split(" ")[0]);
            int b = Integer.parseInt(st.split(" ")[1]);
            bw.write(a+b+"\n");
        }
        bw.flush();
    }
}