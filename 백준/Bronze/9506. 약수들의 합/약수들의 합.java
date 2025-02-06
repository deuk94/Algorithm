import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            List<Integer> arrList = new ArrayList<>();
            int n = Integer.parseInt(br.readLine());
            if (n == -1) {
                break;
            }
            int sum = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    arrList.add(i);
                    sum += i;
                }
            }
            if (sum == n) {
                bw.write(n + " = ");
                for (int i = 0; i < arrList.size(); i++) {
                    bw.write(arrList.get(i) + "");
                    if (i < arrList.size() - 1) {
                        bw.write(" + ");
                    }
                }
            } else {
                bw.write(n + " is NOT perfect.");
            }
            bw.write("\n");
        }
        br.close();
        bw.close();
    }
}