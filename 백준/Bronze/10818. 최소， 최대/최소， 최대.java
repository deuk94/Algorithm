import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        String[] strArr = str.split(" ");

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < strArr.length; i++) {
            int a = Integer.parseInt(strArr[i]);
            if (max < a) {
                max = a;
            }
            if (min > a) {
                min = a;
            }
        }

        bw.write(min + " " + max);

        br.close();
        bw.flush();
        bw.close();
    }
}