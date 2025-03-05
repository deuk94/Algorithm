import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
    public  static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            Stack<String> stack = new Stack<>();
            String[] str = br.readLine().split("");
            for (int j = 0; j < str.length; j++) {
                if (str[j].equals("(")) {
                    stack.push(str[j]);
                } else {
                    if (stack.isEmpty()) {
                        stack.push(str[j]);
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }
            if (stack.isEmpty()) {
                bw.write("YES\n");
            } else {
                bw.write("NO\n");
            }
        }
        br.close();
        bw.close();
    }
}