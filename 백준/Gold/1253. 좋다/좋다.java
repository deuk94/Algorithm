import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        long[] arr = new long[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < n; i++) {
            long find = arr[i];
            int start = 0;
            int end = n - 1;
            while (start < end) {
                if (arr[start] + arr[end] == find) {
                    if (i != start && i != end) {
                        count++;
                        break;
                    } else if (start == i) {
                        start++;
                    } else {
                        end--;
                    }
                } else if (arr[start] + arr[end] < find) {
                    start++;
                } else {
                    end--;
                }
            }
        }
        bw.write(count + "");
        br.close();
        bw.close();
    }
}