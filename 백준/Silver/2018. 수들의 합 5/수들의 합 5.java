import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int sum = 1;
        int start = 1;
        int end = 1;
        int count = 1;

        while (end != n) {
            if (sum < n) {
                end++;
                sum += end;
            } else if (sum == n) {
                count++;
                end++;
                sum += end;
            } else {
                sum -= start;
                start++;
            }
        }

        bw.write(count + "\n");
        br.close();
        bw.close();
    }
}