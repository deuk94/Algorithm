import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            int count = 0;
            int a = Integer.parseInt(st.nextToken());
            for (int j = 1; j <= a; j++) {
                if (a % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                cnt++;
            }
        }
        bw.write(cnt + "");
        br.close();
        bw.close();
     }
}