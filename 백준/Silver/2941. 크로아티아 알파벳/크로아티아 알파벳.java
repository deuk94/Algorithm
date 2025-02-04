import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] cr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String str = br.readLine();

        for (int i = 0; i < cr.length; i++) {
            if (str.contains(cr[i])) {
                str = str.replace(cr[i], "@");
            }
        }

        bw.write(str.length() + "\n");
        br.close();
        bw.close();
    }
}