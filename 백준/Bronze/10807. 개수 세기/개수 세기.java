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
        String str = br.readLine();
        String[] strArr = str.split(" ");
        String v = br.readLine();

        int count = 0;
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals(v)) {
                count++;
            }
        }
        bw.write(Integer.toString(count));

        br.close();
        bw.flush();
        bw.close();
    }
}