import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        long[] longArr = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            longArr[i] = longArr[i - 1] + sc.nextInt();
        }

        for (int k = 0; k < m; k++) {
            int i = sc.nextInt();
            int j = sc.nextInt();

            System.out.println(longArr[j] - longArr[i - 1]);
        }
    }
}