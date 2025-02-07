import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int a = 2;

        for (int i = 0; i < n; i++) {
            a = ((a * 2) - 1 );
        }

        bw.write(a * a + "");
        br.close();
        bw.close();
     }
}