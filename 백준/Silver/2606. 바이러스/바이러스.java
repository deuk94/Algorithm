import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static List<Integer>[] arrList;
    static boolean[] bl;
    static int count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        arrList = new ArrayList[n + 1];
        bl = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            arrList[i] = new ArrayList<Integer>();
        }
        StringTokenizer st;
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arrList[a].add(b);
            arrList[b].add(a);
        }

        count = 0;
        DFS(1);
        System.out.println(count);
    }

    static void DFS (int v) {
        if (bl[v]) {
            return;
        }
        bl[v] = true;
        for (int i : arrList[v]) {
            if (!bl[i]) {
                count++;
                DFS(i);
            }
        }
    }
}