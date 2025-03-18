import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] ground;
    static boolean[][] bl;
    static int weight;
    static int height;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            weight = Integer.parseInt(st.nextToken());
            height = Integer.parseInt(st.nextToken());
            ground = new int[weight][height];
            bl = new boolean[weight][height];

            int k = Integer.parseInt(st.nextToken());
            for (int j = 0; j < k; j++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                ground[x][y] = 1;
            }

            int count = 0;

            for (int j = 0; j < weight; j++) {
                for (int h = 0; h < height; h++) {
                    if (ground[j][h] == 1 && !bl[j][h]) {
                        DFS(j, h);
                        count++;
                    }
                }
            }

            System.out.println(count);
        }
    }

    static void DFS (int j, int k) {
        bl[j][k] = true;
        int[] X = {0, 0, -1, +1};
        int[] Y = {-1, +1, 0, 0};

        for (int i = 0; i < 4; i++) {
            int x = j + X[i];
            int y = k + Y[i];
            if(x < 0 || x >= weight || y < 0 || y >= height){
                continue;
            }
            if(ground[x][y] == 1 & !bl[x][y]){
                DFS(x, y);
            }
        }
    }
}