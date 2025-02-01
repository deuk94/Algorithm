import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] intArr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            intArr[i] = Integer.parseInt(st.nextToken());
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < intArr.length; i++) {
            if (max < intArr[i]) {
                max = intArr[i];
            }
        }

        double sum = 0;
        for (int i = 0; i < intArr.length; i++) {
            sum += (double)intArr[i] / max * 100;
        }


        double avg = (double)sum / n;
        bw.write(avg + "\n");
        br.close();
        bw.flush();
        bw.close();
    }
}