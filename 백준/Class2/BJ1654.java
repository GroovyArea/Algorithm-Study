package 백준.Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ1654 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[] inputNumbers = new int[K];

        for (int i = 0; i < K; i++) {
            int maxLength = Integer.parseInt(br.readLine());
            inputNumbers[i] = maxLength;
        }

        Arrays.sort(inputNumbers);

        long min = 1;
        long max = inputNumbers[K - 1];
        long middle = 0;

        while (max >= min) {
            middle = (max + min) / 2;

            long sum = 0;

            for (int inputNumber : inputNumbers) {
                sum += inputNumber / middle;
            }

            if (sum >= N) {
                min = middle + 1;
            } else {
                max = middle - 1;
            }
        }
        System.out.println(max);
    }
}
