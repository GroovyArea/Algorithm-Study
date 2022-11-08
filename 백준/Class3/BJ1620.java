package 백준.Class3;

import java.io.*;
import java.util.*;

public class BJ1620 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String, String> monsters = new HashMap<>();
        StringBuilder sb = new StringBuilder(m);

        for (int i = 1; i <= n; i++) {
            String monster = br.readLine();
            monsters.put(String.valueOf(i), monster);
            monsters.put(monster, String.valueOf(i));
        }

        for (int i = 0; i < m; i++) {
            String question = br.readLine();
            sb.append(monsters.get(question)).append('\n');
        }

        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }
}
