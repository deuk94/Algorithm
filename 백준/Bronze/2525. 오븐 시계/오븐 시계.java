import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int c = Integer.parseInt(st.nextToken());

        if (b + c >= 60) {
            a += (b + c) / 60;
            b = (b + c) % 60;
        } else {
            b += c;
        }

        if (a >= 24) {
            a -= 24;
        }
        System.out.print(a + " " + b);
    }
}