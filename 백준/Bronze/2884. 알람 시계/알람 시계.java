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

        if (b - 45 < 0) {
            a--;
            b = 60 + (b - 45);
            if (a < 0) {
                a = 23;
            }
        } else {
            b = b - 45;
        }

        System.out.print(a + " ");
        System.out.print(b);
    }
}