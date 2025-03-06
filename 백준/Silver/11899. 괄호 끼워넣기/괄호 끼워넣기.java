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

        String[] s = br.readLine().split("");
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < s.length; i++) {
            if (stack.isEmpty()) {
                stack.push(s[i]);
            } else {
                if (stack.peek().equals("(") && s[i].equals(")")) {
                    stack.pop();
                } else {
                    stack.push(s[i]);
                }
            }
        }
        bw.write(stack.size() + "\n");
        br.close();
        bw.close();
    }
}