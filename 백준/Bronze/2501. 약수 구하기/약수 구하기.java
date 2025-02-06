import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        List<Integer> arrList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0)  {
                arrList.add(i);
            }
        }
        if (arrList.size() >= k) {
            bw.write(arrList.get(k - 1) + "\n");
        } else {
            bw.write("0");
        }
        br.close();
        bw.close();
    }
}