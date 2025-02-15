import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str;

        while((str = br.readLine()) != null && !str.isEmpty()) {
            bw.write(str + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}