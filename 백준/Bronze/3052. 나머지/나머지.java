import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] arr = new boolean[42];

        for (int i = 0; i < 10; i++) {
            int a = Integer.parseInt(br.readLine()) % 42;
            arr[a] = true;
        }

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]) {
                count++;
            }
        }

        bw.write(count + "\n");
        br.close();
        bw.flush();
        br.close();
    }
}