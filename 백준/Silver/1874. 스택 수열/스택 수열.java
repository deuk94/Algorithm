import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Stack<Integer> stack = new Stack<>();
        int num = 1;
        StringBuffer bf = new StringBuffer();
        boolean bl = true;
        for (int i = 0; i < n; i++) {
            int a = arr[i];
            if (a >= num) {
                while(a >= num) {
                    stack.push(num++);
                    bf.append("+\n");
                }
                stack.pop();
                bf.append("-\n");
            } else {
                int num1 = stack.pop();
                if (num1 > a) {
                    bw.write("NO\n" );
                    bl = false;
                    break;
                } else {
                    bf.append("-\n");
                }
            }
        }
        if (bl) {
            bw.write(bf.toString());
        }
        br.close();
        bw.close();
    }
}