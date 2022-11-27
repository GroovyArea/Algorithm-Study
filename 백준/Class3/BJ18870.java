package 백준.Class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BJ18870 {

    static int[] inputNumbers;
    static int[] sortedNumbers;
    static Map<Integer, Integer> map = new HashMap<>();
    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int n = Integer.parseInt(br.readLine());

        inputNumbers = new int[n];
        sortedNumbers = new int[n];

        solution(n);

        System.out.println(sb);
    }

    static void solution(int n) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < n; i++) {
            inputNumbers[i] = sortedNumbers[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(sortedNumbers);

        int index = 0;

        for (int i : sortedNumbers) {
            if (!map.containsKey(i)) {
                map.put(i, index);
                index++;
            }
        }

        for (int i : inputNumbers) {
            sb.append(map.get(i)).append(" ");
        }
    }
}
