package 백준.Class3;

import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

/**
 * 집합
 */
public class BJ11723 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Set<Integer> numbers = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        int m = Integer.parseInt(br.readLine());

        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String calculation = st.nextToken();

            int number = 0;

            switch (calculation) {
                case "add":
                    number = Integer.parseInt(st.nextToken());
                    numbers.add(number);
                    break;
                case "remove":
                    number = Integer.parseInt(st.nextToken());
                    numbers.remove(number);
                    break;
                case "check":
                    number = Integer.parseInt(st.nextToken());

                    if (numbers.contains(number)) {
                        sb.append("1\n");
                    } else {
                        sb.append("0\n");
                    }
                    break;
                case "toggle":
                    number = Integer.parseInt(st.nextToken());
                    if (numbers.contains(number)) {
                        numbers.remove(number);
                    } else {
                        numbers.add(number);
                    }
                    break;
                case "all":
                    for (int j = 0; j < 20; j++) {
                        numbers.add(j + 1);
                    }
                    break;
                case "empty":
                    numbers.clear();
                    break;
            }
        }

        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();
    }
}
