package 백준.Class2;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BJ10814 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int number = Integer.parseInt(br.readLine());
        String[][] members = new String[number][2];

        for (int i = 0; i < number; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            members[i][0] = st.nextToken(); // 나이
            members[i][1] = st.nextToken();
        }

        Arrays.sort(members, Comparator.comparingInt(o -> Integer.parseInt(o[0])));

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < number; i++) {
            sb.append(members[i][0]).append(' ').append(members[i][1]).append('\n');
        }

        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
        br.close();
    }
}
