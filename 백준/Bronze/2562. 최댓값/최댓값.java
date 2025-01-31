import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] intArr = new int[9];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = Integer.parseInt(br.readLine());
        }

        int max = Integer.MIN_VALUE;
        int idx = 0;
        for (int i = 0 ; i < intArr.length; i++) {
            if (max < intArr[i]) {
                max = intArr[i];
                idx = i + 1;
            }
        }
        bw.write(max + "\n" + idx);

        br.close();
        bw.flush();
        bw.close();
    }
}