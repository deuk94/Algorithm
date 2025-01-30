import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String s = st.nextToken();

        st = new StringTokenizer(br.readLine());
        int q = Integer.parseInt(st.nextToken());

        for (int i = 0; i < q; i++) {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            String[] strArr = s.substring(start, end + 1).split("");
            int count = 0;
            for (int j = 0; j < strArr.length; j++) {
                if (strArr[j].equals(str)) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}