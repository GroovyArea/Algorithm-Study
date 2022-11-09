package 백준.Class3;

import java.io.*;

public class BJ1003 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        int[] numbers = new int[41];
        StringBuilder sb = new StringBuilder();

        numbers[1] = 1;

        for (int i = 2; i <= 40; i++) {
            numbers[i] = numbers[i - 2] + numbers[i - 1];
        }

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());

            if (n == 0) {
                sb.append("1 0\n");
                continue;
            }

            sb.append(numbers[n - 1]).append(" ").append(numbers[n]).append('\n');
        }

        System.out.print(sb);
    }
}
