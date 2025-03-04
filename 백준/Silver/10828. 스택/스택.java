import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            if (str.equals("push")) {
                int num = Integer.parseInt(st.nextToken());
                stack.push(num);
            } else if (str.equals("top")) {
                if (stack.empty() ) {
                    bw.write("-1\n");
                } else {
                    bw.write(stack.peek() + "\n");
                }
            } else if (str.equals("size")) {
                bw.write(stack.size() + "\n");
            } else if (str.equals("empty")) {
                if (stack.empty()) {
                    bw.write("1\n");
                } else {
                    bw.write("0\n");
                }
            } else {
                if (stack.empty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(stack.pop() + "\n");
                }
            }
        }
        br.close();
        bw.close();
    }
}