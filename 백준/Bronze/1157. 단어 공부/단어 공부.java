import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        s = s.toUpperCase();
        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 65]++;
        }

        int max = 0;
        char ch = '?';
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                ch = (char)(i + 65);
            } else if (max == arr[i]) {
                ch = '?';
            }
        }

        bw.write(ch);
        br.close();
        bw.close();
    }
}