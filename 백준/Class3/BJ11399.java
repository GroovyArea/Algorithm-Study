package 백준.Class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * ATM
 */
public class BJ11399 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] minutes = new int[n];

        for (int i = 0; i < n; i++) {
            minutes[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(minutes);

        int sum = 0;
        int partSum = 0;
        for (int i = 0; i < n; i++) {
            partSum += minutes[i];
            sum += partSum;
        }

        System.out.println(sum);
    }
}
