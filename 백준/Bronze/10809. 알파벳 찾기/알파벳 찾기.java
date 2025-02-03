import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        char[] strArr = s.toCharArray();

        int[] arr = new int[26];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }

        for (int i = 0; i < strArr.length; i++) {
            if (arr[strArr[i] - 'a'] == -1) {
                arr[strArr[i] - 'a'] = i;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            bw.write(arr[i] + " ");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}