package 백준.Class2;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class BJ10866 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Deque<Integer> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String input = st.nextToken();

            if ("push_front".equals(input)) {
                int inputNumber = Integer.parseInt(st.nextToken());
                deque.addFirst(inputNumber);
            } else if ("push_back".equals(input)) {
                int inputNumber = Integer.parseInt(st.nextToken());
                deque.addLast(inputNumber);
            } else if ("pop_front".equals(input)) {
                if (deque.isEmpty()) {
                    sb.append("-1\n");
                } else {
                    sb.append(deque.pollFirst()).append("\n");
                }
            } else if ("pop_back".equals(input)) {
                if (deque.isEmpty()) {
                    sb.append("-1\n");
                } else {
                    sb.append(deque.pollLast()).append("\n");
                }
            } else if ("size".equals(input)) {
                sb.append(deque.size()).append("\n");
            } else if ("empty".equals(input)) {
                if (deque.isEmpty()) sb.append("1\n");
                else sb.append("0\n");
            } else if ("front".equals(input)) {
                if (deque.isEmpty()) sb.append("-1\n");
                else sb.append(deque.peekFirst()).append("\n");
            } else if ("back".equals(input)) {
                if (deque.isEmpty()) sb.append("-1\n");
                else sb.append(deque.peekLast()).append("\n");
            }
        }
        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }
}
