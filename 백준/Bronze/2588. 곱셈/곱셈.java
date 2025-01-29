import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        String b = st.nextToken();
        String[] strArr = b.split("");

        for (int i = strArr.length - 1; i >= 0; i--) {
            System.out.println(a * Integer.parseInt(strArr[i]));
        }

        System.out.println(a * Integer.parseInt(b));
    }
}