import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        List<Integer> arrList = new ArrayList<>();
        int sum = 0;
        for (int i = m; i <= n; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
                if (count > 2) {
                    break;
                }
            }
            if (count == 2) {
                sum += i;
                arrList.add(i);
            }
        }
        if (!arrList.isEmpty()) {
            bw.write(sum + "\n" + arrList.get(0));
        } else {
            bw.write("-1");
        }

        br.close();
        bw.close();
     }
}