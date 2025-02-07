import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[][] bl = new boolean[101][101];
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        StringTokenizer st;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            for (int j = a; j < a + 10; j++) {
                for (int k = b; k < b + 10; k++) {
                    if (!bl[j][k]) {
                        bl[j][k] = true;
                        sum++;
                    }
                }
            }
        }
        bw.write(sum + "");
        br.close();
        bw.close();
     }
}