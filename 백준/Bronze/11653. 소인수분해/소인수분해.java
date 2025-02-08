import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        if (n == 1) {
            bw.write("");
        } else {
            List<Integer> arrList = new ArrayList<>();

            for (int i = 2; i <= Math.sqrt(n); i++) {
                while (n % i == 0) {
                    arrList.add(i);
                    n /= i;
                }
            }

            if (n > 1) {
                arrList.add(n);
            }
            
            for (int i = 0; i < arrList.size(); i++) {
                bw.write(arrList.get(i) + "\n");
            }
        }


        br.close();
        bw.close();
    }
}