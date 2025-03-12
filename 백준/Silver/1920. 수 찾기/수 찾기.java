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
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            boolean find = false;
            int x = Integer.parseInt(st.nextToken());

            int start = 0;
            int end = n - 1;
            while (start <= end) {
                int mid = (start + end) / 2;
                if (arr[mid] > x) {
                    end = mid - 1;
                } else if (arr[mid] < x) {
                    start = mid + 1;
                } else {
                    find = true;
                    break;
                }
            }

            if (find) {
                bw.write("1\n");
            } else {
                bw.write("0\n");
            }
        }

        br.close();
        bw.close();
    }
}