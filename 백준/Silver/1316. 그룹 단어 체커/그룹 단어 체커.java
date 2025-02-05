import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int count = n;

        for (int i = 0; i < n; i++) {
            int[] arr = new int[26];
            String str = br.readLine();
            int prev = 0;

            for (int j = 0; j < str.length(); j++) {
                int now = str.charAt(j);
                if (prev != now) {
                    if (arr[now - 97] == 0) {
                        arr[now - 97]++;
                        prev = now;
                    } else {
                        count--;
                        break;
                    }
                }
            }
        }
        bw.write(count + "\n");
        br.close();
        bw.close();
    }
}