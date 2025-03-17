import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static boolean[] bl;
    static List<Integer>[] arrList;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arrList = new ArrayList[n + 1];
        bl = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            arrList[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arrList[a].add(b);
            arrList[b].add(a);
        }

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (!bl[i]) {
                count++;
                DFS(i);
            }
        }
        bw.write(count + "");
        br.close();
        bw.close();
    }

    private static void DFS(int v) {
        if (bl[v]) {
            return;
        }
        bl[v] = true;
        for (int i : arrList[v]) {
            if (!bl[i]) {
                DFS(i);
            }
        }
    }
}