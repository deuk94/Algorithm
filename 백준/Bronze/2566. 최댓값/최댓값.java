import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int[][] arr = new int[9][9];
        int max = Integer.MIN_VALUE;
        int a = 0;
        int b = 0;

        for (int i = 0; i < arr.length; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < arr.length; j++) {
                int n = Integer.parseInt(st.nextToken());
                arr[i][j] = n;
                if (max < arr[i][j]) {
                    max = arr[i][j];
                    a = i + 1;
                    b = j + 1;
                }
            }
        }
        bw.write(max + "\n" + a + " " + b);
        br.close();
        bw.close();
    }
}