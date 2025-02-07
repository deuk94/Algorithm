import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[][] cArr = new char[5][15];

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < cArr.length; i++) {
            String s = br.readLine();
            if (max < s.length()) {
                max = s.length();
            }
            for (int j = 0; j < s.length(); j++) {
                cArr[i][j] = s.charAt(j);
            }
        }

        for (int i = 0; i < max; i++) {
            for (int j = 0; j < cArr.length; j++) {
                if (cArr[j][i] == '\0') {
                    continue;
                }
                bw.write(cArr[j][i]);
            }
        }
        br.close();
        bw.close();
     }
}