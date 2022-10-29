package 백준.Class2;

import java.io.*;
import java.util.*;

public class BJ1920 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Set<String> numbers1 = new HashSet<>();

        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            String token = st.nextToken();
            numbers1.add(token);
        }

        int M = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++) {
            String token = st.nextToken();
            if (numbers1.contains(token)) {
                sb.append(1).append('\n');
            } else {
                sb.append(0).append('\n');
            }
        }

        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }
}
