import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String a = st.nextToken();
        String b = st.nextToken();

        String strA = "";
        String strB = "";

        for (int i = a.length() - 1; i >= 0; i--) {
            strA += a.charAt(i);
        }

        for (int i = b.length() - 1; i >= 0; i--) {
            strB += b.charAt(i);
        }

        int intA = Integer.parseInt(strA);
        int intB = Integer.parseInt(strB);
        bw.write(Math.max(intA, intB) + "");

        br.close();
        bw.flush();
        bw.close();
    }
}