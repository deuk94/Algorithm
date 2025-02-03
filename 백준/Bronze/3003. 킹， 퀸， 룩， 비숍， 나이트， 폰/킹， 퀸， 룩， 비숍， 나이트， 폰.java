import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = {1, 1, 2, 2, 2, 8};
        int[] arr1 = new int[6];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr[i] == arr1[i]) {
                arr[i] = 0;
                bw.write(arr[i] + " ");
            } else {
                arr[i] = arr[i] - arr1[i];
                bw.write(arr[i] + " ");
            }
        }
        br.close();
        bw.close();
    }
}