package 백준.Class3;

import java.io.*;
import java.util.*;

public class BJ1764 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String, Integer> 명단 = new HashMap<>();
        List<String> 듣보잡들 = new ArrayList<>(); // 듣보잡 애들 담는 리스트

        for (int i = 0; i < n; i++) {
            명단.put(br.readLine(), 1);
        }

        for (int i = 0; i < m; i++) {
            String name = br.readLine();
            명단.put(name, 명단.getOrDefault(name, 0) + 1); // 키는 중복이 안된다. 덮어 씌우기만 될 뿐, 중복이 일 때 값에 1을 더해서 2로 반든다.

            if (명단.get(name) == 2) { // 듣도 보도 못한 사람일 경우
                듣보잡들.add(name);
            }
        }

        Collections.sort(듣보잡들);

        StringBuilder sb = new StringBuilder();
        sb.append(듣보잡들.size()).append('\n');

        for (String s : 듣보잡들) {
            sb.append(s).append('\n');
        }

        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }
}
