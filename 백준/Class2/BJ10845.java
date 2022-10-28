package 백준.Class2;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ10845 {

    public static void main(String[] args) throws IOException {
        Queue<Integer> q = new LinkedList();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int pushedNumber = 0;

        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String input = st.nextToken();

            if ("push".equals(input)) {
                int inputNumber = Integer.parseInt(st.nextToken());
                q.add(inputNumber);
                pushedNumber = inputNumber;
            } else if ("pop".equals(input)) {
                if (q.isEmpty()) {
                    sb.append("-1\n");
                } else {
                    sb.append(q.remove()).append("\n");
                }
            } else if ("size".equals(input)) {
                sb.append(q.size()).append("\n");
            } else if ("empty".equals(input)) {
                if (q.isEmpty()) sb.append("1\n");
                else sb.append("0\n");
            } else if ("front".equals(input)) {
                if (q.isEmpty()) sb.append("-1\n");
                else sb.append(q.peek()).append("\n");
            } else if ("back".equals(input)) {
                if (q.isEmpty()) sb.append("-1\n");
                else sb.append(pushedNumber).append("\n");
            }
        }
        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }
}
