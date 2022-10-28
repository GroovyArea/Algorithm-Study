package 백준.Class2;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class BJ10828 {

    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String input = st.nextToken();

            if ("push".equals(input)) {
                int inputNumber = Integer.parseInt(st.nextToken());
                stack.add(inputNumber);
            } else if ("pop".equals(input)) {
                if (stack.isEmpty()) {
                    sb.append("-1\n");
                } else {
                    sb.append(stack.pop()).append("\n");
                }
            } else if ("size".equals(input)) {
                sb.append(stack.size()).append("\n");
            } else if ("empty".equals(input)) {
                if (stack.isEmpty()) sb.append("1\n");
                else sb.append("0\n");
            } else if ("top".equals(input)) {
                if (stack.isEmpty()) sb.append("-1\n");
                else sb.append(stack.peek()).append("\n");
            }
        }
        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }
}
